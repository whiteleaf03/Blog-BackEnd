package cn.whiteleaf03.blogbackend.service.backstage.LoginStatus;

import cn.whiteleaf03.blogbackend.entity.BackstageUser;
import cn.whiteleaf03.blogbackend.security.AuthBackstageUser;
import cn.whiteleaf03.blogbackend.utils.JwtUtil;
import cn.whiteleaf03.blogbackend.utils.RedisCache;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
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
     * @param backstageUser 含有用户名及密码
     * @return 返回登录结果
     */
    @Override
    public ResponseResult login(BackstageUser backstageUser) {
        //用户认证
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(backstageUser.getUsername(), backstageUser.getPassword());
        Authentication authenticate;
        try {
            authenticate = authenticationManager.authenticate(authenticationToken);
        } catch (AuthenticationException e) {
            return ResponseResult.error(e.getMessage());
        }

        //查看认证结果
        if (Objects.isNull(authenticate)) {
            throw new RuntimeException("登录失败");
        }
        //提取认证后的信息
        AuthBackstageUser user = (AuthBackstageUser) authenticate.getPrincipal();
        //获取用户的id
        String userId = user.getId().toString();
        //创建jwt
        String jwt = JwtUtil.createJwt(userId);
        //将用户信息存入redis
        redisCache.setObject("[OnlineUser]id:" + userId, user);
        //返回token
        Map<String, String> map = new HashMap<>();
        map.put("token", jwt);
        return new ResponseResult(0, "登录成功", map);
    }
}
