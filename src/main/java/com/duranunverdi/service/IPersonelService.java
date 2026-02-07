package com.duranunverdi.service;

import com.duranunverdi.dto.DtoPersonel;
import com.duranunverdi.model.Personel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IPersonelService {
    Page<DtoPersonel> findAll(Pageable pageable);
}
