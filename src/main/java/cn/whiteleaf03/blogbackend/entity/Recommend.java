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
public class Recommend {
    /**
     * 主键
     */
    private Long id;

    /**
     * 封面路径
     */
    private String cover;

    /**
     * 标题
     */
    private String title;

    /**
     * 类别
     */
    private String type;
}
