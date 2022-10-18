package cn.whiteleaf03.blogbackend.controller.frontdesk;

import cn.whiteleaf03.blogbackend.service.frontdesk.ChunibyouService.ChunibyouService;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WhiteLeaf03
 */
@RestController
@RequestMapping("/fd/api/chunibyou")
public class ChunibyouController {
    private final ChunibyouService chunibyouService;

    @Autowired
    public ChunibyouController(ChunibyouService chunibyouService) {
        this.chunibyouService = chunibyouService;
    }

    @GetMapping("")
    public ResponseResult getChunibyou(int random) {
        if (random == 1) {
            return chunibyouService.selectRandomSingleSentences();
        } else if (random == -1) {
            return chunibyouService.selectAllSentences();
        } else {
            return ResponseResult.error("参数错误");
        }
    }
}
