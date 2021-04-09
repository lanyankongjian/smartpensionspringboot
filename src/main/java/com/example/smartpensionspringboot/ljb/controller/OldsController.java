package com.example.smartpensionspringboot.ljb.controller;

import com.example.smartpensionspringboot.cj.pojos.RecOld;
import com.example.smartpensionspringboot.ljb.pojos.RecOld2;
import com.example.smartpensionspringboot.ljb.service.OldService;
import com.example.smartpensionspringboot.ljb.util.Result;
import com.example.smartpensionspringboot.ljb.vo.OldAndPagevo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/old")
public class OldsController {
    @Autowired
    private OldService oldService;

    /**
     * 获取所有
     * @param currentPage
     * @param pageSize
     * @return
     */
    @GetMapping("/getAllOld")
    public Result getAllOld(@Param("currentPage") int currentPage, @Param("pageSize") int pageSize){
//        分页前数据
        List<RecOld> allOld = oldService.getAllOld();

//        开始分页
        PageHelper.startPage(currentPage,pageSize);

//        分页后数据
        List<RecOld> OldList = oldService.getAllOld();

//        创建PageInfo对象，并将分页后数据存放至对象中
        PageInfo<RecOld2> pageInfo = new PageInfo(OldList);

//        创建返回结果类
        Result result = new Result();

//        设置分页后的返回数据
        result.setData(pageInfo.getList());

//        设置步长
        result.setPageSize(pageSize);

//      设置当前页
        result.setCurrentPage(currentPage);

//        设置总条数
        result.setTotal(allOld.size());

        result.setMessage("获取数据成功");
        return result;
    }

    @PostMapping("/fazzySearchByOld")
    public Result fazzySearchByOld(@RequestBody OldAndPagevo oldAndPagevo){
//        创建一个老人类，用于存放老人信息
        RecOld recOld = new RecOld();

//        判断上传的性别 ,如果是全部，则将性别设为空，不考虑性别筛选
        if(oldAndPagevo.getGender().equals("全部")){
            oldAndPagevo.setGender(null);
        }

//        将vo中的属性，赋值给老人表中相同属性名的属性
        BeanUtils.copyProperties(oldAndPagevo,recOld);

//        分页前模糊查询，获取总条目数
        List<RecOld> recOlds = oldService.fazzySearchByOld(recOld);
    
//        分页
        PageHelper.startPage(oldAndPagevo.getCurrentPage(),oldAndPagevo.getPageSize());
        
//        分页后的模糊查询
        List<RecOld> oldList = oldService.fazzySearchByOld(recOld);

//        创建分页对象，存放分页后数据
        PageInfo pageInfo = new PageInfo(oldList);

//       创建返回类对象
        Result result = new Result();

//        存放数据 ,设置总条目数
        result.setTotal(recOlds.size());

//        设置返回数据
        result.setData(pageInfo.getList());

        result.setMessage("获取数据成功");
        return result;
    }

    /**
     * 添加老人信息
     * @param old
     * @return
     */
    @Transactional
    @CrossOrigin
    @PostMapping("/addOld")
    public Result addOld(@RequestBody RecOld old){

//        设置老人创建时间
        old.setCtime(new Date());

//        设置老人状态为入住
        old.setStatus(1l);

//        添加老人信息，并返回老人的id
        long l = oldService.addOld(old);

//        创建返回类，并将id返回到前端
        Result result = new Result();
        result.setData(l);
        result.setMessage("添加成功");
        return result;
    }

    @Transactional
    @CrossOrigin
    @GetMapping("/getOldByOldId")
    public Result getOldByOldId(@RequestParam("oldId") long id){
        //根据老人id获取老人信息
        RecOld oldByOldId = oldService.getOldByOldId(id);
        Result result = new Result();
        result.setData(oldByOldId);
        result.setMessage("获取数据成功");
        return result;
    }

}
