package com.jetassets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jetassets.model.Accessory;

public interface AccessoryRepository extends JpaRepository<Accessory,Long> {

}
