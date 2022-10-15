package cn.whiteleaf03.blogbackend.service.frontdesk.ChunibyouService;

import cn.whiteleaf03.blogbackend.mapper.ChunibyouMapper;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
     * 获取所有中二病语句
     * @return 返回查询结果
     */
    @Override
    public ResponseResult selectAllSentences() {
        List<String> list = chunibyouMapper.selectAllSentences();
        if (list.isEmpty()) {
            return ResponseResult.error("暂无数据");
        } else {
            return ResponseResult.success(list);
        }
    }

    /**
     * 获取单个中二病语句
     * @return 返回查询结果
     */
    @Override
    public ResponseResult selectRandomSingleSentences() {
        List<String> list = chunibyouMapper.selectAllSentences();
        if (list.isEmpty()) {
            return ResponseResult.error("暂无数据");
        } else {
            int index = (int) (Math.random() * list.size());
            return ResponseResult.success(list.get(index));
        }
    }
}
