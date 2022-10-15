package cn.whiteleaf03.blogbackend.service.frontdesk.EiheiService;

import cn.whiteleaf03.blogbackend.entity.Recommend;
import cn.whiteleaf03.blogbackend.mapper.RecommendMapper;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WhiteLeaf03
 */
@Service
public class EiheiServiceImpl implements EiheiService {
    private final RecommendMapper recommendMapper;

    @Autowired
    public EiheiServiceImpl(RecommendMapper recommendMapper) {
        this.recommendMapper = recommendMapper;
    }

    /**
     * 查询所有推荐
     * @return 返回推荐列表
     */
    @Override
    public ResponseResult queryAllRecommend() {
        List<Recommend> list = recommendMapper.queryAllRecommend();
        if (list.isEmpty()) {
            return ResponseResult.error("暂无数据");
        } else {
            return ResponseResult.success(list);
        }
    }
}
