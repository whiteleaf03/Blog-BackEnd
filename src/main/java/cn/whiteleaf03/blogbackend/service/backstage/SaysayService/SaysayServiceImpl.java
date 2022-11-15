package cn.whiteleaf03.blogbackend.service.backstage.SaysayService;

import cn.whiteleaf03.blogbackend.entity.Saysay;
import cn.whiteleaf03.blogbackend.mapper.SaysayMapper;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WhiteLeaf03
 */
@Service
public class SaysayServiceImpl implements SaysayService {
    private final SaysayMapper saysayMapper;

    @Autowired
    public SaysayServiceImpl(SaysayMapper saysayMapper) {
        this.saysayMapper = saysayMapper;
    }

    /**
     * 添加说说
     * @param saysay 添加的说说
     * @return 返回结果
     */
    @Override
    public ResponseResult addSaysay(Saysay saysay) {
        try {
            saysayMapper.addSaysay(saysay);
            return ResponseResult.success();
        } catch (RuntimeException e) {
            return ResponseResult.error(e.getMessage());
        }
    }

    /**
     * 删除说说
     * @param id 要删除说说的id
     * @return 返回结果
     */
    @Override
    public ResponseResult deleteSaysayById(Long id) {
        try {
            saysayMapper.deleteSaysayById(id);
            return ResponseResult.success();
        } catch (RuntimeException e) {
            return ResponseResult.error(e.getMessage());
        }
    }

    /**
     * 修改说说
     * @param saysay 修改的说说
     * @return 返回结果
     */
    @Override
    public ResponseResult putSaysayById(Saysay saysay) {
        try {
            saysayMapper.putSaysayById(saysay);
            return ResponseResult.success();
        } catch (RuntimeException e) {
            return ResponseResult.error(e.getMessage());
        }
    }

    /**
     * 查询所有说说
     * @return 返回说说列表
     */
    @Override
    public ResponseResult queryAllSaysay() {
        List<Saysay> list = saysayMapper.queryAllSaysay();
        if (list.isEmpty()) {
            return ResponseResult.error("暂无数据");
        } else {
            return ResponseResult.success(list);
        }
    }
}
