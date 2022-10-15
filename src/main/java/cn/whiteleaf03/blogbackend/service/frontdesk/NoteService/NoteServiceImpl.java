package cn.whiteleaf03.blogbackend.service.frontdesk.NoteService;

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
     * 查询所有笔记
     * @return 返回笔记列表
     */
    @Override
    public ResponseResult queryAllNote() {
        List<Note> list = noteMapper.queryAllNote();
        if (list.isEmpty()) {
            return ResponseResult.error("暂无数据");
        } else {
            return ResponseResult.success(list);
        }
    }

    /**
     * 根据id查询单个笔记
     * @param id 要查询的笔记的id
     * @return 返回查询得到的笔记
     */
    @Override
    public ResponseResult queryAllNote(Long id) {
        Note note = noteMapper.querySingleNoteById(id);
        if (Objects.isNull(note)) {
            return ResponseResult.error("暂无数据");
        } else {
            return ResponseResult.success(note);
        }
    }
}
