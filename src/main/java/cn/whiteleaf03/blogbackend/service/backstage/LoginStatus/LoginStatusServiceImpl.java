package cn.whiteleaf03.blogbackend.service.backstage.LoginStatus;

import cn.whiteleaf03.blogbackend.security.AuthBackstageUser;
import cn.whiteleaf03.blogbackend.security.LoginUser;
import cn.whiteleaf03.blogbackend.utils.JwtUtil;
import cn.whiteleaf03.blogbackend.utils.RedisCache;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author WhiteLeaf03
 */
@Service
public class LoginStatusServiceImpl implements LoginStatusService {

    private final AuthenticationManager authenticationManager;
    private final RedisCache redisCache;

    @Autowired
    public LoginStatusServiceImpl(AuthenticationManager authenticationManager, RedisCache redisCache) {
        this.authenticationManager = authenticationManager;
        this.redisCache = redisCache;
    }

    /**
     * 用户登录
     * @param loginUser 含有用户名及密码
     * @return 返回登录结果
     */
    @Override
    public ResponseResult login(LoginUser loginUser) {
        //用户认证
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(loginUser.getUsername(), loginUser.getPassword());
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);

        //查看认证结果
        if (Objects.isNull(authenticate)) {
            throw new RuntimeException("登录失败");
        }
        //提取认证后的信息
        AuthBackstageUser authBackstageUser = (AuthBackstageUser) authenticate.getPrincipal();
        //获取用户的id
        String userId = authBackstageUser.getId().toString();
        //创建jwt
        String jwt = JwtUtil.createJwt(userId);
        //将用户信息存入redis
        System.out.println("用户id");
        System.out.println(userId);
        redisCache.setObject("login:" + userId, "阿巴阿巴");
        //返回token
        Map<String, String> map = new HashMap<>();
        map.put("token", jwt);
        return new ResponseResult(0, "登录成功", map);
    }
}
