package com.chen.serviceImp;

import com.chen.dao.mapper.AppointmentUserMapper;
import com.chen.entity.AppointmentUser;
import com.chen.entity.AppointmentUserExample;
import com.chen.service.AppointmentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentUserServiceImp implements AppointmentUserService {

    @Autowired
    private AppointmentUserMapper appUserMapper;

    @Override
    public List<AppointmentUser> getList() {
        AppointmentUserExample example = new AppointmentUserExample();
        example.or();
        return appUserMapper.selectByExample(example);
    }
}
