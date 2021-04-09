package com.example.smartpensionspringboot.fbm.controller;

import com.example.smartpensionspringboot.fbm.pojos.FbmFood;
import com.example.smartpensionspringboot.fbm.service.FbmFoodService;
import com.example.smartpensionspringboot.fbm.vo.ParamsVo;
import com.example.smartpensionspringboot.fbm.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
public class FbmFoodController {
    @Autowired
    private FbmFoodService fbmFoodService;

    /**
     *  查询食物，模糊查询
     * @param paramsVo
     * @return
     */
    @RequestMapping("/getDetails")
    public ResultVo queryRegALL(@RequestBody(required = false) ParamsVo paramsVo) {
        try {
            return new ResultVo(200,"成功",fbmFoodService.querybFood(paramsVo));
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(500,"失败",null);
        }
    }

    /**
     *   新增食物
     * @param fbmFood
     * @return
     */
    @RequestMapping("/addFood")
    public ResultVo addFood(@RequestBody(required = false) FbmFood fbmFood) {
        try {
            fbmFoodService.addFood(fbmFood);

            return new ResultVo(200,"成功",1);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(500,"失败",-1);
        }
    }

    /**
     * 修改食物
     * @param fbmFood
     * @return
     */
    @RequestMapping("/updateFood")
    public ResultVo updateFood(@RequestBody(required = false) FbmFood fbmFood) {
        try {
            fbmFoodService.updateFood(fbmFood);
            return new ResultVo(200,"成功",1);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(500,"失败",-1);
        }
    }

    /**
     *  删除食物
     * @param id
     * @return
     */
    @RequestMapping("/deleteFood")
    public ResultVo deleteFood(@RequestParam("id") Integer id) {
        try {
            System.out.println(id);
            fbmFoodService.deleteFood(id);
            return new ResultVo(200,"成功",1);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(500,"失败",-1);
        }
    }
}
