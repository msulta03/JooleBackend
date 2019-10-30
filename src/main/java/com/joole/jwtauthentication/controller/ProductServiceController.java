package com.joole.jwtauthentication.controller;

import javax.validation.Valid;

import com.joole.jwtauthentication.model.Products;
import com.joole.jwtauthentication.repository.ProductService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class ProductServiceController {
   @Autowired
   ProductService productService;

   @RequestMapping(value = "/products")
   public ResponseEntity<?> getProducts( ) {
      return new ResponseEntity<>(productService.getProductList(), HttpStatus.OK);
   }
//    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
//    public ResponseEntity<Object> 
//       updateProduct(@PathVariable("id") Long id, @RequestBody Products product) {
      
//       productService.updateProduct(id, product);
//       return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
//    }

    @RequestMapping (value = "/products/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getProduct (@PathVariable("id") Long id) {
        return new ResponseEntity<> (productService.getById(id), HttpStatus.OK);
    }   
    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
   public ResponseEntity<Object> delete(@PathVariable("id") Long id) {
      productService.deleteProduct(id);
      return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
   }
   @RequestMapping(value = "/products", method = RequestMethod.POST)
   public ResponseEntity<Object> createProduct(@RequestBody Products product) {
      productService.createProduct(product);
      return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
   }
}