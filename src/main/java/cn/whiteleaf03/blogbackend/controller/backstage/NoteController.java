package cn.whiteleaf03.blogbackend.controller.backstage;

import cn.whiteleaf03.blogbackend.entity.Note;
import cn.whiteleaf03.blogbackend.service.backstage.NoteService.NoteService;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WhiteLeaf03
 */
@RestController
@RequestMapping("/bs/api/note")
public class NoteController {
    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    public ResponseResult addNote(@RequestBody Note note) {
        return noteService.addNote(note);
    }
}
