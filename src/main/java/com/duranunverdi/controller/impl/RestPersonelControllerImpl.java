package com.duranunverdi.controller.impl;

import com.duranunverdi.controller.IRestPersonelController;
import com.duranunverdi.dto.DtoPersonel;
import com.duranunverdi.model.Personel;
import com.duranunverdi.service.IPersonelService;
import com.duranunverdi.utils.RestPageableRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/personel")
public class RestPersonelControllerImpl extends RestBaseController implements IRestPersonelController {

    private final IPersonelService service;

    public RestPersonelControllerImpl(IPersonelService service) {
        this.service = service;
    }

    @GetMapping("/list/pageable")
    public Page<DtoPersonel> findAll(RestPageableRequest restPageableRequest) {
        Pageable pageable= toPageable(restPageableRequest);
        return service.findAll(pageable);
    }

}
