package com.dequan.dequanprovider;

import com.dequan.common.aop.SystemLogAop;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.dequan.dequanprovider",scanBasePackageClasses = SystemLogAop.class)
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan(basePackages = "com.dequan.dequanprovider.dao")
public class DequanProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DequanProviderApplication.class, args);
    }

}
