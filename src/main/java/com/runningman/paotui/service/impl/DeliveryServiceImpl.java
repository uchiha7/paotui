package com.runningman.paotui.service.impl;

import com.runningman.paotui.mapper.OrderMapper;
import com.runningman.paotui.mapper.StatusMapper;
import com.runningman.paotui.pojo.Status;
import com.runningman.paotui.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DeliveryServiceImpl implements DeliveryService{

    @Autowired
    private StatusMapper statusMapper;

    @Override
    public Void changeState(int id, String state) {
        Status status = new Status();
        status.setOrder_id(id);
        status.setInfo(state);
        status.setTime(new Date());
        statusMapper.updateStatus(status);
        return null;
    }
}
