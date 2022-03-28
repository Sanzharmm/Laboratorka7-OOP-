package com.example.REPOSITORIES;

import com.example.MODELS.Foreigner;
import org.springframework.data.repository.CrudRepository;

public interface TouristRepo extends CrudRepository<Foreigner, Long> {

}
