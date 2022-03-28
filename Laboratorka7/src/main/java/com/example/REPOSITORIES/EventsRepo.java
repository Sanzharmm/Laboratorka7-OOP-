package com.example.REPOSITORIES;

import com.example.MODELS.EVENTS;
import org.springframework.data.repository.CrudRepository;

public interface EventsRepo extends CrudRepository<EVENTS, Long> {
}
