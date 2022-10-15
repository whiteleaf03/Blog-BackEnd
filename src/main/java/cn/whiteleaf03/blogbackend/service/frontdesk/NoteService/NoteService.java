package cn.whiteleaf03.blogbackend.service.frontdesk.NoteService;

import cn.whiteleaf03.blogbackend.utils.ResponseResult;

/**
 * @author WhiteLeaf03
 */
public interface NoteService {
    /**
     * 查询所有笔记
     * @return 返回笔记列表
     */
    ResponseResult queryAllNote();

    /**
     * 根据id查询单个笔记
     * @param id 要查询的笔记的id
     * @return 返回查询得到的笔记
     */
    ResponseResult queryAllNote(Long id);
}
