package cn.whiteleaf03.blogbackend.service.backstage.EiheiService;

import cn.whiteleaf03.blogbackend.entity.Recommend;
import cn.whiteleaf03.blogbackend.mapper.RecommendMapper;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
     * 新增推荐
     * @param recommend 新增的推荐
     * @return 返回结果
     */
    @Override
    public ResponseResult addRecommend(Recommend recommend) {
        try {
            recommendMapper.addRecommend(recommend);
            return ResponseResult.success();
        } catch (RuntimeException e) {
            return ResponseResult.error(e.getMessage());
        }
    }
}
