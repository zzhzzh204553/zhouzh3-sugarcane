package com.zhouzh3.sugarcane.core;

import com.zhouzh3.common.response.R;

public interface FeignService {
    R<String> hello();
}
