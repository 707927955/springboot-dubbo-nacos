package com.kim.common.services;

import com.kim.common.vo.OrderVO;

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
public interface UserService {

    OrderVO getOrderInfoByUserId(Integer userId);

    Object printInfo();
}