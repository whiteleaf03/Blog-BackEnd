package cn.whiteleaf03.blogbackend.service.backstage;

import cn.whiteleaf03.blogbackend.security.AuthBackstageUser;
import cn.whiteleaf03.blogbackend.security.BackstageUser;
import cn.whiteleaf03.blogbackend.mapper.BackstageUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author WhiteLeaf03
 * 用户登录验证过滤器
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    private final BackstageUserMapper backendUserMapper;

    @Autowired
    public UserDetailServiceImpl(BackstageUserMapper backendUserMapper) {
        this.backendUserMapper = backendUserMapper;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //查询用户信息
        BackstageUser user = backendUserMapper.selectSingleBackEndUserByUsername(username);
        //TODO 返回权限信息
        if (Objects.isNull(user)) {
            //未查询到该用户
            throw new RuntimeException("用户名不存在");
        } else {
            //查询到用户
            return new AuthBackstageUser(user);
        }
    }
}
