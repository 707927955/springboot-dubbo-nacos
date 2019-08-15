package com.kim.order.services;

import com.kim.common.services.OrderService;
import com.kim.common.vo.UserVo;
import com.kim.order.config.OrderConfig;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>Title: </p >
 * <p>Description: </p >
 * <p>Copyright: Copyright (c) 2016</p >
 * <p>Company: Sunshine Insurance Group Co., Ltd.</p >
 *
 * @author xuhaibin
 * @version 1.0
 * 修改记录：
 * 修改序号，修改日期，修改人，修改内容
 */
@Component
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderConfig orderConfig;

    @Override
    public UserVo getUserInfoByOrderId(Integer orderId) {
        if(orderId == null || orderId < 0){
            throw new IllegalArgumentException("orderId is null");
        }
        UserVo userVo = new UserVo();
        userVo.setUserId(orderConfig.getOrderId());
//        userVo.setUserName("测试订单服务成功");
        userVo.setUserName(orderConfig.getOrderName());
        return userVo;
    }
}