package cn.whiteleaf03.blogbackend.controller.backstage;

import cn.whiteleaf03.blogbackend.entity.Recommend;
import cn.whiteleaf03.blogbackend.service.backstage.EiheiService.EiheiService;
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
@RequestMapping("/bs/api/eihei")
public class EiheiController {
    private final EiheiService eiheiService;

    @Autowired
    public EiheiController(EiheiService eiheiService) {
        this.eiheiService = eiheiService;
    }

    @PostMapping("")
    public ResponseResult addSaysay(@RequestBody Recommend recommend) {
        return eiheiService.addRecommend(recommend);
    }
}
