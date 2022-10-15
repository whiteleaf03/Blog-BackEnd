package cn.whiteleaf03.blogbackend.mapper;

import cn.whiteleaf03.blogbackend.entity.Recommend;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author WhiteLeaf03
 */
@Mapper
public interface RecommendMapper {
    /**
     * 查询所有推荐
     * @return 返回推荐列表
     */
    List<Recommend> queryAllRecommend();
}
