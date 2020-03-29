package com.maid.quiz.repository;

import com.maid.quiz.model.ProductDao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<ProductDao, Long> {
        public List<ProductDao> findByIsDeleted(boolean isDeleted);

}
