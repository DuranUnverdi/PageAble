package com.duranunverdi.service.impl;

import com.duranunverdi.dto.DtoPersonel;
import com.duranunverdi.model.Personel;
import com.duranunverdi.repository.IPersonelRepository;
import com.duranunverdi.service.IPersonelService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(readOnly = true)
public class PersonelServiceImpl implements IPersonelService {

    private final IPersonelRepository repository;

    public PersonelServiceImpl(IPersonelRepository repository) {
        this.repository = repository;
    }


    @Override
    public Page<DtoPersonel> findAll(Pageable pageable) {

        Page<Personel> page = repository.findBy(pageable);

        return page.map(personel -> new DtoPersonel(
                personel.getId(),
                personel.getFirstName(),
                personel.getLastName(),
                personel.getDepartment() != null
                        ? personel.getDepartment().getId()
                        : null,
                personel.getDepartment() != null
                        ? personel.getDepartment().getName()
                        : null
        ));
    }


}
