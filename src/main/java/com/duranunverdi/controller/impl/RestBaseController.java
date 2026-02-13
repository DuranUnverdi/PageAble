package com.duranunverdi.controller.impl;

import com.duranunverdi.utils.PagerUtil;
import com.duranunverdi.utils.RestPageableEntity;
import com.duranunverdi.utils.RestPageableRequest;
import com.duranunverdi.utils.RootEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class RestBaseController {
    public Pageable toPageable(RestPageableRequest restPageableRequest) {

        return PagerUtil.toPageAble(restPageableRequest);
    }

    public <T> RestPageableEntity<T> toPageableResponse(Page<?> page, List<T> list) {

        return PagerUtil.toPageableResponse(page, list);

    }
    public <T> RootEntity<T> toRootEntity(T payload) {

        return  RootEntity.success(payload);
    }
}
