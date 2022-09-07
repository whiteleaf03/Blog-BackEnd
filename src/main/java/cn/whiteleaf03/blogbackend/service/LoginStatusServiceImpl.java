package cn.whiteleaf03.blogbackend.service;

import cn.whiteleaf03.blogbackend.entity.BackstageUser;
import cn.whiteleaf03.blogbackend.mapper.BackstageUserMapper;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WhiteLeaf03
 */
@Service
public class LoginStatusServiceImpl implements LoginStatusService {

    private final BackstageUserMapper backstageUserMapper;

    @Autowired
    public LoginStatusServiceImpl(BackstageUserMapper backstageUserMapper) {
        this.backstageUserMapper = backstageUserMapper;
    }

    /**
     * 用户登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 返回登录结果
     */
    @Override
    public ResponseResult login(String username, String password) {
        BackstageUser backstageUser = backstageUserMapper.selectSingleBackStageUserByUsername(username);
        if (backstageUser == null) {
            //用户名不存在
            return new ResponseResult(1, "用户名不存在");
        } else if (!backstageUser.getPassword().equals(password)){
            //密码错误
            return new ResponseResult(1, "密码错误");
        } else {
            //登录成功
            return new ResponseResult(0, "登录成功");
        }
    }
}
