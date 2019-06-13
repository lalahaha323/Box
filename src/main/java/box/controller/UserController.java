package box.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import box.pojo.User;
import box.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @RequestMapping("/register")
    public String register(@RequestBody User user) {
        userServiceImpl.register(user);
        return "success";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login() {
        System.out.println("lala");
        return "success";
    }
//    public String login(@RequestBody Map<String, String> map) {
//
//        String name = map.get("name");
//        String password = map.get("password");
//        System.out.println("用户登录:" + name + password);
//        userServiceImpl.login(name, password);
//        return "success";
//    }
}

