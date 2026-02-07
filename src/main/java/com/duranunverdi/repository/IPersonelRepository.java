package com.duranunverdi.repository;

import com.duranunverdi.model.Personel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonelRepository extends JpaRepository<Personel, Long> {
    Page<Personel> findBy(Pageable pageable);
}
