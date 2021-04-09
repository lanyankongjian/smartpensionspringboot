package com.example.smartpensionspringboot.fbm.controller;

import com.example.smartpensionspringboot.fbm.pojos.FbmRecipe;
import com.example.smartpensionspringboot.fbm.service.FbmRecipeService;
import com.example.smartpensionspringboot.fbm.vo.ParamsVo;
import com.example.smartpensionspringboot.fbm.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe")
public class FbmRecipeController {
    @Autowired
    private FbmRecipeService fbmRecipeService;
    //查询食谱
    @RequestMapping("/getRecipe")
    public ResultVo queryReg(@RequestBody(required = false) ParamsVo paramsVo) {
        System.out.printf("....." + paramsVo);
        try {
            return new ResultVo(200, "成功", fbmRecipeService.querybRecipe(paramsVo));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultVo(500, "失败", null);
        }
    }
    //新增食谱
    @RequestMapping("/addRecipe")
    public ResultVo addRecipe(@RequestBody(required = false)FbmRecipe fbmRecipe) {
        try {
            fbmRecipeService.addRecipe(fbmRecipe);

            return new ResultVo(200,"成功",1);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(500,"失败",-1);
        }
    }
    //修改食谱
    @RequestMapping("/updateRecipe")
    public ResultVo updateRecipe(@RequestBody(required = false) FbmRecipe fbmRecipe) {
        try {
            fbmRecipeService.updateRecipe(fbmRecipe);
            return new ResultVo(200,"成功",1);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(500,"失败",-1);
        }
    }
    //删除食谱
    @RequestMapping("/deleteRecipe")
    public ResultVo deleteFood(@RequestParam("id") Integer id) {
        try {
            fbmRecipeService.deleteRecipe(id);
            return new ResultVo(200,"成功",1);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(500,"失败",-1);
        }
    }
}
