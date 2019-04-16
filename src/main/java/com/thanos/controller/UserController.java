package com.thanos.controller;

import com.thanos.model.User;
import com.thanos.repository.UserRepository;
import com.thanos.response.Result;
import com.thanos.response.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Map;

/**
 * @author Thanos Yu
 * @date 2018/4/25
 */


@Controller
@RequestMapping("/user")
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/getUserById", method = {RequestMethod.POST, RequestMethod.GET}, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Result getUserById(@RequestBody Map<String, String> map) {
        Result<User> result = new Result<User>();
        String id = map.get("id");
        result.setCode(Status.LSucceed.getCode());
        result.setMsg(Status.LSucceed.getMessage());
        try {
            User user = userRepository.findOne(Long.valueOf(id));
            result.setData(user);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(Status.LFailed.getCode());
            result.setMsg(Status.LFailed.getMessage());
        }
        return result;
    }

    @RequestMapping(value = "saveUser", method = {RequestMethod.POST, RequestMethod.GET}, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Result saveUser(@RequestBody User user) {
        Result<User> result = new Result<User>();
        result.setCode(Status.LSucceed.getCode());
        result.setMsg(Status.LSucceed.getMessage());
        try {
            userRepository.save(user);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(Status.LFailed.getCode());
            result.setMsg(Status.LFailed.getMessage());
        }
        return result;
    }
}
