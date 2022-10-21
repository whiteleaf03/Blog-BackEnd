package cn.whiteleaf03.blogbackend.controller.backstage;

import cn.whiteleaf03.blogbackend.entity.BackstageUser;
import cn.whiteleaf03.blogbackend.service.backstage.LoginStatus.LoginStatusService;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WhiteLeaf03
 */
@RestController
@RequestMapping("/bs/api")
public class LoginStatusController {

    private final LoginStatusService loginStatusService;

    @Autowired
    public LoginStatusController(LoginStatusService loginStatusService) {
        this.loginStatusService = loginStatusService;
    }

    @PostMapping("/login")
    public ResponseResult login(@RequestBody BackstageUser backstageUser) {
        return loginStatusService.login(backstageUser);
    }
}
