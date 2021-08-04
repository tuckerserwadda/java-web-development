package com.udacity.DogsList.service;

import com.udacity.DogsList.entity.DogEntity;
import com.udacity.DogsList.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {
    @Autowired
    DogRepository dogRepository;
    // method to return the list of dogs
    public List<DogEntity> getDogList(){
        return (List<DogEntity>) dogRepository.findAll();
    }
}
