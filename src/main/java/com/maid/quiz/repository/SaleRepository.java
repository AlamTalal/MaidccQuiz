package com.maid.quiz.repository;

import com.maid.quiz.model.Sale;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SaleRepository extends CrudRepository<Sale, Long> {
    public List<Sale> findByIsDeleted(boolean isDeleted);
}
