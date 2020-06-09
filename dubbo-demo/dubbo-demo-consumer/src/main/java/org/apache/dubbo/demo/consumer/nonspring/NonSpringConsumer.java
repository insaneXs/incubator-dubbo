package org.apache.dubbo.demo.consumer.nonspring;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.demo.DemoService;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2020-06-09
 */
public class NonSpringConsumer {

    public static void main(String[] args) {
        ApplicationConfig appCfg = new ApplicationConfig();
        appCfg.setName("NonSpringConsumer");

        RegistryConfig registryCfg = new RegistryConfig();
        registryCfg.setAddress("zookeeper://192.168.1.102:2181");

        ReferenceConfig<DemoService> referenceCfg = new ReferenceConfig<>();
        referenceCfg.setApplication(appCfg);
        referenceCfg.setRegistry(registryCfg);
        referenceCfg.setInterface(DemoService.class);
        referenceCfg.setVersion("1.0.0");

        DemoService demoService = referenceCfg.get();
        System.out.println(demoService.sayHello("123"));

    }
}
