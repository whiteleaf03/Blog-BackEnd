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

    /**
     * 查询所有评论
     * @return 返回评论列表
     */
    ResponseResult queryAllComment();

    /**
     * 删除评论
     * @param id 要删除评论的id
     * @return 返回结果
     */
    ResponseResult deleteCommentById(Long id);
}
