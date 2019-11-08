package com.runningman.paotui.pojo;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
=======
import lombok.*;
>>>>>>> upstream/master
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.util.Date;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2019/10/31
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
public class Status {
    private int id;
    private int order_id;
    private String info;
    private Date time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
