package com.example.University.Event.Management.repository;

import com.example.University.Event.Management.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EventRepo extends CrudRepository<Event,Integer> {
    List<Event> findByDateGreaterThan(LocalDate date);
}
