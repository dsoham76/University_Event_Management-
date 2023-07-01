package com.example.University.Event.Management.service;

import com.example.University.Event.Management.model.Event;
import com.example.University.Event.Management.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    EventRepo eventRepo;

    public String addEvent(Event event){
        eventRepo.save(event);
        return "Event has been added.";
    }

    public String updateEventLocation(Integer id, String location) {
        Optional<Event> myEvents=eventRepo.findById(id);
        Event event=myEvents.get();
        if(myEvents.isPresent()){
            event.setLocationOfEvent(location);
            eventRepo.save(event);
            return "Event location has been updated.";
        }else{
            return "No event exists with given id.";
        }

    }

    public String deleteEvent(Integer id) {
        Optional<Event> myEvents=eventRepo.findById(id);
        Event event=myEvents.get();
        if(myEvents.isPresent()){
            eventRepo.deleteById(id);
            return "Event has been deleted.";
        }else{
            return "No event exists with given id.";
        }
    }

    public List<Event> getEventAfterDate(LocalDate date) {
        return eventRepo.findByDateGreaterThan(date);
    }
}
