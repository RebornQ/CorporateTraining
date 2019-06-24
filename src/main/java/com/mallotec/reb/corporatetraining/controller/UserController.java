package com.mallotec.reb.corporatetraining.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mallotec.reb.corporatetraining.pojo.Result;
import com.mallotec.reb.corporatetraining.pojo.User;
import com.mallotec.reb.corporatetraining.service.UserService;
import com.mallotec.reb.corporatetraining.util.ResultUtil;
import com.mallotec.reb.corporatetraining.util.StringUtil;
import io.swagger.annotations.Api;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/user")
@EnableAutoConfiguration
@Api
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @ResponseBody
    public Object getUser(@RequestParam(value = "username",required = true) String username) {
        Result result = null;
        User user = userService.findUserByName(username);
        if (user != null) {
            user.setPassword("***");
            result = ResultUtil.success(user);
        } else {
            result = ResultUtil.error500("用户不存在");
        }
        return result;
    }

    @PostMapping
    @ResponseBody
    public Object addUser(@RequestBody User user) {
        Result result;
        user.setPassword(StringUtil.MD5(user.getPassword()));
        if (userService.addUser(user) > 0) result = ResultUtil.success("注册成功！");
        else result = ResultUtil.error500("注册失败");
        return result;
    }

    @PostMapping(value = "/login", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Object login(@RequestParam String username, @RequestParam String password, HttpSession httpSession) {
        Result result;
        JSONObject jsonObject = new JSONObject();
        User user = userService.findUserByName(username);
        if (user != null) {
            if (user.getPassword().equals(StringUtil.MD5(password))) {
                jsonObject.put("username", username);
                jsonObject.put("role", user.getRole());
                result = ResultUtil.customizedSuccess("登陆成功", jsonObject);
                httpSession.setAttribute("username", username);
            } else {
                result = ResultUtil.error500("密码错误");
            }
        } else {
            result = ResultUtil.error500("用户不存在");
        }
        System.out.println(JSON.toJSON(result));
        return result;
    }
}
