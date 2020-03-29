package com.maid.quiz.service;

import com.maid.quiz.model.Sale;
import com.maid.quiz.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    private SaleRepository saleRepository;

    @Autowired
    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public List<Sale> getAll() {
        return saleRepository.findByIsDeleted(false);
    }

    public Sale getById(Long id) {
        return saleRepository.findById(id).get();
    }

    public Sale save(Sale sale) {
        return saleRepository.save(sale);
    }

}
