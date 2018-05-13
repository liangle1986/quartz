package com.mywuwu.quartz.dao;

import com.mywuwu.quartz.entity.Quartz;

import java.util.List;

public interface QuartzMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartztask
     *
     * @mbggenerated
     */
    int insertQuartzTask(Quartz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartztask
     *
     * @mbggenerated
     */
    int insertSelective(Quartz record);


    /**
     * 查询所有定时任务
     * @return 任务信息
     */
    List<Quartz> selectQuartzTaskAll();
}