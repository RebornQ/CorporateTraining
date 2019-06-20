package com.mallotec.reb.corporatetraining.controller;

import com.alibaba.fastjson.JSONObject;
import com.mallotec.reb.corporatetraining.pojo.Result;
import com.mallotec.reb.corporatetraining.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pojo.User;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private dao.UserMapper userMapper;

    @PostMapping
    @ResponseBody
    public Result addUser(@RequestBody pojo.User user) {
        Result result = new Result();
        if (userMapper.insertUser(user) > 0) result = ResultUtil.success("注册成功！");
        else result = ResultUtil.error500("注册失败");
        return result;
    }

    @PostMapping("/login")
    @ResponseBody
    public Result login(@RequestParam String username, @RequestParam String password, HttpSession httpSession) {
        Result result = new Result();
        JSONObject jsonObject = new JSONObject();
        pojo.User user = User.QueryBuild()
                .fetchUsername()
                .username(username)
                .build();
        if (user != null) {
            if (user.getPassword().equals(password)) {
                jsonObject.put("username", username);
                result = ResultUtil.customizedSuccess("登陆成功", jsonObject);
                httpSession.setAttribute("username", username);
            } else {
                result = ResultUtil.error500("密码错误");
            }
        } else {
            result = ResultUtil.error500("用户不存在");
        }
        return result;
    }
}
