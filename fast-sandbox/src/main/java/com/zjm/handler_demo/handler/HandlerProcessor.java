package com.zjm.handler_demo.handler;

import com.google.common.collect.Maps;
import com.zjm.handler_demo.util.ClassScaner;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @className : HandlerProcessor
 * @description: 核心功能处理类
 * @author: zhangjm
 * @create: 2020-05-06 16:02
 **/
@Component
@SuppressWarnings("unchecked")
public class HandlerProcessor implements BeanFactoryPostProcessor {

    private static final String HANDLER_PACKAGE = "com.zjm.handler_demo.handler.biz";

    /**
     * 扫描@HandlerType，初始化 HandlerContext，将其注册到spring容器
     * @param beanFactory bean工厂
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        HashMap<String, Class> handlerMap = Maps.newHashMapWithExpectedSize(3);
        ClassScaner.scan(HANDLER_PACKAGE, HandlerType.class).forEach(clazz -> {
            String type = clazz.getAnnotation(HandlerType.class).value();
            handlerMap.put(type, clazz);
        });
        HandlerContext context = new HandlerContext(handlerMap);
        beanFactory.registerSingleton(HandlerContext.class.getName(), context);
    }
}
