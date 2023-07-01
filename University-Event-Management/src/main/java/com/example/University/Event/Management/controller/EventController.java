package com.example.University.Event.Management.controller;

import com.example.University.Event.Management.model.Event;
import com.example.University.Event.Management.service.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Validated
@RestController
public class EventController {
    @Autowired
    EventService eventService;

    @PostMapping("event")
    public String addEvent(@Valid @RequestBody  Event event){
        return eventService.addEvent(event);
    }

    @PutMapping("event/{id}/{location}")
    public String updateEventLocation(@PathVariable Integer id,@Valid @PathVariable String location){
        return eventService.updateEventLocation(id,location);
    }

    @DeleteMapping("event/{id}")
    public String deleteEvent(@PathVariable  Integer id){
        return eventService.deleteEvent(id);
    }

    @GetMapping("eventAfterDate/{date}")
    public List<Event> getEventAfterDate(@PathVariable LocalDate date){
        return eventService.getEventAfterDate(date);
    }

}
