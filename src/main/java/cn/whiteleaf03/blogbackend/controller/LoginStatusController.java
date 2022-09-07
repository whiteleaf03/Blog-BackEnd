package cn.whiteleaf03.blogbackend.controller;

import cn.whiteleaf03.blogbackend.service.LoginStatusService;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bs/api")
public class LoginStatusController {

    private final LoginStatusService loginStatusService;

    @Autowired
    public LoginStatusController(LoginStatusService loginStatusService) {
        this.loginStatusService = loginStatusService;
    }

    @PostMapping("/login")
    public ResponseResult login(String username, String password) {
        return loginStatusService.login(username, password);
    }
}
