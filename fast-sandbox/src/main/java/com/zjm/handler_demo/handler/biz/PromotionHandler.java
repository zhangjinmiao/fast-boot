package com.zjm.handler_demo.handler.biz;

import com.zjm.handler_demo.constant.OrderType;
import com.zjm.handler_demo.handler.AbstractHandler;
import com.zjm.handler_demo.handler.HandlerType;
import com.zjm.handler_demo.model.OrderDTO;
import org.springframework.stereotype.Component;

/**
 * @className : PromotionHandler
 * @description: 促销订单处理器
 * @author: zhangjm
 * @create: 2020-05-06 15:59
 **/
@Component
@HandlerType(OrderType.PROMOTION_ORDER)
public class PromotionHandler extends AbstractHandler {
    @Override
    public String handle(OrderDTO dto) {
        return "处理促销订单";
    }
}
