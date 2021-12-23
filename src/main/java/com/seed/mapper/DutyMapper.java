package com.seed.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seed.entity.Duty;
import com.seed.vo.DutyUpdateVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DutyMapper extends BaseMapper<Duty> {

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


    Integer updateDutyInfo(@Param("param") DutyUpdateVO dutyUpdateVO);

}
