package com.kim.gateway.user;

import com.alibaba.fastjson.JSONObject;
import com.kim.common.services.OrderService;
import com.kim.common.services.UserService;
import com.kim.common.vo.OrderVO;
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
@RequestMapping("/user/")
@Slf4j
public class UserController {

    @Reference(interfaceClass = UserService.class, check = false, timeout = 10000)
    private UserService userService;

    @GetMapping("/getOrderInfo/{userId}")
    @ResponseBody
    public OrderVO getOrderInfoByUserId(@PathVariable(name = "userId", required = false) String userId) {
        OrderVO orderVO = userService.getOrderInfoByUserId(Integer.parseInt(userId));
        return orderVO;
    }

    @RequestMapping("getUserInfoConfig")
    public String getUserInfo() {
        Object o= userService.printInfo();
        String s = JSONObject.toJSONString(o);
        return s;
    }
}