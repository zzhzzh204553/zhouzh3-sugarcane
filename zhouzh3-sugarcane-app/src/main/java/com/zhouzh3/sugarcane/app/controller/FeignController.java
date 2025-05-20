package com.zhouzh3.sugarcane.app.controller;

import com.zhouzh3.common.response.R;
import com.zhouzh3.sugarcane.core.FeignService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class FeignController {

    @Resource
    private FeignService feignService;

    @GetMapping("/api/feign/hello")
    public R<String> hello() {
        return feignService.hello();
    }

}
