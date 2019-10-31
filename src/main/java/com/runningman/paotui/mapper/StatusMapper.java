package com.runningman.paotui.mapper;

import com.runningman.paotui.pojo.Status;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2019/10/31
 * @Description: com.runningman.paotui.mapper
 * @versio: 1.0
 */
@Repository
@Mapper
public interface StatusMapper {

    /**
     * 为每份订单创建一个状态
     * @param status
     */
    void insertStatus(Status status);
}