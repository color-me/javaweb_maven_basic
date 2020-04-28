package cdu.csf.controller;

import cdu.csf.model.User;
import cdu.csf.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String login(User userParam, HttpSession session){
        User user = userService.checklogin(userParam);
        if(user != null){
            session.setAttribute("user", user);
            return "home";
        }else {
            return "login";
        }
    }

//    @RequestMapping("/login")
//    @ResponseBody
//    public User login(User user){
//    return user;
//    }

    @GetMapping("/add")
    public String add(){
        return "add_user";
    }

    @PostMapping("/add")
    public String add(User userParam, HttpServletResponse response) throws IOException {
        if (userService.add(userParam)){
            response.sendRedirect("list");
        }
        return "add_user";
    }

    @GetMapping("/list")
    public String findAllUser(Model model) {
        List<User> userList = userService.findAll();
        model.addAttribute("userlist",userList);
        model.addAttribute("userCount",userService.count());
        for (User user : userList) {
            System.out.println(user);
        }
        return "userlist";
    }

//    @GetMapping(value = "/fetch",params = {"id"})
//    public String fetch(int id, HttpSession session){
//        session.setAttribute("id", id);
//        return "home";
//    }
//
//    @GetMapping("/fetch")
//    public String fetch(){
//        return "home";
//    }

    @GetMapping("/mod")
    public String modify(int id,Model model){
        User user=userService.find(id);
        model.addAttribute("modifyUser",user);
        return "mod_user";
    }

    @PostMapping("/mod")
    public void modify(User newUser, HttpServletResponse response) throws IOException {
        if (userService.modify(newUser)){
            response.sendRedirect("list");
        }else {
            response.sendRedirect("mod?id=" + newUser.getId());
        }
    }

    @GetMapping("/del")
    public void delete(int id, HttpServletResponse response) throws IOException {
        userService.delete(id);
        response.sendRedirect("list");
    }



//    @Resource
//    UserService userService;
//
//    @GetMapping("/findAll")
//    public String findAllUser() {
//        List<User> userList = userService.findAll();
//        for (User user : userList) {
//            System.out.println(user);
//        }
//        return "helloView";
//    }

}
