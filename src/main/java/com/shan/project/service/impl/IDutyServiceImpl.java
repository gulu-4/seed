package com.shan.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shan.project.entity.Duty;
import com.shan.project.mapper.DutyMapper;
import com.shan.project.service.IDutyService;
import com.shan.project.vo.DutyCreateVO;
import com.shan.project.vo.DutyUpdateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDutyServiceImpl extends ServiceImpl<DutyMapper, Duty> implements IDutyService {

    @Autowired
    private DutyMapper dutyMapper;


    @Override
    public Integer insertDutyData(Duty duty) {

        return dutyMapper.insertData(duty);
    }

    @Override
    public List<Duty> queryDutyList(Duty duty) {

        QueryWrapper<Duty> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("id", duty.getId());
        queryWrapper.or();
        queryWrapper.like("name", duty.getName());

        return dutyMapper.selectList(queryWrapper);

        //return dutyMapper.queryList(duty);
    }

    @Override
    public Integer updateDutyInfo(DutyUpdateVO dutyUpdateVO) {


        return dutyMapper.updateDutyInfo(dutyUpdateVO);
    }
}
