package cn.whiteleaf03.blogbackend.service.backstage.EiheiService;

import cn.whiteleaf03.blogbackend.entity.Recommend;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;

/**
 * @author WhiteLeaf03
 */
public interface EiheiService {
    /**
     * 新增推荐
     * @param recommend 新增的推荐
     * @return 返回结果
     */
    ResponseResult addRecommend(Recommend recommend);
}
