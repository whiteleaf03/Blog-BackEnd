package cn.whiteleaf03.blogbackend.service.frontdesk.SaysayService;

import cn.whiteleaf03.blogbackend.entity.Saysay;
import cn.whiteleaf03.blogbackend.mapper.SaysayMapper;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WhiteLeaf03
 */
@Service
public class SaysayServiceImpl implements SaysayService {
    private final SaysayMapper saysayMapper;

    @Autowired
    public SaysayServiceImpl(SaysayMapper saysayMapper) {
        this.saysayMapper = saysayMapper;
    }

    /**
     * 查询所有说说
     * @return 返回说说列表
     */
    @Override
    public ResponseResult queryAllSaysay() {
        List<Saysay> list = saysayMapper.queryAllSaysay();
        if (list.isEmpty()) {
            return ResponseResult.error("暂无数据");
        } else {
            return ResponseResult.success(list);
        }
    }
}
