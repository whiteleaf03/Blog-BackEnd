package cn.whiteleaf03.blogbackend.controller.frontdesk;

import cn.whiteleaf03.blogbackend.entity.Comment;
import cn.whiteleaf03.blogbackend.service.frontdesk.CommentService.CommentService;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author WhiteLeaf03
 */
@RestController
@RequestMapping("/fd/api/comment")
public class CommentController {
    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("")
    public ResponseResult addComment(@RequestBody Comment comment) {
        return commentService.insertComment(comment);
    }

    @GetMapping("")
    public ResponseResult getComment() {
        return commentService.queryAllComment();
    }
}
