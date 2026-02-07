package com.duranunverdi.service.impl;

import com.duranunverdi.dto.DtoPersonel;
import com.duranunverdi.repository.IPersonelRepository;
import com.duranunverdi.service.IPersonelService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
public class PersonelServiceImpl implements IPersonelService {

    private final IPersonelRepository repository;

    public PersonelServiceImpl(IPersonelRepository repository) {
        this.repository = repository;
    }

    @Override
    public Page<DtoPersonel> findAll(Pageable pageable) {
        return repository.findAll(pageable)
                .map(p -> new DtoPersonel(
                        p.getId(),
                        p.getFirstName(),
                        p.getLastName(),
                        p.getDepartment().getId(),
                        p.getDepartment().getName()
                ));
    }

}
