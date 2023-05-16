package com.jetassets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jetassets.model.ParentType;

public interface ParentTypeRepository extends JpaRepository<ParentType, Long> {

}
