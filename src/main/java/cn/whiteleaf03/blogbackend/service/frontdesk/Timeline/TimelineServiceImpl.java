package cn.whiteleaf03.blogbackend.service.frontdesk.Timeline;

import cn.whiteleaf03.blogbackend.entity.Timeline;
import cn.whiteleaf03.blogbackend.mapper.TimelineMapper;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
     * 查询所有时间线
     * @return 返回查询结果
     */
    @Override
    public ResponseResult queryAllTimeline() {
        try {
            List<Timeline> list =  timelineMapper.queryAllTimeline();
            return ResponseResult.success(list);
        } catch (RuntimeException e) {
            return ResponseResult.error(e.getMessage());
        }
    }
}
