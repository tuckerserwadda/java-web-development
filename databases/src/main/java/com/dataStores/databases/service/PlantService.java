package com.dataStores.databases.service;

import com.dataStores.databases.entity.Plant;
import org.springframework.stereotype.Service;

@Service
public class PlantService {
    public Plant getPlantByName(String name){
        return new Plant();
    }
}
