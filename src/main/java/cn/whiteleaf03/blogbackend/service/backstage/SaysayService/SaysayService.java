package cn.whiteleaf03.blogbackend.service.backstage.SaysayService;

import cn.whiteleaf03.blogbackend.entity.Saysay;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;

/**
 * @author WhiteLeaf03
 */
public interface SaysayService {
    /**
     * 添加说说
     * @param saysay 添加的说说
     * @return 返回结果
     */
    ResponseResult addSaysay(Saysay saysay);

    /**
     * 删除说说
     * @param id 要删除说说的id
     * @return 返回结果
     */
    ResponseResult deleteSaysayById(Long id);

    /**
     * 修改说说
     * @param saysay 修改的说说
     * @return 返回结果
     */
    ResponseResult putSaysayById(Saysay saysay);

    /**
     * 查询所有说说
     * @return 返回说说列表
     */
    ResponseResult queryAllSaysay();
}
