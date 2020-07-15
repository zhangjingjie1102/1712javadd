package com.zhangjingjie.demo0715rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Demo0715rkApplication {

    public static void main(String[] args) {
        System.out.println("服务启动了！！！");
        SpringApplication.run(Demo0715rkApplication.class, args);
    }

}
