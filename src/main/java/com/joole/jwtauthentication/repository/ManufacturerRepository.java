package com.joole.jwtauthentication.repository;

import java.util.Optional;

import com.joole.jwtauthentication.model.Manufacturer;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {

    Optional<Manufacturer> findById(Integer id);
    Boolean existsById(Integer id);
}