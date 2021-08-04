package com.udacity.DogsList.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String dogName;
    private String dogBreed;
    private String dogOrigin;

    // constructors
    public DogEntity( Long id,String dogName, String dogBreed,String dogOrigin){
        this.id = id;
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.dogOrigin = dogOrigin;
    }
    // constructor of the required values
    public DogEntity(String dogName, String dogBreed){
        this.dogName = dogName;
        this.dogBreed = dogBreed;
    }
    public DogEntity (){};

     // getter and setter method
    // id
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    // dog name
    public String getDogName(){
        return dogName;
    }
    public void setDogName(String dogName){
        this.dogName = dogName;
    }
    // dog breed
    public String getDogBreed(){
        return dogBreed;
    }
    public void setDogBreed(String dogBreed){
        this.dogBreed = dogBreed;
    }

    // origin
    public String getDogOrigin(){
        return dogOrigin;
    }
    public void setDogOrigin(String dogOrigin){
        this.dogOrigin = dogOrigin;
    }
}
