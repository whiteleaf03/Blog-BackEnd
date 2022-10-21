package cn.whiteleaf03.blogbackend.service.backstage.LoginStatus;

import cn.whiteleaf03.blogbackend.entity.BackstageUser;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;

/**
 * @author WhiteLeaf03
 */
public interface LoginStatusService {

    /**
     * 用户登录
     * @param backstageUser 含有用户名及密码
     * @return 返回登录结果
     */
    ResponseResult login(BackstageUser backstageUser);
}
