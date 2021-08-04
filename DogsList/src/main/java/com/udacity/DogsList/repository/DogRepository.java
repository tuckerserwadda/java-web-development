package com.udacity.DogsList.repository;

import com.udacity.DogsList.entity.DogEntity;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository <DogEntity, Long>{
}
