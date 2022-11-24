package cn.whiteleaf03.blogbackend.mapper;

import cn.whiteleaf03.blogbackend.entity.Timeline;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author WhiteLeaf03
 */
@Mapper
public interface TimelineMapper {
    /**
     * 添加时间线
     * @param timeline 要添加的时间线
     */
    void addTimeline(Timeline timeline);

    /**
     * 查询所有时间线
     * @return 返回查询结果
     */
    List<Timeline> queryAllTimeline();
}
