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
public class Timeline {
    /**
     * 主键自增
     */
    private Long id;

    /**
     * 日期
     */
    private Long date;

    /**
     * 事件
     */
    private String event;
}
