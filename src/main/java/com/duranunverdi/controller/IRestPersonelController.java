package com.duranunverdi.controller;

import com.duranunverdi.model.Personel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IRestPersonelController {

    Page<Personel> findAll(Pageable pageable);
}
