package cn.whiteleaf03.blogbackend.controller.frontdesk;

import cn.whiteleaf03.blogbackend.service.frontdesk.EiheiService.EiheiService;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WhiteLeaf03
 */
@RestController
@RequestMapping("/fd/api/eihei")
public class EiheiController {
    private final EiheiService eiheiService;

    public EiheiController(EiheiService eiheiService) {
        this.eiheiService = eiheiService;
    }

    @GetMapping("/recommend")
    public ResponseResult getRecommend() {
        return eiheiService.queryAllRecommend();
    }
}
