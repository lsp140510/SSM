package com.lsp.controller;

import com.lsp.service.UserService;
import com.lsp.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/find")
    public String findUser(Model model){
        int tid=1;
        User user=this.userService.findUserByid(tid);
        System.out.println(user.getTid()+":"+user.getTname());
        model.addAttribute("user",user);
        return "index";
    }
}
