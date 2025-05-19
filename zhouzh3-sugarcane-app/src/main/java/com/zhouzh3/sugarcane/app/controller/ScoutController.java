package com.zhouzh3.sugarcane.app.controller;

import com.zhouzh3.common.response.R;
import com.zhouzh3.sugarcane.api.feign.ScoutApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoutController implements ScoutApi {

    @Value("${custom.message:world}")
    private String message;

    @Override
    @GetMapping("/hello")
    public R<String> hello() {
        return R.success("hello " + message);
    }

}
