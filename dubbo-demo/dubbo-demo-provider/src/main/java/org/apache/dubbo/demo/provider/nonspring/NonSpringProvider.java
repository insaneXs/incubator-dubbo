package org.apache.dubbo.demo.provider.nonspring;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.demo.DemoService;
import org.apache.dubbo.demo.provider.DemoServiceImpl;

import java.io.IOException;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2020-06-09
 */
public class NonSpringProvider {

    public static void main(String[] args) throws IOException {
        ApplicationConfig appCfg = new ApplicationConfig();
        appCfg.setName("NonSpringProvider");

        RegistryConfig registryCfg = new RegistryConfig();
        registryCfg.setAddress("zookeeper://192.168.1.102:2181");

        ProtocolConfig protocolCfg = new ProtocolConfig();
        protocolCfg.setName("dubbo");
        protocolCfg.setPort(16666);
        protocolCfg.setThreads(10);

        ServiceConfig<DemoService> serviceCfg = new ServiceConfig<>();
        serviceCfg.setApplication(appCfg);
        serviceCfg.setRegistry(registryCfg);
        serviceCfg.setProtocol(protocolCfg);
        serviceCfg.setInterface(DemoService.class);
        serviceCfg.setRef(new DemoServiceImpl());
        serviceCfg.setVersion("1.0.0");

        serviceCfg.export();

        System.in.read();
    }
}
