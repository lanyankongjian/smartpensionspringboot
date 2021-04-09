package com.example.smartpensionspringboot.ljb.controller;

import com.example.smartpensionspringboot.ljb.pojos.RecBed;
import com.example.smartpensionspringboot.ljb.pojos.RecRestaurant;
import com.example.smartpensionspringboot.ljb.service.BedService;
import com.example.smartpensionspringboot.ljb.service.RestaurantService;
import com.example.smartpensionspringboot.ljb.util.Result;
import com.example.smartpensionspringboot.ljb.vo.BedAndRestaurant;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Transactional
@CrossOrigin
@RestController
@RequestMapping("/bedAndRes")
public class BedAndRestaurantController {
    @Autowired
    private BedService bedService;

    @Autowired
    private RestaurantService restaurantService;

    @RequestMapping("/addBedAndRes")
    public Result addBedAndRes(@RequestBody BedAndRestaurant bedAndRestaurant){

        //创建餐饮实体类
        RecRestaurant recRestaurant = new RecRestaurant();
        recRestaurant.setCtime(new Date());

        //创建床位实体类
        RecBed recBed = new RecBed();
        recBed.setCtime(new Date());

//        根据属性名赋值
        BeanUtils.copyProperties(bedAndRestaurant,recBed);
        BeanUtils.copyProperties(bedAndRestaurant,recRestaurant);

        System.out.println(bedAndRestaurant);

//        添加床位信息
        bedService.addBed(recBed);
//        添加餐饮信息
        restaurantService.addRes(recRestaurant);

        System.out.println(recBed.getBedId());
        System.out.println(recRestaurant.getResId());

//        将id返回到前端
        List list = new ArrayList();
        list.add(recBed.getBedId());
        list.add(recRestaurant.getResId());

        Result result = new Result();
        result.setData(list);
        result.setMessage("创建成功");
        return result;
    }

    @RequestMapping("/upBedAndRes")
    public Result upBedAndRes(@RequestBody BedAndRestaurant bedAndRestaurant){

        //创建餐饮实体类
        RecRestaurant recRestaurant = new RecRestaurant();
        recRestaurant.setCtime(new Date());

        //创建床位实体类
        RecBed recBed = new RecBed();
        recBed.setCtime(new Date());

//        根据属性名赋值
        BeanUtils.copyProperties(bedAndRestaurant,recBed);
        BeanUtils.copyProperties(bedAndRestaurant,recRestaurant);

        System.out.println(bedAndRestaurant);

//        添加床位信息
        bedService.addBed(recBed);
//        添加餐饮信息
        restaurantService.addRes(recRestaurant);

        System.out.println(recBed.getBedId());
        System.out.println(recRestaurant.getResId());

//        将id返回到前端
        List list = new ArrayList();
        list.add(recBed.getBedId());
        list.add(recRestaurant.getResId());

        Result result = new Result();
        result.setData(list);
        result.setMessage("修改成功");
        return result;
    }

    /**
     * 根据老人id获取床位餐饮信息
     * @param id
     * @return
     */
    @GetMapping("/getBedAndResByOldId")
    public Result getBedAndResByOldId(@RequestParam("oldId") long id){
//        根据老人id获取床位餐饮信息
        RecBed bedByOldId = bedService.getBedByOldId(id);
        RecRestaurant resByOldId = restaurantService.getResByOldId(id);

//        根据属性名赋值
        BedAndRestaurant bedAndRestaurant = new BedAndRestaurant();
        BeanUtils.copyProperties(bedByOldId,bedAndRestaurant);
        BeanUtils.copyProperties(resByOldId,bedAndRestaurant);


        Result result = new Result();
        result.setData(bedAndRestaurant);
        result.setMessage("获取数据成功");
        return result;
    }

}
