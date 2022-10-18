package cn.whiteleaf03.blogbackend.service.backstage.ChunibyouService;

import cn.whiteleaf03.blogbackend.entity.Chunibyou;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;

/**
 * @author WhiteLeaf03
 */
public interface ChunibyouService {
    /**
     * 新增中二病语句
     * @param chunibyou 内容
     * @return 返回结果
     */
    ResponseResult addChunibyouSentence(Chunibyou chunibyou);
}
