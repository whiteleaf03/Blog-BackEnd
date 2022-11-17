package cn.whiteleaf03.blogbackend.mapper;

import cn.whiteleaf03.blogbackend.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    /**
     * 查询所有评论
     * @return 返回评论列表
     */
    List<Comment> queryAllComment();

    /**
     * 添加评论
     * @param comment 要添加的评论
     */
    void addComment(Comment comment);

    /**
     * 删除评论
     * @param id 要删除评论的id
     */
    void deleteCommentById(Long id);
}
