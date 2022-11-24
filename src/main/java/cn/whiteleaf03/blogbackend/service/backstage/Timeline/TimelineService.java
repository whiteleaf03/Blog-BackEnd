package cn.whiteleaf03.blogbackend.service.backstage.Timeline;

import cn.whiteleaf03.blogbackend.entity.Timeline;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;

/**
 * @author WhiteLeaf03
 */
public interface TimelineService {
    /**
     * 添加时间线
     * @param timeline 要添加的时间线
     * @return 返回结果
     */
    ResponseResult addTimeline(Timeline timeline);
}
