package com.example.REPOSITORIES;

import com.example.MODELS.TheMainHotel;
import org.springframework.data.repository.CrudRepository;

public interface HotelRepo extends CrudRepository<TheMainHotel, Long> {


}
