package com.seed.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seed.entity.Duty;
import com.seed.vo.DutyUpdateVO;

import java.util.List;

public interface IDutyService extends IService<Duty> {

    /**
     * 插入
     * @param duty
     * @return
     */
    Integer insertDutyData(Duty duty);

    /**
     * 查询
     * @param duty
     * @return
     */
    List<Duty> queryDutyList(Duty duty);

    /**
     * 修改信息
     * @param dutyUpdateVO
     * @return
     */
    Integer updateDutyInfo(DutyUpdateVO dutyUpdateVO);

}
