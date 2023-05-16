package com.jetassets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jetassets.model.Asset;

public interface AssetRepository extends JpaRepository<Asset, Long> {

}
