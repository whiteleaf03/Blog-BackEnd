package cn.whiteleaf03.blogbackend.mapper;

import cn.whiteleaf03.blogbackend.entity.Saysay;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author WhiteLeaf03
 */
@Mapper
public interface SaysayMapper {
    /**
     * 查询所有说说
     * @return 返回说说列表
     */
    List<Saysay> queryAllSaysay();

    /**
     * 添加说说
     * @param saysay 添加的说说
     */
    void addSaysay(Saysay saysay);

    /**
     * 删除说说
     * @param id 要删除说说的id
     */
    void deleteSaysayById(Long id);

    /**
     * 修改说说
     * @param saysay 修改的说说
     */
    void putSaysayById(Saysay saysay);
}
