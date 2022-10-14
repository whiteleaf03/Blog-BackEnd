package cn.whiteleaf03.blogbackend.service.frontdesk.ChunibyouService;

import cn.whiteleaf03.blogbackend.mapper.ChunibyouMapper;
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
        System.out.println("Service构造器");
        this.chunibyouMapper = chunibyouMapper;
    }

    /**
     * 获取所有中二病语句
     * @return 查询返回的List
     */
    @Override
    public List<String> selectAllSentences() {
        return chunibyouMapper.selectAllSentences();
    }

    /**
     * 获取单个中二病语句
     * @return 返回单个中二病语句
     */
    @Override
    public String selectRandomSingleSentences() {
        List<String> list = chunibyouMapper.selectAllSentences();
        int index = (int) (Math.random() * list.size());
        return list.get(index);
    }
}
