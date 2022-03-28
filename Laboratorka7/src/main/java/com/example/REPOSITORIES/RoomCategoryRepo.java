package com.example.REPOSITORIES;

import com.example.MODELS.CategoryOfRoom;
import org.springframework.data.repository.CrudRepository;

public interface RoomCategoryRepo extends CrudRepository<CategoryOfRoom, Long> {

}
