package com.yshop.facade.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yan Meng
 * @date 2018/4/3
 */
@RestController
@RequestMapping("/")
public class IndexController {

    public String hello() {
        return "hello";
    }
}
