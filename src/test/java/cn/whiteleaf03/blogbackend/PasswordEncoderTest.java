package cn.whiteleaf03.blogbackend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
public class PasswordEncoderTest {

    @Test
    public void pwdEncoder() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.matches("Wd.020518", "$2a$10$P9UkCBX/GSViAxXakCdRRuY/27SxxgNQ1OmN4WxwdgVR9XnzaDFji"));
    }
}
