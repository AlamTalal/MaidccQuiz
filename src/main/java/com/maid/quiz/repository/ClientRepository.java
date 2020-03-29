package com.maid.quiz.repository;

import com.maid.quiz.model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {
    public List<Client> findByIsDeleted(boolean isDeleted);
}
