package com.imooc.oa.common.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

/**
 * 产生回调callback，将JSON数据变为JSONP输出
 */
@ControllerAdvice(basePackages = "com.imooc.oa.controller")
public class JsonpAdvice extends AbstractJsonpResponseBodyAdvice {

    public JsonpAdvice() {

        super("callback","jsonp");
    }
}