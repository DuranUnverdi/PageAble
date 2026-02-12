package com.duranunverdi.controller;

import com.duranunverdi.dto.DtoPersonel;
import com.duranunverdi.model.Personel;
import com.duranunverdi.utils.RestPageableEntity;
import com.duranunverdi.utils.RestPageableRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IRestPersonelController {

        RestPageableEntity<DtoPersonel> findAll(RestPageableRequest restPageableRequest);
}
