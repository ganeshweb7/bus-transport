
package com.example.transport.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import java.util.*;
import com.example.transport.entity.*;
import com.example.transport.service.*;

@RestController
@RequestMapping("/transport")
public class TransportController {

  private final TransportService service;
  public TransportController(TransportService s){this.service=s;}

  @PostMapping("/route")
  public ResponseEntity<Route> createRoute(@RequestBody Route r){
    return new ResponseEntity<>(service.createRoute(r),HttpStatus.CREATED);
  }

  @GetMapping("/route/{id}")
  public Route getRoute(@PathVariable Long id){
    return service.getRoute(id);
  }

  @DeleteMapping("/route/{id}")
  public boolean deleteRoute(@PathVariable Long id){
    return service.deleteRoute(id);
  }

  @PostMapping("/bus")
  public Bus createBus(@RequestParam Long routeId,@RequestBody Bus bus){
    return service.createBus(routeId,bus);
  }

  @GetMapping("/bus/search/{routeId}")
  public List<Bus> find(@PathVariable Long routeId){
    return service.findBusByRoute(routeId);
  }
}
