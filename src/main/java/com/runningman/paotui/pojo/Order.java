package com.runningman.paotui.pojo;

<<<<<<< HEAD
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
=======

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import com.fasterxml.jackson.annotation.JsonFormat;
>>>>>>> upstream/master

import java.util.Date;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2019/10/23
 * @Description: com.runningman.paotui.pojo
 * @versio: 1.0
 */

@Setter
@Getter
<<<<<<< HEAD
=======
@ToString
>>>>>>> upstream/master
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private int id;  //订单id
<<<<<<< HEAD
    private String titile;
=======
    private String title;
>>>>>>> upstream/master
    private String user;
    private String delivery;
    private String begin;
    private String end;
    private String start_Lnglat;
    private String end_lnglat;
    private String reward;
    //private Date orderTime; //下单时间
<<<<<<< HEAD
=======

>>>>>>> upstream/master
    private Date endtime;

}
