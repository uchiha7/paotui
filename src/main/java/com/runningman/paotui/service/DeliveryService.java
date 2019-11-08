package com.runningman.paotui.service;

public interface DeliveryService {

    /**
     *  修改订单状态
     * @param id 订单id
     * @param state 订单新状态
     * @return 无
     */
    public Void changeState(int id, String state) ;
}
