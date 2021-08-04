package com.dataStores.databases.controller;

import com.dataStores.databases.dto.PlantDTO;
import com.dataStores.databases.entity.Plant;
import com.dataStores.databases.service.PlantService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * the plant controller implements the service class
 *
 */
@RestController
@RequestMapping("/plant")
public class PlantController {
    @Autowired
    private PlantService plantService;
    public PlantDTO getPlantDTO(String name){
        Plant plant = plantService.getPlantByName(name);
        return convertPlantToPlantDTO(plantService.getPlantByName(name));
    }
    public  Plant getFilteredPlant(String name){
        return plantService.getPlantByName(name);
    }
    // converting the returned plant object into a DTO - Data Transfer Object
    private  PlantDTO convertPlantToPlantDTO(Plant plant){
        PlantDTO plantDTO = new PlantDTO();
        BeanUtils.copyProperties(plant, plantDTO);
        return plantDTO;
    }
}
