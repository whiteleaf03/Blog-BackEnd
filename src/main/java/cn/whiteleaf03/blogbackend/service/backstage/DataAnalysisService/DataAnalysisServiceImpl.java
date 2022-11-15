package cn.whiteleaf03.blogbackend.service.backstage.DataAnalysisService;

import cn.whiteleaf03.blogbackend.mapper.DataAnalysisMapper;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WhiteLeaf03
 */
@Service
public class DataAnalysisServiceImpl implements DataAnalysisService {
    private final DataAnalysisMapper dataAnalysisMapper;

    @Autowired
    public DataAnalysisServiceImpl(DataAnalysisMapper dataAnalysisMapper) {
        this.dataAnalysisMapper = dataAnalysisMapper;
    }

    /**
     * 查询后台统计数据
     * @return 返回数据
     */
    @Override
    public ResponseResult queryBackStageData() {
        return ResponseResult.success(dataAnalysisMapper.queryBackStageData());
    }
}
