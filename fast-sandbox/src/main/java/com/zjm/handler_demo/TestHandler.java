package com.zjm.handler_demo;

import com.zjm.handler_demo.constant.OrderType;
import com.zjm.handler_demo.handler.AbstractHandler;
import com.zjm.handler_demo.handler.HandlerContext;
import com.zjm.handler_demo.model.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @className : TestHandler
 * @description:
 * @author: zhangjm
 * @create: 2020-05-06 17:10
 **/
@RequestMapping("/handler")
@RestController
public class TestHandler {


    @Autowired
    private HandlerContext handlerContext;

    /**
     * http://127.0.0.1:9999/handler/test
     */
    @RequestMapping("/test")
    public void test(){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setType(OrderType.NORMAL_ORDER);
        orderDTO.setCode("putong");
        orderDTO.setPrice(new BigDecimal(100));

        AbstractHandler instance = handlerContext.getInstance(OrderType.NORMAL_ORDER);
        String handle = instance.handle(orderDTO);
        System.out.println(handle);
    }
}
