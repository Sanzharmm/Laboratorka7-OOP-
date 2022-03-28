package com.example.REPOSITORIES;

import com.example.MODELS.AirTickets;
import org.springframework.data.repository.CrudRepository;

public interface AirTicketRepo extends CrudRepository<AirTickets, Long> {
}
