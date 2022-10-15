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
public class Note {
    /**
     * 主键
     */
    private Long id;

    /**
     * 日期时间戳
     */
    private Long date;

    /**
     * 封面路径
     */
    private String cover;

    /**
     * 标题
     */
    private String title;

    /**
     * 副标题
     */
    private String subtitle;

    /**
     * 内容 HTML格式
     */
    private String text;

    public Note(Long id, Long date, String cover, String title, String subtitle) {
        this.id = id;
        this.date = date;
        this.cover = cover;
        this.title = title;
        this.subtitle = subtitle;
    }
}
