package com.maid.quiz.service;

import com.maid.quiz.model.ProductDao;
import com.maid.quiz.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDao> getAll() {
        return productRepository.findByIsDeleted(false);
    }

    public ProductDao getById(Long id) {
        return productRepository.findById(id).get();
    }

    public ProductDao save(ProductDao product) {
        return productRepository.save(product);
    }


}
