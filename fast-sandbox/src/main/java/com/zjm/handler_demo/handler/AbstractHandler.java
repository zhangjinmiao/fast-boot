package com.zjm.handler_demo.handler;

import com.zjm.handler_demo.model.OrderDTO;

/**
 * @className : AbstractHandler
 * @description: 抽象处理器，由具体实现类继承实现
 * @author: zhangjm
 * @create: 2020-05-06 15:55
 **/
public abstract class AbstractHandler {

    abstract public String handle(OrderDTO dto);
}
