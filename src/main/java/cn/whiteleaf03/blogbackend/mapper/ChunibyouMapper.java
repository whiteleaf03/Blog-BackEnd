package cn.whiteleaf03.blogbackend.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author WhiteLeaf03
 */
@Mapper
public interface ChunibyouMapper {
    /**
     * 获取所有中二病语句
     * @return 查询中二病语句列表
     */
    List<String> selectAllSentences();
}
