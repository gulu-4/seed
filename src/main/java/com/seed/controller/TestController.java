package com.seed.controller;

import com.seed.entity.Duty;
import com.seed.service.IDutyService;
import com.seed.vo.DutyCreateVO;
import com.seed.vo.DutyUpdateVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Api(tags = "测试")
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private IDutyService dutyService;

    @ApiOperation(value = "插入")
    @PostMapping(value = "/create")
    public String insertDutyData(@RequestBody DutyCreateVO dutyCreateVO){

        Duty duty = new Duty();
        duty.setId(UUID.randomUUID().toString());
        duty.setName(dutyCreateVO.getName());
        duty.setCreateTime(new Date());

        Integer tag = dutyService.insertDutyData(duty);

        return tag > 0 ? "插入成功！" : "插入失败";
    }

    @ApiOperation(value = "查询")
    @GetMapping(value = "/query")
    public List<Duty> selectDutyData(Duty duty){

        //List<Duty> list = dutyService.list();

        List<Duty> duties = dutyService.queryDutyList(duty);

        return duties;
    }

    @ApiOperation(value = "修改")
    @PostMapping(value = "/update")
    public String updateDutyData(@RequestBody DutyUpdateVO dutyUpdateVO){

        Integer integer = dutyService.updateDutyInfo(dutyUpdateVO);
        return integer > 0 ?"修改成功！" : "修改失败！";
    }

    @ApiOperation(value = "删除")
    @DeleteMapping(value = "删除")
    public String deleteDutyData(){

        return "";
    }


}
