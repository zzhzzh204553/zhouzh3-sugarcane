package com.zhouzh3.sugarcane.app.service.impl;

import com.zhouzh3.common.response.R;
import com.zhouzh3.sugarcane.api.feign.ScoutApi;
import com.zhouzh3.sugarcane.app.service.FeignService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class FeignServiceImpl implements FeignService {

    @Autowired
    private ScoutApi scoutApi;

    @Override
    public R<String> hello() {
        log.info("================hello");
        return scoutApi.hello();
    }
}
