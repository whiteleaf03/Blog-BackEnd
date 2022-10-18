package cn.whiteleaf03.blogbackend.service.backstage.SaysayService;

import cn.whiteleaf03.blogbackend.entity.Saysay;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;

/**
 * @author WhiteLeaf03
 */
public interface SaysayService {
    /**
     * 添加说说
     * @param saysay 添加的说说
     * @return 返回结果
     */
    ResponseResult addSaysay(Saysay saysay);
}
