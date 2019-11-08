package com.runningman.paotui.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.runningman.paotui.mapper.OrderMapper;
import com.runningman.paotui.mapper.StatusMapper;
<<<<<<< HEAD
import com.runningman.paotui.pojo.Order;
import com.runningman.paotui.pojo.OrderTitle;
import com.runningman.paotui.pojo.OrdersUser;
import com.runningman.paotui.pojo.Status;
import com.runningman.paotui.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.ParseException;
=======
import com.runningman.paotui.pojo.*;
import com.runningman.paotui.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
>>>>>>> upstream/master
import java.util.*;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2019/10/23
 * @Description: com.runningman.paotui.service.impl
 * @versio: 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private StatusMapper statusMapper;

<<<<<<< HEAD
    @Override
    public boolean makeOrder(String user,Order order) {
        try{
            order.setUser(user);
            orderMapper.insertOrder(order);
            Status status = new Status();
            status.setOrder_id(order.getId());
            status.setInfo("已发布");
            Date date = new Date();
            status.setTime(date);
            statusMapper.insertStatus(status);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
=======

    @Transactional(rollbackFor={RuntimeException.class, Exception.class})
    @Override
    public boolean makeOrder(String user,Order order) {
        order.setUser(user);
        orderMapper.insertOrder(order);
        Status status = new Status();
        status.setOrder_id(order.getId());
        status.setInfo("已发布");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = null;
        try{
            time = dateFormat.parse(dateFormat.format(new Date()));
        }catch (ParseException e){
            e.printStackTrace();
        }
        status.setTime(time);
        statusMapper.insertStatus(status);
        return true;
>>>>>>> upstream/master
    }

    @Override
    public List<Order> selectOrderByUser(String user) {
        return orderMapper.selectOrderByUser(user);
    }

    @Override
<<<<<<< HEAD
    public String getAllOrderList(int page,int limit) {
        List<Order> orders = orderMapper.getAllOrder((page-1)*limit,limit);
        int count= orderMapper.getOrderCount();
        List<OrderTitle> orderTitles=new LinkedList<>();
        for (Order r:orders){
            OrderTitle orderTitle = new OrderTitle();
            orderTitle.setId(r.getId());
            orderTitle.setUser(r.getUser());
            orderTitle.setBegin(r.getBegin());
            orderTitle.setEnd(r.getEnd());
            orderTitle.setReward(r.getReward());
            orderTitles.add(orderTitle);
        }

=======
    public List<OrderTitle> getAllOrderList(int page,int limit) {
        List<OrderTitle> orderTitles = orderMapper.getAllOrder((page-1)*limit,limit);

        /*int count= orderMapper.getOrderCount();
>>>>>>> upstream/master

        Map<String,Object> result=new HashMap<>();
        result.put("code",0);
        result.put("msg","其它数据");
        result.put("count",count);
<<<<<<< HEAD
        ObjectMapper mapper=new ObjectMapper();
        try {
=======

        ObjectMapper mapper=new ObjectMapper();
        try {
            result.put("data",orders);
>>>>>>> upstream/master
            String json=mapper.writeValueAsString(result);
            return json;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
<<<<<<< HEAD
        }
    }

    @Override
    public String getUserOrders(String user,int page, int limit) {
        List<OrdersUser> ordersUsers = orderMapper.getUserOrders(user,(page-1)*limit,limit);
        int count= orderMapper.getUserOrderCount(user);
        List<OrdersUser> orders=new LinkedList<>();
        for (OrdersUser r:ordersUsers){
            orders.add(r);
        }

=======
        }*/
        return orderTitles;
    }

    @Override
    public List<OrdersUser> getUserOrders(String user,int page, int limit) {
        List<OrdersUser> ordersUsers = orderMapper.getUserOrders(user,(page-1)*limit,limit);
        /*int count= orderMapper.getUserOrderCount(user);
>>>>>>> upstream/master

        Map<String,Object> result=new HashMap<>();
        result.put("code",0);
        result.put("msg","其它数据");
        result.put("count",count);
<<<<<<< HEAD
        ObjectMapper mapper=new ObjectMapper();
        try {
=======

        ObjectMapper mapper=new ObjectMapper();
        try {
            result.put("data",ordersUsers);
>>>>>>> upstream/master
            String json=mapper.writeValueAsString(result);
            return json;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
<<<<<<< HEAD
        }
=======
        }*/
        return ordersUsers;
    }

    @Override
    public OrderInfo getOrderInfo(int id) {
        OrderInfo orderInfo = orderMapper.getOrderInfo(id);
        /*Map<String,Object> result = new HashMap<>();
        result.put("code",0);
        result.put("msg", "订单的详细信息");
        ObjectMapper mapper = new ObjectMapper();
        try {
            result.put("data",orderInfo);
            String json = mapper.writeValueAsString(result);
            return json;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }*/
        return orderInfo;
    }

    @Override
    public void setDelivery(int id, String delivery) {
        orderMapper.setDelivery(id,delivery);
    }

    @Override
    public Date getOrderEndTime(int id) {
        return orderMapper.getOrderEndTime(id);
    }

    @Override
    public List<OrderStatus> getOrderStatus(String username) {
        return orderMapper.getOrderStatus(username);
    }

    @Override
    public int getOrderCount() {
        return orderMapper.getOrderCount();
    }

    @Override
    public int getUserOrderCount(String user) {
        return orderMapper.getUserOrderCount(user);
>>>>>>> upstream/master
    }
}
