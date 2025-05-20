package com.zhouzh3.sugarcane.api.feign;

import com.zhouzh3.common.response.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "ZHOUZH3-SUGARCANE")
public interface FeignApi {

    String PATH = "/api/scout";

    @GetMapping(PATH + "/hello")
    R<String> hello();

}
