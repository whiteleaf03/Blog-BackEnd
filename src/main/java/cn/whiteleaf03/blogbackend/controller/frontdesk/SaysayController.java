package cn.whiteleaf03.blogbackend.controller.frontdesk;

import cn.whiteleaf03.blogbackend.service.frontdesk.SaysayService.SaysayService;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fd/api/saysay")
public class SaysayController {
    private final SaysayService saysayService;

    @Autowired
    public SaysayController(SaysayService saysayService) {
        this.saysayService = saysayService;
    }

    @GetMapping("")
    public ResponseResult getSaysay() {
        return saysayService.queryAllSaysay();
    }
}
