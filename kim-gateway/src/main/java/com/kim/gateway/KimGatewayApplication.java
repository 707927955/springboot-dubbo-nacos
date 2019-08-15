package com.kim.gateway;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@EnableDubbo 注解激活 Dubbo 注解驱动和外部化配置，不过当前属于服务消费者，无需指定 Java 包名扫描标注 @Service 的服务实现
@EnableDubbo
@PropertySource(value = "classpath:/application.properties")
public class KimGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(KimGatewayApplication.class, args);
    }

}
