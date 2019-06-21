package com.mallotec.reb.corporatetraining;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.util.ResourceUtils;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;
import java.io.File;
import java.io.FileNotFoundException;

@MapperScan({"com.mallotec.reb.corporatetraining.dao.base", "com.mallotec.reb.corporatetraining.dao"})
@SpringBootApplication
public class CorporateTrainingApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CorporateTrainingApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(CorporateTrainingApplication.class, args);
    }

    //获取配置的上传文件的系统临时文件夹路径
    @Value("${file.upload-temp-path}")
    private String tempFilePath;

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //允许上传的文件最大值
        factory.setMaxFileSize("100MB");
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("1024MB");
        //设置临时文件路径，以防长时间不操作后删除临时文件导致报错
        File f = null;
        String tempFileRealPath = "";
        try {
            tempFileRealPath = ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX).getPath() + "/" + tempFilePath;
            f = new File(tempFileRealPath);
            if (!f.exists())
                f.mkdirs();
            factory.setLocation(tempFileRealPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return factory.createMultipartConfig();
    }

}
