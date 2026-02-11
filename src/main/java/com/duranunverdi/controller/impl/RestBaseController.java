package com.duranunverdi.controller.impl;

import com.duranunverdi.utils.PagerUtil;
import com.duranunverdi.utils.RestPageableRequest;
import org.springframework.data.domain.Pageable;

public class RestBaseController {
    public Pageable toPageable  (RestPageableRequest restPageableRequest) {

        return PagerUtil.toPageAble(restPageableRequest);
    }
}
