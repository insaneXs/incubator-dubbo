# Apache Dubbo (incubating) Project

[![Build Status](https://travis-ci.org/apache/incubator-dubbo.svg?branch=master)](https://travis-ci.org/apache/incubator-dubbo) 
[![codecov](https://codecov.io/gh/apache/incubator-dubbo/branch/master/graph/badge.svg)](https://codecov.io/gh/apache/incubator-dubbo)
[![Gitter](https://badges.gitter.im/alibaba/dubbo.svg)](https://gitter.im/alibaba/dubbo?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)
![license](https://img.shields.io/github/license/alibaba/dubbo.svg)
![maven](https://img.shields.io/maven-central/v/com.alibaba/dubbo.svg)

Apache Dubbo (incubating) is a high-performance, java based RPC framework open-sourced by Alibaba. Please visit [dubbo official site ](http://dubbo.incubator.apache.org) for quick start and documentations, as well as [Wiki](https://github.com/apache/incubator-dubbo/wiki) for news, FAQ, and release notes.

We are now collecting dubbo user info in order to help us to improve dubbo better, pls. kindly help us by providing yours on [issue#1012: Wanted: who's using dubbo](https://github.com/apache/incubator-dubbo/issues/1012), thanks :)

## Links

* [Side projects](https://github.com/apache/incubator-dubbo)
    * [Dubbo Spring Boot](https://github.com/apache/incubator-dubbo-spring-boot-project) - Spring Boot Project for Dubbo.
    * [Dubbo ops](https://github.com/apache/incubator-dubbo-ops) - The reference implementation for dubbo ops(dubbo-admin,dubbo-monitor-simple,dubbo-registry-simple,etc.).
    * [Dubbo website](https://github.com/apache/incubator-dubbo-website) - Apache Dubbo (incubating) documents
    * [Dubbo rpc-jsonrpc](https://github.com/apache/incubator-dubbo-rpc-jsonrpc) - The Json rpc module of Apache Dubbo (incubating) project
    * [Dubbo feature-test](https://github.com/apache/incubator-dubbo-feature-test) - Apache Dubbo (incubating) feature test
    * [Dubbo docs](https://github.com/apache/incubator-dubbo-docs) - Apache Dubbo (incubating) documentation  
* [Developer Mailing list](https://github.com/apache/incubator-dubbo/issues/1393) - Any questions or suggestions? Please follow this [guide](https://github.com/apache/incubator-dubbo/issues/1393) to subscribe to (dev@dubbo.incubator.apache.org) and discuss with us.
* [Gitter channel](https://gitter.im/alibaba/dubbo) - Online chat room with Dubbo developers.
* [Dubbo user manual(English)](http://dubbo.apache.org/books/dubbo-user-book-en/) or [Dubbo用户手册(中文)](http://dubbo.apache.org/books/dubbo-user-book/) - Describe how to use Dubbo and all features of Dubbo concretely.
* [Dubbo developer guide(English)](http://dubbo.apache.org/books/dubbo-dev-book-en/) or [Dubbo开发手册(中文)](http://dubbo.apache.org/books/dubbo-dev-book/) - Detailly introduce the design principal, extension mechanisms, code conventions, version control and building project, etc.
* [Dubbo admin manual(English)](http://dubbo.apache.org/books/dubbo-admin-book-en/) or [Dubbo管理手册(中文)](http://dubbo.apache.org/books/dubbo-admin-book/) - Describe how to use Dubbo registry and admin-console.

## Dubbo 源码阅读  

### 各模块功能说明  
* dubbo-bootstrap 启动引导  
* dubbo-cluster 集群模块 主要负责Proxy -> Invoker之间进行Router
* dubbo-common 通用组件  
* dubbo-compatible  
* dubbo-config 配置相关(包括注册中心配置，引用的服务配置，暴露的服务配置，协议配置等)
* dubbo-container  
* dubbo-demo  
* dubbo-filter 
* dubbo-monitor
* dubbo-plugin
* dubbo-registry  注册中心(支持的注册中心有 zookeeper, redis)
* dubbo-remoting 负责传输 (底层可用的通信框架有 netty mina http webservice)
* dubbo-rpc RPC核心功能 抽象整个RPC通信过程 (Proxy -> serialize -> request  -> Invoker -> reflect -> response -> proxy.return) 以及RPC协议的选择
* dubbo-serialization 负责序列化(支持fastjson,hessian2,jdk等)
* dubbo-test  

#### dubbo-remoting
##### dubbo-remoting-api
    - org.apache.dubbo.remoting
        - buffer
            - AbstractChannelBuffer
            - ByteBufferBackedChannelBuffer
            - ChannelBuffer
            - ChannelBufferFactory
            - ChannelBufferInputStream
            - ChannelBufferOutputStream
            - ChannelBuffers
            - DirectChannelBufferFactory
            - DynamicChannelBuffer
            - HeapChannelBuffer
            - HeapChannelBufferFactory