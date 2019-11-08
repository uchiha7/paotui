package com.runningman.paotui.pojo;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
=======
import lombok.*;
>>>>>>> upstream/master
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2019/10/31
 * @Description: com.runningman.paotui.pojo
 * @versio: 1.0
 */
@Getter
@Setter
<<<<<<< HEAD
=======
@ToString
>>>>>>> upstream/master
@NoArgsConstructor
@AllArgsConstructor
public class OrderTitle {
    private int id;
<<<<<<< HEAD
    private String user;
=======
    private String name;
    private String username;
    private String title;
>>>>>>> upstream/master
    private String begin;
    private String end;
    private String reward;
}
