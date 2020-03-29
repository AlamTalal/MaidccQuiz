package com.maid.quiz.repository;

import com.maid.quiz.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
        public List<Product> findByIsDeleted(boolean isDeleted);

}
