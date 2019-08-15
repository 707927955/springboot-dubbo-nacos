package com.kim.user.config;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import lombok.Data;
import org.springframework.stereotype.Component;

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
/*
    //必须用下面这个格式
    {"name":"张三",
"address":"厦门",
"iphone":"13465746761"}
 */
@Data
@Component
@NacosConfigurationProperties(dataId = "userInfo", type = ConfigType.JSON, autoRefreshed = true,groupId = "json")
public class UserInfoConfigJson implements Serializable {

    private String name;
    private String address;
    private String iphone;

}