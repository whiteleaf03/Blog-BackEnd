package cn.whiteleaf03.blogbackend.controller.frontdesk;

import cn.whiteleaf03.blogbackend.service.frontdesk.NoteService.NoteService;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author WhiteLeaf03
 */
@RestController
@RequestMapping("/fd/api/note")
public class NoteController {
    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("")
    public ResponseResult getNote(Long id) {
        if (Objects.isNull(id)) {
            return noteService.queryAllNote();
        } else {
            return noteService.querySingleNoteById(id);
        }
    }
}
