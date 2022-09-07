package cn.whiteleaf03.blogbackend.service;

import cn.whiteleaf03.blogbackend.utils.ResponseResult;

/**
 * @author WhiteLeaf03
 */
public interface LoginStatusService {

    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return 返回登录结果
     */
    ResponseResult login(String username, String password);
}
