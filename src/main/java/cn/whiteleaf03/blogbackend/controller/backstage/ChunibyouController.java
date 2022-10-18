package cn.whiteleaf03.blogbackend.controller.backstage;

import cn.whiteleaf03.blogbackend.entity.Chunibyou;
import cn.whiteleaf03.blogbackend.service.backstage.ChunibyouService.ChunibyouService;
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
@RequestMapping("/bs/api/chunibyou")
public class ChunibyouController {
    private final ChunibyouService chunibyouService;

    @Autowired
    public ChunibyouController(ChunibyouService chunibyouService) {
        this.chunibyouService = chunibyouService;
    }

    @PostMapping("")
    public ResponseResult addChunibyouSentence(@RequestBody Chunibyou chunibyou) {
        return chunibyouService.addChunibyouSentence(chunibyou);
    }
}
