package cn.whiteleaf03.blogbackend.service.backstage.ChunibyouService;

import cn.whiteleaf03.blogbackend.mapper.ChunibyouMapper;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WhiteLeaf03
 */
@Service
public class ChunibyouServiceImpl implements ChunibyouService {
    private final ChunibyouMapper chunibyouMapper;

    @Autowired
    public ChunibyouServiceImpl(ChunibyouMapper chunibyouMapper) {
        this.chunibyouMapper = chunibyouMapper;
    }


    /**
     * 新增中二病语句
     * @param text 内容
     * @return 返回结果
     */
    @Override
    public ResponseResult addChunibyouSentence(String text) {
        try {
            chunibyouMapper.addChunibyouSentence(text);
            return ResponseResult.success();
        } catch (RuntimeException exception) {
            return ResponseResult.error(exception.getMessage());
        }
    }
}
