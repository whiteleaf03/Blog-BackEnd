package cn.whiteleaf03.blogbackend.service.frontdesk.CommentService;

import cn.whiteleaf03.blogbackend.utils.ResponseResult;

/**
 * @author WhiteLeaf03
 */
public interface CommentService {
    /**
     * 查询所有评论
     * @return 返回评论列表
     */
    ResponseResult queryAllComment();
}
