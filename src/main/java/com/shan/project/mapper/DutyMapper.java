package com.shan.project.mapper;

import com.shan.project.entity.Duty;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.plugin.Intercepts;

import java.util.List;

@Mapper
public interface DutyMapper {

    /**
     * 查询数据
     * @param duty
     * @return
     */
    List<Duty> queryList(@Param("param") Duty duty);

    /**
     * 插入数据
     * @param duty
     * @return
     */
    Integer insertData(@Param("param") Duty duty);

}
