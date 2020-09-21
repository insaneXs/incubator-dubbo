package com.alibaba.dubbo.registry;

import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @ClassName _RegistryFactory$Adaptive Dubbo生成的RegistryFactory$Adaptive类 为与原类区分 类名前增加了_
 * @Description TODO
 * @Author insaneXs
 * @Date 2020/9/21
 */
public class _RegistryFactory$Adaptive implements org.apache.dubbo.registry.RegistryFactory {
    @Override
    public org.apache.dubbo.registry.Registry getRegistry(org.apache.dubbo.common.URL arg0) {
        if (arg0 == null) throw new IllegalArgumentException("url == null");
        org.apache.dubbo.common.URL url = arg0;
        String extName = ( url.getProtocol() == null ? "dubbo" : url.getProtocol() );
        if(extName == null) throw new IllegalStateException("Fail to get extension(org.apache.dubbo.registry.RegistryFactory) name from url(" + url.toString() + ") use keys([protocol])");
        org.apache.dubbo.registry.RegistryFactory extension = (org.apache.dubbo.registry.RegistryFactory) ExtensionLoader.getExtensionLoader(org.apache.dubbo.registry.RegistryFactory.class).getExtension(extName);
        return extension.getRegistry(arg0);
    }
}
