package com.kim.user.services;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.kim.common.services.UserService;
import com.kim.common.vo.OrderVO;
import com.kim.user.config.Apple;
import com.kim.user.config.UserInfoConfigJson;
import com.kim.user.config.UserInfoConfigYml;
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
public class UserServiceImpl implements UserService {

    @NacosValue(value = "${user.id}",autoRefreshed = true)//不用再带#转成Integer了
    private Integer userId;

    @NacosValue(value = "${user.uname}",autoRefreshed = true)//配置中心不能出现userName，不然不知道为什么会取计算机的用户名
    private String userName;

//    @Autowired
//    private ConfigurableApplicationContext applicationContext;

    @Autowired
    private UserInfoConfigYml userInfoConfig;
    @Autowired
    private UserInfoConfigJson userInfoConfigJson;

    @Autowired
    private Apple apple;

    @Override
    public OrderVO getOrderInfoByUserId(Integer uid) {
        if(userId == null || userId < 0){
            throw new IllegalArgumentException("userId is null");
        }
        OrderVO orderVO = new OrderVO();
//        orderVO.setOrderId(Integer.parseInt(applicationContext.getEnvironment().getProperty("user.id")));
//        orderVO.setOrderName(applicationContext.getEnvironment().getProperty("user.name"));
        orderVO.setOrderId(userId);
        orderVO.setOrderName(userName);
        return orderVO;
    }

    @Override
    public Object printInfo() {

        return userInfoConfigJson;
    }

}