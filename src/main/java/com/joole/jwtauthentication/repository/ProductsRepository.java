package com.joole.jwtauthentication.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joole.jwtauthentication.model.Products;


@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
    
    public Products findByProductsId(long Id);

}
