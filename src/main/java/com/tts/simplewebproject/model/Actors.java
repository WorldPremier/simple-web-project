package com.tts.simplewebproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Actors {
    //here we're using long
    //because it allows to store a large amount of IDs
    //its the wrapper version of long
    //we have access to helper methods that live on Long.java
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String typesOfActors;

    public Actors(int i, String franky) {
    }


    public void setId(Long id){
        this.id = id;
    }
    public void setTypesOfActors(String typesOfActors){
        this.typesOfActors = typesOfActors;
    }

    public Long getId(){
        return id;
    }
    public String getTypesOfActors(){
        return typesOfActors;
    }

    public Actors(String typesOfActors){
        this.typesOfActors = typesOfActors;
    }

    public Actors(){
    }

}
