package com.zjm.handler_demo.service.impl;

import com.zjm.handler_demo.model.OrderDTO;
import com.zjm.handler_demo.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * @className : OrderServiceImpl
 * @description: 一般实现方式
 * @author: zhangjm
 * @create: 2020-05-06 15:52
 **/
@Service
public class OrderServiceImpl implements IOrderService {
    @Override
    public String handle(OrderDTO dto) {
        String type = dto.getType();
        if ("1".equals(type)) {
            return "处理普通订单";
        } else if ("2".equals(type)) {
            return "处理团购订单";
        } else if ("3".equals(type)) {
            return "处理促销订单";
        }
        return null;
    }
}
