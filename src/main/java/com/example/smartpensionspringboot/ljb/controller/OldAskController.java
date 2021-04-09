package com.example.smartpensionspringboot.ljb.controller;

import com.example.smartpensionspringboot.ljb.pojos.RecAsk;
import com.example.smartpensionspringboot.ljb.pojos.RecOldask;
import com.example.smartpensionspringboot.ljb.service.AskAndOldService;
import com.example.smartpensionspringboot.ljb.service.AskService;
import com.example.smartpensionspringboot.ljb.service.OldAskService;
import com.example.smartpensionspringboot.ljb.util.Result;
import com.example.smartpensionspringboot.ljb.vo.AskAndOld;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/oldask")
public class OldAskController {

    @Autowired
    private AskAndOldService askAndOldService;

    @Autowired
    private AskService askService;

    @Autowired
    private OldAskService oldAskService;

    @GetMapping("/getAskAndOld")
    public Result getAskAndOld(@Param("currentPage") int currentPage, @Param("pageSize") int pageSize){

        //获取数据总条目数
        List<AskAndOld> askAndOld = askAndOldService.getAskAndOld();

        //分页
        PageHelper.startPage(currentPage, pageSize);

        //获取分页后的数据
        List<AskAndOld> aad = askAndOldService.getAskAndOld();


        //创建PageInfo对象，并将分页后数据存放至对象中
        PageInfo<AskAndOld> pageInfo=new PageInfo(aad);

        //设置总条目数
        pageInfo.setTotal(askAndOld.size());

        //创建返回结果类
        Result result = new Result();

//        设置数据
        result.setData(pageInfo.getList());
//        设置当前页
        result.setCurrentPage(currentPage);
//        设置步长
        result.setPageSize(pageSize);
//        设置总页数
        result.setTotal(pageInfo.getTotal());

        result.setMessage("获取数据成功");
        return result;
    }


    /**
     * 创建咨询人信息和咨询的老人信息
     * @param askAndOld
     * @return
     */
    @Transactional
    @PostMapping("/addAskAndAskOld")
    public Result addAskAndAskOld(@RequestBody AskAndOld askAndOld){

        List<RecAsk> recAsks = askAndOld.getRecAsks();

        //获取咨询人信息
        RecAsk recAsk = recAsks.get(0);

        //如果咨询日期没有填写，则默认为当前时间
        if(recAsk.getAskDate() == null){
            recAsk.setAskDate(new Date());
        }
        //设置创建时间
        recAsk.setCtime(new Date());

        //将咨询人信息录入到数据库，并返回咨询人id
        long id = askService.addAsk(recAsk);

        //创建一个老人咨询类对象，用于录入信息
        RecOldask recOldask = new RecOldask();

        //将vo对象的值根据属性名和类型赋值给RecOldask对象
        BeanUtils.copyProperties(askAndOld,recOldask);

        //设置咨询老人相关的咨询人id
        recOldask.setAskId(id);

        //设置创建时间
        recOldask.setCtime(new Date());

        //录入咨询老人的信息
        oldAskService.addOldAsk(recOldask);

        Result result = new Result();
        result.setMessage("创建成功");
        return result;
    }


    /**
     * 模糊查询
     * @param status
     * @param taskname
     * @param toldname
     * @return
     */
    @Transactional
    @GetMapping("/vagueselect")
    public Result vagueselect(String status ,String taskname,String toldname,@Param("currentPage") int currentPage, @Param("pageSize") int pageSize){
        AskAndOld askAndOld = new AskAndOld();
        RecAsk recAsk = new RecAsk();

        //设置咨询老人的状态
        if(status.equals("1")){
            askAndOld.setStatus(1l);
        }else if(status.equals("2")){
            askAndOld.setStatus(2l);
        }


        //设置咨询老人的名称
        askAndOld.setOldaskName(toldname);

        //设置咨询者的名字
        recAsk.setAskName(taskname);

        //将recAsk对象赋值给askAndOld
        List<RecAsk> list = new ArrayList<>();
        list.add(recAsk);
        askAndOld.setRecAsks(list);

        //分页前模糊查询
        List<AskAndOld> askAndOlds = askAndOldService.conditionalQuery(askAndOld);

        //分页
        PageHelper.startPage(currentPage, pageSize);

        //获取分页后模糊查询的数据
        List<AskAndOld> aad = askAndOldService.conditionalQuery(askAndOld);


        //创建PageInfo对象，并将分页后数据存放至对象中
        PageInfo<AskAndOld> pageInfo=new PageInfo(aad);

        //设置总条目数
        pageInfo.setTotal(askAndOlds.size());

        //创建返回结果类
        Result result = new Result();

//        设置数据
        result.setData(pageInfo.getList());
//        设置当前页
        result.setCurrentPage(currentPage);
//        设置步长
        result.setPageSize(pageSize);
//        设置总页数
        result.setTotal(pageInfo.getTotal());

        result.setMessage("模糊查询成功");
        return result;
    }


    @Transactional
    @PostMapping("/upAskAndAskOld")
    public Result upAskAndAskOld(@RequestBody AskAndOld askAndOld){

        List<RecAsk> recAsks = askAndOld.getRecAsks();

        //获取咨询人信息
        RecAsk recAsk = recAsks.get(0);

        //将咨询人信息录入到数据库，并返回咨询人id
        askService.upAsk(recAsk);

        //创建一个老人咨询类对象，用于修改信息
        RecOldask recOldask = new RecOldask();

        //将vo对象的值根据属性名和类型赋值给RecOldask对象
        BeanUtils.copyProperties(askAndOld,recOldask);


        //修改咨询老人的信息
        oldAskService.upOldAsk(recOldask);

        Result result = new Result();
        result.setMessage("修改成功");
        return result;
    }
    


}
