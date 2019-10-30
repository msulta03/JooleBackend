package com.joole.jwtauthentication.security.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.joole.jwtauthentication.model.Products;
import com.joole.jwtauthentication.repository.ProductService;
import com.joole.jwtauthentication.repository.ProductsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsServiceImpl implements ProductService {

    @Autowired
    ProductsRepository productDao;

    @Override
    public List<Products> getProductList() {
        return productDao.findAll();
    }

    @Override
    public Products getById(long id) {
        return productDao.findById(id);
    }

    @Override
    public void createProduct(Products product) {
        productDao.save(product);

    }

    @Override
    public void deleteProduct(long id) {
        productDao.deleteById(id);

    }

    @Override
    public void updateProduct(long id, Products product) {

        productDao.save(product);

    }

    

}