package cn.whiteleaf03.blogbackend.service.frontdesk.CommentService;

import cn.whiteleaf03.blogbackend.entity.Comment;
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

    /**
     * 添加评论
     * @param comment 要添加的评论
     * @return 返回结果
     */
    ResponseResult insertComment(Comment comment);
}
