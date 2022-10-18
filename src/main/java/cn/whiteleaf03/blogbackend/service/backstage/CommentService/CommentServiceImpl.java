package cn.whiteleaf03.blogbackend.service.backstage.CommentService;

import cn.whiteleaf03.blogbackend.entity.Comment;
import cn.whiteleaf03.blogbackend.mapper.CommentMapper;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WhiteLeaf03
 */
@Service
public class CommentServiceImpl implements CommentService {
    private final CommentMapper commentMapper;

    @Autowired
    public CommentServiceImpl(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    /**
     * 新增评论
     * @param comment 要添加的内容
     * @return 返回结果
     */
    @Override
    public ResponseResult addComment(Comment comment) {
        try {
            commentMapper.addComment(comment);
            return ResponseResult.success();
        } catch (RuntimeException e) {
            return ResponseResult.error(e.getMessage());
        }
    }
}
