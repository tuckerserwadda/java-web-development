package com.udacity.DogsList.web;

import com.udacity.DogsList.entity.DogEntity;
import com.udacity.DogsList.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {
    private DogService dogService;
    // method to set the dogService
    @Autowired
    public void setDogService(DogService dogService){
        this.dogService = dogService;
    }
    // api endpoint
    @GetMapping("/dogList")
    // create a response entity method that returns the http response
    public ResponseEntity<List<DogEntity>> getDogsList(){
        List<DogEntity> dogList = dogService.getDogList();
        return new ResponseEntity<List<DogEntity>>(dogList, HttpStatus.OK);
    }

}
