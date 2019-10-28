package com.joole.jwtauthentication.repository;

import java.util.List;

import com.joole.jwtauthentication.model.Products;


public interface ProductService {
//    public abstract void createProduct(Products product);
//    public abstract void updateProduct(String id, Products product);

   public  List<Products> getProductList();
   public Products getById(long id);

   public  void createProduct(Products product);
   public  void deleteProduct(long id);
   public void updateProduct(long id, Products product);




}