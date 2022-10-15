package cn.whiteleaf03.blogbackend.service.frontdesk.CommentService;

import cn.whiteleaf03.blogbackend.entity.Comment;
import cn.whiteleaf03.blogbackend.mapper.CommentMapper;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
     * 查询所有评论
     * @return 返回评论列表
     */
    @Override
    public ResponseResult queryAllComment() {
        List<Comment> list = commentMapper.queryAllComment();
        if (list.isEmpty()) {
            return ResponseResult.error("暂无数据");
        } else {
            return ResponseResult.success(list);
        }
    }
}
