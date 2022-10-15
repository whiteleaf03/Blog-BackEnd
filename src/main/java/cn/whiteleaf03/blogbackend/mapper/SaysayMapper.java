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
}
