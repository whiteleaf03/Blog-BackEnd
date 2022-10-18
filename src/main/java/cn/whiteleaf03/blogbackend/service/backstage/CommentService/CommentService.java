package cn.whiteleaf03.blogbackend.service.backstage.CommentService;

import cn.whiteleaf03.blogbackend.entity.Comment;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;

/**
 * @author WhiteLeaf03
 */
public interface CommentService {
    /**
     * 新增评论
     * @param comment 要添加的内容
     * @return 返回结果
     */
    ResponseResult addComment(Comment comment);
}
