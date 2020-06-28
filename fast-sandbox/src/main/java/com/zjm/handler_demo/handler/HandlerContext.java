package com.zjm.handler_demo.handler;

import com.zjm.handler_demo.util.BeanTool;

import java.util.Map;

/**
 * @className : HandlerContext
 * @description: 处理器上下文，根据类型获取相应的处理器
 * @author: zhangjm
 * @create: 2020-05-06 15:54
 **/
public class HandlerContext {

    private Map<String, Class> handlerMap;

    public HandlerContext(Map<String, Class> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public AbstractHandler getInstance(String type) {
        Class clazz = handlerMap.get(type);
        if (clazz == null) {
            throw new IllegalArgumentException("not found handler for type: " + type);
        }
        return (AbstractHandler) BeanTool.getBean(clazz);
    }
}
