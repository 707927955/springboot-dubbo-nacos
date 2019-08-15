package com.kim.user.config;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
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

@Data
@Component
@NacosConfigurationProperties(dataId = "userInfo", type = ConfigType.YAML, autoRefreshed = true,prefix = "user",groupId = "userInfo")
public class UserInfoConfigYml implements Serializable {

    private String userName;
    private String address;
    private String iphone;

}