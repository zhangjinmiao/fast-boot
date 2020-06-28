package com.zjm.handler_demo.handler;

import java.lang.annotation.*;

/**
 * @author zhangjinmiao
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HandlerType {

    String value();
}
