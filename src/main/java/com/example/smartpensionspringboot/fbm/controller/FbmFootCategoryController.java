package com.example.smartpensionspringboot.fbm.controller;

import com.example.smartpensionspringboot.fbm.pojos.FbmFootCategory;
import com.example.smartpensionspringboot.fbm.service.FbmFootCategoryService;
import com.example.smartpensionspringboot.fbm.vo.ParamsVo;
import com.example.smartpensionspringboot.fbm.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foot")
public class FbmFootCategoryController {
    @Autowired
     FbmFootCategoryService fbmFootCategoryService;
    //查询食物类别
    @RequestMapping("/getFoot")
    public ResultVo queryReg(@RequestBody(required = false) ParamsVo paramsVo) {
        System.out.printf("....."+ paramsVo.getPage());
        try {
            return new ResultVo(200,"成功",fbmFootCategoryService.findEmpAll(paramsVo));
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(500,"失败",null);
        }
    }
    //新增食物类别
    @RequestMapping("/addFoot")
    public ResultVo addFoot(@RequestBody(required = false)FbmFootCategory fbmFootCategory) {
        try {
            fbmFootCategoryService.addFootCategory(fbmFootCategory);
           return new ResultVo(200,"成功",1);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(500,"失败",-1);
        }
    }
    //修改食物类别
    @RequestMapping("/updateFoot")
    public ResultVo updateFoot(@RequestBody(required = false)FbmFootCategory fbmFootCategory) {
        try {
            fbmFootCategoryService.updateFoot(fbmFootCategory);
            return new ResultVo(200,"成功",1);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(500,"失败",-1);
        }
    }
    //删除食物类别
    @PostMapping("/delectFoot")
    public ResultVo delectFoot(Integer id) {
        try {
            String s = fbmFootCategoryService.deleteCategory(id);
            return new ResultVo(200,s,1);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(500,"失败",-1);
        }
    }
}
