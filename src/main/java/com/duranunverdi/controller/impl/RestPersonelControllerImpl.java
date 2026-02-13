package com.duranunverdi.controller.impl;

import com.duranunverdi.controller.IRestPersonelController;
import com.duranunverdi.dto.DtoPersonel;
import com.duranunverdi.service.IPersonelService;
import com.duranunverdi.utils.RestPageableEntity;
import com.duranunverdi.utils.RestPageableRequest;
import com.duranunverdi.utils.RootEntity;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public RootEntity<RestPageableEntity<DtoPersonel>> findAll(
            @ModelAttribute RestPageableRequest restPageableRequest) {

        Page<DtoPersonel> page = service.findAll(toPageable(restPageableRequest));

        RestPageableEntity<DtoPersonel> pageable =
                toPageableResponse(page, page.getContent());
        System.out.println("Content size: " + page.getContent().size());

        return RootEntity.success(pageable);
    }


}
