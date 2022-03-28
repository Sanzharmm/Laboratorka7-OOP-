package com.example.REPOSITORIES;

import com.example.MODELS.Contract;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepo extends CrudRepository<Contract, Long> {

}
