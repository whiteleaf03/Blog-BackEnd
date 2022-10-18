package cn.whiteleaf03.blogbackend;

import cn.whiteleaf03.blogbackend.config.BeanNameConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author WhiteLeaf03
 */
@SpringBootApplication
@ComponentScan(nameGenerator = BeanNameConfig.class)
public class BlogBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogBackEndApplication.class, args);
    }

}
