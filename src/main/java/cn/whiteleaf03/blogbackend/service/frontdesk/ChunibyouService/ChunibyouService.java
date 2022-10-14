package cn.whiteleaf03.blogbackend.service.frontdesk.ChunibyouService;

import cn.whiteleaf03.blogbackend.utils.ResponseResult;

/**
 * @author WhiteLeaf03
 */
public interface ChunibyouService {
    /**
     * 获取所有中二病语句
     * @return 查询返回的List
     */
    ResponseResult selectAllSentences();

    /**
     * 获取单个中二病语句
     * @return 返回单个中二病语句
     */
    ResponseResult selectRandomSingleSentences();
}
