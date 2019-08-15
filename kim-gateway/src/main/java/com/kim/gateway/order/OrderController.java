package com.kim.gateway.order;

import com.kim.common.services.OrderService;
import com.kim.common.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

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
@RestController
@RequestMapping("/order/")
@Slf4j
public class OrderController {

    @Reference(interfaceClass = OrderService.class,check = false,timeout = 10000)
    private OrderService orderService;

    @GetMapping("/getUserInfo/{orderId}")
    @ResponseBody
    public UserVo getUserInfoByOrderId(@PathVariable(name = "orderId",required = false) String orderId){
        UserVo userVo = orderService.getUserInfoByOrderId(Integer.parseInt(orderId));
        return userVo;
    }
}