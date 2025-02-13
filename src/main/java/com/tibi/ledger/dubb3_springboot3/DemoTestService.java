package com.tibi.ledger.dubb3_springboot3;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * DemoTestService
 * <p>
 * Created on: 2025/2/13
 *
 * @author lijian
 */
@DubboService
public class DemoTestService {

    public String sayName(String name) {
        return "Hello " + name;
    }

}
