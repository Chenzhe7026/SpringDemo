package com.chen.dao.mapper;

import com.chen.entity.AppointmentUser;
import com.chen.entity.AppointmentUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface AppointmentUserMapper {
    int countByExample(AppointmentUserExample example);

    int deleteByExample(AppointmentUserExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(AppointmentUser record);

    int insertSelective(AppointmentUser record);

    List<AppointmentUser> selectByExample(AppointmentUserExample example);

    AppointmentUser selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") AppointmentUser record, @Param("example") AppointmentUserExample example);

    int updateByExample(@Param("record") AppointmentUser record, @Param("example") AppointmentUserExample example);

    int updateByPrimaryKeySelective(AppointmentUser record);

    int updateByPrimaryKey(AppointmentUser record);
}