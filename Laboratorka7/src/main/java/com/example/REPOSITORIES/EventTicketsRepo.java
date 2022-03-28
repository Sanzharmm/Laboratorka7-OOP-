package com.example.REPOSITORIES;

import com.example.MODELS.TicketsOfEvent;
import org.springframework.data.repository.CrudRepository;

public interface EventTicketsRepo extends CrudRepository<TicketsOfEvent, Long> {


}
