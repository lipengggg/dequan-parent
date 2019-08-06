package com.dequan.dequanpay.hystrix;

import com.dequan.dequanpay.service.DemoService;
import org.springframework.stereotype.Component;

/**
 *
 * @author lipeng
 * @version Id: DemoServiceHystric.java, v 0.1 2019/4/26 16:14 lipeng Exp $$
 */
@Component
public class DemoServiceHystric implements DemoService {

    @Override
    public String getUser() {
        return "服务超时，请重新再试";
    }
}
