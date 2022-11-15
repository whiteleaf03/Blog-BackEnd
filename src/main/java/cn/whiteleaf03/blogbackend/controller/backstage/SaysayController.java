package cn.whiteleaf03.blogbackend.controller.backstage;

import cn.whiteleaf03.blogbackend.entity.Saysay;
import cn.whiteleaf03.blogbackend.service.backstage.SaysayService.SaysayService;
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
@RequestMapping("")
public class SaysayController {
    private final SaysayService saysayService;

    @Autowired
    public SaysayController(SaysayService saysayService) {
        this.saysayService = saysayService;
    }

    @PostMapping("")
    public ResponseResult addSaysay(@RequestBody Saysay saysay) {
        return saysayService.addSaysay(saysay);
    }
}
