package com.zhouzh3.sugarcane.core.impl;

import com.zhouzh3.common.response.R;
import com.zhouzh3.sugarcane.api.feign.ScoutApi;
import com.zhouzh3.sugarcane.core.FeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class FeignServiceImpl implements FeignService {

    @Autowired
//    @Qualifier("zhouzh3-sugarcane.ScoutApi")  // Feign 代理的默认 Bean 名称
    private ScoutApi scoutApi;

    @Override
    public R<String> hello() {
        log.info("================hello");
        R<String> result = scoutApi.hello();
        System.out.println("================hello"+ result);
        return result;
    }
}
