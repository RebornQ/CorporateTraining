package com.mallotec.reb.corporatetraining.controller;

import com.mallotec.reb.corporatetraining.pojo.Result;
import com.mallotec.reb.corporatetraining.util.ResultUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/file")
@EnableAutoConfiguration
public class FileUploadController {

    // 获取文件存储路径
    @Value("${file.upload-path}")
    private String filePath;

    /* 通过流的方式上传文件
     * @RequestParam("file") 将name=file控件得到的文件封装成CommonsMultipartFile 对象
     */
    @RequestMapping("/upload")
    @ResponseBody
    public Object fileUpload(HttpServletRequest req, HttpServletResponse httpServletResponse) throws IOException {

        File resourceFiles = ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX);

        //用来检测程序运行时间
        long startTime = System.currentTimeMillis();
        //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(req.getSession().getServletContext());
        //检查form中是否有enctype="multipart/form-data"
        String resultName = "";
        if (multipartResolver.isMultipart(req)) {
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) req;
            //获取multiRequest 中所有的文件名
            Iterator iter = multiRequest.getFileNames();
            while (iter.hasNext()) {
                //一次遍历所有文件
                MultipartFile file = multiRequest.getFile(iter.next().toString());
                if (file != null) {
                    String uuid = UUID.randomUUID().toString().replaceAll("-", "");
                    String fileName = file.getOriginalFilename();
                    resultName = uuid + fileName.substring(fileName.lastIndexOf("."));
                    String path = (resourceFiles.getPath() + "/" + filePath + resultName);
                    File f = new File(path);
                    if (!f.getParentFile().exists())
                        f.getParentFile().mkdirs(); //创建父级文件路径();
                    //上传
                    file.transferTo(f);
                }
            }
        }
        return ResultUtil.customizedSuccess("上传成功");
    }
}
