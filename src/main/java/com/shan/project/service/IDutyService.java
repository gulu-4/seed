package com.shan.project.service;

import com.shan.project.entity.Duty;
import java.util.List;

public interface IDutyService {

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

}
