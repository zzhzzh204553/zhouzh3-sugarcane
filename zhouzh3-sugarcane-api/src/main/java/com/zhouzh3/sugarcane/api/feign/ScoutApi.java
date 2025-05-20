package com.zhouzh3.sugarcane.api.feign;

import com.zhouzh3.common.response.R;
import com.zhouzh3.sugarcane.api.bean.Constant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import static com.zhouzh3.sugarcane.api.bean.Constant.SERVICE_NAME;


@FeignClient(name = SERVICE_NAME)
public interface ScoutApi {

    String PATH = "/api/scout";

    @GetMapping(PATH + "/hello")
    R<String> hello();

}
