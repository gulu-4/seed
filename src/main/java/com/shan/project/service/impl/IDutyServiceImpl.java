package com.shan.project.service.impl;

import com.shan.project.entity.Duty;
import com.shan.project.mapper.DutyMapper;
import com.shan.project.service.IDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDutyServiceImpl implements IDutyService {

    @Autowired
    private DutyMapper dutyMapper;


    @Override
    public Integer insertDutyData(Duty duty) {

        return dutyMapper.insertData(duty);
    }

    @Override
    public List<Duty> queryDutyList(Duty duty) {

        return dutyMapper.queryList(duty);
    }
}
