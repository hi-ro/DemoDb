package com.example.db.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;


public interface CodRepository extends Repository<Cod, CodPK> {
	Page<Cod> findAll(Pageable pageable);
}
