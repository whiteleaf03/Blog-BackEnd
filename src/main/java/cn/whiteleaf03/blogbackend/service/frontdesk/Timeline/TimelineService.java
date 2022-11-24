package cn.whiteleaf03.blogbackend.service.frontdesk.Timeline;

import cn.whiteleaf03.blogbackend.utils.ResponseResult;

/**
 * @author WhiteLeaf03
 */
public interface TimelineService {
    /**
     * 查询所有时间线
     * @return 返回查询结果
     */
    ResponseResult queryAllTimeline();
}
