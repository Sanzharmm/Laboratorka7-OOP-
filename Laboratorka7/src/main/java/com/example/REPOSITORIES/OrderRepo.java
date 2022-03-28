package com.example.REPOSITORIES;

import com.example.MODELS.ORDER;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<ORDER, Long> {

}
