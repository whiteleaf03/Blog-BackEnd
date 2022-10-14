package cn.whiteleaf03.blogbackend.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChunibyouMapper {
    /**
     * 获取所有中二病语句
     * @return 查询返回的List
     */
    List<String> selectAllSentences();
}
