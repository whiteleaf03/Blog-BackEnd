package cn.whiteleaf03.blogbackend.service.backstage.DataAnalysisService;

import cn.whiteleaf03.blogbackend.utils.ResponseResult;

/**
 * @author WhiteLeaf03
 */
public interface DataAnalysisService {
    /**
     * 查询后台统计数据
     * @return 返回数据
     */
    ResponseResult queryBackStageData();
}
