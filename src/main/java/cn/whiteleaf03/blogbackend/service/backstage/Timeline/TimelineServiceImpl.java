package cn.whiteleaf03.blogbackend.service.backstage.Timeline;

import cn.whiteleaf03.blogbackend.entity.Timeline;
import cn.whiteleaf03.blogbackend.mapper.TimelineMapper;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WhiteLeaf03
 */
@Service
public class TimelineServiceImpl implements TimelineService {
    private final TimelineMapper timelineMapper;

    @Autowired
    public TimelineServiceImpl(TimelineMapper timelineMapper) {
        this.timelineMapper = timelineMapper;
    }

    /**
     * 添加时间线
     * @param timeline 要添加的时间线
     * @return 返回结果
     */
    @Override
    public ResponseResult addTimeline(Timeline timeline) {
        try {
            timelineMapper.addTimeline(timeline);
            return ResponseResult.success();
        } catch (RuntimeException e) {
            return ResponseResult.error(e.getMessage());
        }
    }
}
