package cdu.csf.controller;

import cdu.csf.model.User;
import cdu.csf.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    UserService userService;

    @GetMapping("/findAll")
    public String findAllUser() {
        List<User> userList = userService.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
        return "helloView";
    }


}
