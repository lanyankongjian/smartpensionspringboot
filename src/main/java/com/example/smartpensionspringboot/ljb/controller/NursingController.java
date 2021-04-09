package com.example.smartpensionspringboot.ljb.controller;

import com.example.smartpensionspringboot.ljb.pojos.RecNursing;
import com.example.smartpensionspringboot.ljb.service.NursingService;
import com.example.smartpensionspringboot.ljb.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Transactional
@RestController
@CrossOrigin
@RequestMapping("/nursing")
public class NursingController {

    @Autowired
    private NursingService nursingService;

    /**
     * 添加护理任务
     * @param recNursing
     * @return
     */
    @PostMapping("/addNursing")
    public Result addNursing(@RequestBody RecNursing recNursing){
        recNursing.setCtime(new Date());
        nursingService.addNursing(recNursing);
        Result result = new Result();
        result.setMessage("创建护理任务成功");
        return result;
    }

    /**
     * 修改护理任务
     * @param recNursing
     * @return
     */
    @PostMapping("/upNursing")
    public Result upNursing(@RequestBody RecNursing recNursing){
        nursingService.upNursing(recNursing);
        Result result = new Result();
        result.setMessage("修改护理任务成功");
        return result;
    }

    /**
     * 根据老人id获取护理信息
     */
    @GetMapping("getNursingByOldId")
    public Result getNursingByOldId(@RequestParam("oldId") Long id){
        List<RecNursing> nursingByOldId = nursingService.getNursingByOldId(id);
        Result result = new Result();
        result.setData(nursingByOldId);
        result.setMessage("获取数据成功");
        return result;
    }

}
