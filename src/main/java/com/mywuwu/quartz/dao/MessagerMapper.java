package com.mywuwu.quartz.dao;

import com.mywuwu.quartz.entity.Messager;

import java.util.List;

public interface MessagerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table messager
     *
     * @mbggenerated
     */
    int insert(Messager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table messager
     *
     * @mbggenerated
     */
    int insertMessager(Messager record);

    /**
     * 查询所有的信息记录
     * @return 查询所有信息记录
     */
    List<Messager> selectMessagerAll();
}