package cn.whiteleaf03.blogbackend.service.backstage.NoteService;

import cn.whiteleaf03.blogbackend.entity.Note;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;

/**
 * @author WhiteLeaf03
 */
public interface NoteService {
    /**
     * 添加笔记
     * @param note 添加的笔记
     * @return 返回结果
     */
    ResponseResult addNote(Note note);
}
