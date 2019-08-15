package com.kim.common.vo;

import lombok.Data;

import java.io.Serializable;

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
@Data
public class UserVo implements Serializable {

    private Integer userId;

    private String userName;
}