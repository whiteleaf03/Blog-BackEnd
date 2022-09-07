package cn.whiteleaf03.blogbackend.mapper;

import cn.whiteleaf03.blogbackend.entity.BackstageUser;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author WhiteLeaf03
 */
@Mapper
public interface BackstageUserMapper {

    /**
     * 根据username查询单个用户
     * @param username 用户名
     * @return 返回查询到的用户信息
     */
    BackstageUser selectSingleBackStageUserByUsername(String username);

}
