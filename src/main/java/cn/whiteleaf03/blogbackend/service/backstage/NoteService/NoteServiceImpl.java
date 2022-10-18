package cn.whiteleaf03.blogbackend.service.backstage.NoteService;

import cn.whiteleaf03.blogbackend.entity.Note;
import cn.whiteleaf03.blogbackend.mapper.NoteMapper;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @author WhiteLeaf03
 */
@Service
public class NoteServiceImpl implements NoteService {
    private final NoteMapper noteMapper;

    @Autowired
    public NoteServiceImpl(NoteMapper noteMapper) {
        this.noteMapper = noteMapper;
    }

    /**
     * 添加笔记
     * @param note 添加的笔记
     * @return 返回结果
     */
    @Override
    public ResponseResult addNote(Note note) {
        try {
            noteMapper.addNote(note);
            return ResponseResult.success();
        } catch (RuntimeException e) {
            return ResponseResult.error(e.getMessage());
        }
    }
}
