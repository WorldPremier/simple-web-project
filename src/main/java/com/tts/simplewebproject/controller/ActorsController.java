package com.tts.simplewebproject.controller;

import com.tts.simplewebproject.model.Actors;
import com.tts.simplewebproject.repository.ActorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorsController {

    @Autowired
    ActorsRepository actorsRepository;

    @GetMapping("/")
    public String returnHelloActorFranky(){
        System.out.println("Hello Franky, you are now the lead actor!");
        return "HelloActorFranky";
    }

    @GetMapping("/all")
    public Iterable<Actors> getAllActors(){
        return actorsRepository.findAll();
    }

    @PostMapping("/add")
    public Actors addActors(@RequestBody Actors actors){
        return actorsRepository.save(actors);
    }

}
