package com.example.REPOSITORIES;

import com.example.MODELS.Contract;
import org.springframework.data.repository.CrudRepository;

public interface ContractRepo extends CrudRepository<Contract, Long> {
}
