package com.joole.jwtauthentication.repository;



import com.joole.jwtauthentication.model.Products;
import com.joole.jwtauthentication.model.SalesRep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SalesrepRepository extends JpaRepository<SalesRep, Long> {
    public Products findById(long id);
}