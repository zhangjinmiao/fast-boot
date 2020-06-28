package com.zjm.handler_demo.service.impl;

import com.zjm.handler_demo.model.OrderDTO;
import com.zjm.handler_demo.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * @className : OrderServiceV2Impl
 * @description: 使用策略模式实现
 * @author: zhangjm
 * @create: 2020-05-06 15:53
 **/
@Service
public class OrderServiceV2Impl implements IOrderService {
    @Override
    public String handle(OrderDTO dto) {
        return null;
    }
}
