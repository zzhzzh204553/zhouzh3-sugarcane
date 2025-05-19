package com.zhouzh3.sugarcane.app.service.impl;

import com.zhouzh3.common.response.R;
import com.zhouzh3.sugarcane.api.feign.ScoutApi;
import com.zhouzh3.sugarcane.app.service.FeignService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


@Service
public class FeignServiceImpl implements FeignService {

    @Resource
    private ScoutApi scoutApi;

    @Override
    public R<String> hello() {
        return scoutApi.hello();
    }


}
