package com.wcq.admin.controller;

import com.wcq.admin.AccountMapper;
import com.wcq.admin.bean.Account;
import com.wcq.admin.bean.User;
import com.wcq.admin.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    AccountService accountService;

    @GetMapping("/getAccount")
    @ResponseBody
    public Account getByid(Integer id) {
        return accountService.getAccById(id);
    }

    @GetMapping(value = {"/", "/login"})
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model) {
        if (!StringUtils.isEmpty(user.getUsername()) & "123".equals(user.getPassword())) {
            session.setAttribute("loginUser", user);
            log.info("user信息：" + user);
            return "redirect:/index.html";
        } else {
            model.addAttribute("msg", "账号密码错误");
            return "login";
        }
    }

    @GetMapping("/index.html")
    public String index(HttpSession session, Model model) {
        User loginUser = (User) session.getAttribute("loginUser");
        if (loginUser != null) {
            return "index";
        } else {
            model.addAttribute("msg", "请重新登录");
            return "login";
        }
    }


}
