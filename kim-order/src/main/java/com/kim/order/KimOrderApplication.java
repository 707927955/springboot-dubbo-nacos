package com.kim.order;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//激活 Dubbo 注解驱动以及外部化配置，其 scanBasePackages 属性扫描指定 Java 包，将所有标注 @Service 的服务接口实现类暴露为 Spring Bean，随即被导出 Dubbo 服务
@EnableDubbo(scanBasePackages = "com.kim.order.services")
//@PropertySource 是 Spring Framework 3.1 引入的标准导入属性配置资源注解，它将为 Dubbo 提供外部化配置
@PropertySource(value = "classpath:/application.properties")
@NacosPropertySource(dataId = "order",autoRefreshed = true)
public class KimOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(KimOrderApplication.class, args);
    }

}
