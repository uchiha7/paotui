package com.runningman.paotui.mapper;

<<<<<<< HEAD
import com.runningman.paotui.pojo.Order;
import com.runningman.paotui.pojo.OrderTitle;
import com.runningman.paotui.pojo.OrdersUser;
=======
import com.runningman.paotui.pojo.*;
>>>>>>> upstream/master
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
=======
import java.util.Date;
>>>>>>> upstream/master
import java.util.List;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2019/10/23
 * @Description: com.runningman.paotui.mapper
 * @versio: 1.0
 */
@Repository
@Mapper
public interface OrderMapper {
    /**
     * 创建订单
     * @param order
     */
    void insertOrder(Order order);

    /**
     * 根据用户的姓名查找改用户的订单
     * @param user
     * @return
     */
    List<Order> selectOrderByUser(String user);

    /**
     * 显示所有的订单列表
     * @param page
     * @param limit
     * @return
     */
<<<<<<< HEAD
    List<Order> getAllOrder(int page,int limit);
=======
    List<OrderTitle> getAllOrder(int page,int limit);
>>>>>>> upstream/master

    /**
     * 显示订单数
     * @return
     */
    int getOrderCount();

    /**
     * 用户查看自己发布的订单列表
     * @param user
     * @param page
     * @param limit
     * @return
     */
    List<OrdersUser> getUserOrders(String user,int page,int limit);

    /**
     * 显示用户订单数
     * @return
     */
    int getUserOrderCount(String user);
<<<<<<< HEAD
=======

    /**
     * 接单之前查看订单的详细内容
     * @param id
     * @return
     */
    OrderInfo getOrderInfo(int id);

    /**
     * 设置订单的配送员
     * @param id
     */
    void setDelivery(int id,String delivery);

    /**
     * 获取订单截止时间
     * @param id
     * @return
     */
    Date getOrderEndTime(int id);

    /**
     * 获取跑腿员接了的单
     * @param username
     * @return
     */
    List<OrderStatus> getOrderStatus(@Param("username") String username);
>>>>>>> upstream/master

    List<OrderTitle> selectByTitle(String title);

}
