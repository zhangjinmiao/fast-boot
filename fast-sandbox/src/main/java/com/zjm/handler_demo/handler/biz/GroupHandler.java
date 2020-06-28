package com.zjm.handler_demo.handler.biz;

import com.zjm.handler_demo.constant.OrderType;
import com.zjm.handler_demo.handler.AbstractHandler;
import com.zjm.handler_demo.handler.HandlerType;
import com.zjm.handler_demo.model.OrderDTO;
import org.springframework.stereotype.Component;

/**
 * @className : GroupHandler
 * @description: 团购订单处理器
 * @author: zhangjm
 * @create: 2020-05-06 15:56
 **/
@Component
@HandlerType(OrderType.GROUP_ORDER)
public class GroupHandler extends AbstractHandler {
    @Override
    public String handle(OrderDTO dto) {
        return "处理团购订单";
    }
}
