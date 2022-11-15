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
    private String coverPath;

    /**
     * 标题
     */
    private String title;

    /**
     * 副标题
     */
    private String subTitle;

    /**
     * 内容 HTML格式
     */
    private String text;

    public Note(Long id, Long date, String coverPath, String title, String subTitle) {
        this.id = id;
        this.date = date;
        this.coverPath = coverPath;
        this.title = title;
        this.subTitle = subTitle;
    }
}
