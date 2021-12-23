package com.seed.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seed.entity.Duty;
import com.seed.mapper.DutyMapper;
import com.seed.service.IDutyService;
import com.seed.vo.DutyUpdateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DutyServiceImpl extends ServiceImpl<DutyMapper, Duty> implements IDutyService {

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


        dutyMapper.selectList(queryWrapper);

        return dutyMapper.selectList(queryWrapper);

        //return dutyMapper.queryList(duty);
    }

    @Override
    public Integer updateDutyInfo(DutyUpdateVO dutyUpdateVO) {


        return dutyMapper.updateDutyInfo(dutyUpdateVO);
    }
}
