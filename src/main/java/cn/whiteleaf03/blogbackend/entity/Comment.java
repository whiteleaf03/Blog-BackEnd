package cn.whiteleaf03.blogbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WhiteLeaf03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    /**
     * 主键
     */
    private Long id;

    /**
     * 日期
     */
    private Long date;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 邮件地址
     */
    private String email;

    /**
     * 内容
     */
    private String text;
}
