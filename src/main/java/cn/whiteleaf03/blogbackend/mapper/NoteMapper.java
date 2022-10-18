package cn.whiteleaf03.blogbackend.mapper;

import cn.whiteleaf03.blogbackend.entity.Note;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author WhiteLeaf03
 */
@Mapper
public interface NoteMapper {
    /**
     * 查询所有笔记
     * @return 返回笔记列表
     */
    List<Note> queryAllNote();

    /**
     * 根据id查询单个笔记
     * @param id 要查询的笔记的id
     * @return 返回查询得到的笔记
     */
    Note querySingleNoteById(Long id);

    /**
     * 添加笔记
     * @param note 添加的笔记
     */
    void addNote(Note note);
}
