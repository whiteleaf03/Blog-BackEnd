package cn.whiteleaf03.blogbackend.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @author WhiteLeaf03
 */
@Mapper
public interface DataAnalysisMapper {
    /**
     * 查询后台统计数据
     * @return 返回数据
     */
    Map<String, String> queryBackStageData();

    /**
     * 查询前台统计数据
     * @return 返回数据
     */
    Map<String, String> queryFontDeskData();
}
