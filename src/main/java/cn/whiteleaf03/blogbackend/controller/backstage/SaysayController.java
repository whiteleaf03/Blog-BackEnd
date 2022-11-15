package cn.whiteleaf03.blogbackend.controller.backstage;

import cn.whiteleaf03.blogbackend.entity.Saysay;
import cn.whiteleaf03.blogbackend.service.backstage.SaysayService.SaysayService;
import cn.whiteleaf03.blogbackend.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author WhiteLeaf03
 */
@RestController
@RequestMapping("/bs/api/saysay")
public class SaysayController {
    private final SaysayService saysayService;

    @Autowired
    public SaysayController(SaysayService saysayService) {
        this.saysayService = saysayService;
    }

    @PostMapping("")
    public ResponseResult addSaysay(@RequestBody Saysay saysay) {
        return saysayService.addSaysay(saysay);
    }

    @GetMapping("")
    public ResponseResult queryAllSaysay() {
        return saysayService.queryAllSaysay();
    }

    @PutMapping("")
    public ResponseResult putSaysayById(@RequestBody Saysay saysay) {
        return saysayService.putSaysayById(saysay);
    }

    @DeleteMapping("")
    public ResponseResult deleteSaysayById(@RequestBody Saysay saysay) {
        return saysayService.deleteSaysayById(saysay.getId());
    }
}
