package com.demo.springbootdemo.dao;



import com.demo.springbootdemo.domain.City;
import com.demo.springbootdemo.domain.cityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface cityMapper {
    int countByExample(cityExample example);

    int deleteByExample(cityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(cityExample example);

    City selectByPrimaryKey(@Param("id") Integer id);

    int updateByExampleSelective(@Param("record") City record, @Param("example") cityExample example);

    int updateByExample(@Param("record") City record, @Param("example") cityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}