package com.zhouzh3.sugarcane.api.feign;

import com.zhouzh3.common.response.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import static com.zhouzh3.sugarcane.api.bean.Constant.SCOUT_SERVICE;


@FeignClient(name = SCOUT_SERVICE, url = "http://localhost:8761/")
public interface FeignApi {

    String PATH = "/api/scout";

    @GetMapping(PATH + "/hello")
    R<String> hello();

}
