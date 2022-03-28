package com.example.REPOSITORIES;

import com.example.MODELS.MainClient;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepo extends CrudRepository<MainClient, Long> {
}
