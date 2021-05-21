package com.tts.simplewebproject.repository;

import com.tts.simplewebproject.model.Actors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActorsRepository extends CrudRepository<Actors, Long> {
    Optional<Actors> getFirstByTypesOfActors(String typesOfActors);
}
