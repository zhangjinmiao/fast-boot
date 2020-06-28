package com.zjm.handler_demo.handler.biz;

import com.zjm.handler_demo.constant.OrderType;
import com.zjm.handler_demo.handler.AbstractHandler;
import com.zjm.handler_demo.handler.HandlerType;
import com.zjm.handler_demo.model.OrderDTO;
import org.springframework.stereotype.Component;

/**
 * @className : NormalHandler
 * @description: 普通订单处理器
 * @author: zhangjm
 * @create: 2020-05-06 15:58
 **/
@Component
@HandlerType(OrderType.NORMAL_ORDER)
public class NormalHandler extends AbstractHandler {
    @Override
    public String handle(OrderDTO dto) {
        return "处理普通订单";
    }
}
