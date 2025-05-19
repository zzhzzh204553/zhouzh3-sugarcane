//package com.zhouzh3.sugarcane.app.controller;
//
//import com.zhouzh3.common.response.R;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@Slf4j
//@RestController
//public class HelloController {
//
//    @Value("${custom.message:world}")
//    private String message;
//
//    @GetMapping("/hello")
//    public R<String> hello() {
//        log.info("==========hello {}", message);
//        return R.success("hello " + message);
//    }
//
//}
