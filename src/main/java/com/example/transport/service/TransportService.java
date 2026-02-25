
package com.example.transport.service;

import org.springframework.stereotype.Service;
import java.util.*;
import com.example.transport.entity.*;
import com.example.transport.repository.*;
import com.example.transport.exception.*;

@Service
public class TransportService {

  private final RouteRepository routeRepo;
  private final BusRepository busRepo;

  public TransportService(RouteRepository r, BusRepository b){
    this.routeRepo=r;
    this.busRepo=b;
  }

  public Route createRoute(Route route){
    if(route.getTitle()==null||route.getSource()==null||route.getDestination()==null)
      throw new IllegalArgumentException("Invalid data");
    return routeRepo.save(route);
  }

  public Route getRoute(Long id){
    return routeRepo.findById(id)
      .orElseThrow(() -> new InvalidRouteIdException("Route not found"));
  }

  public boolean deleteRoute(Long id){
    Route r=getRoute(id);
    routeRepo.delete(r);
    return true;
  }

  public Bus createBus(Long routeId, Bus bus){
    Route r=getRoute(routeId);
    bus.setRoute(r);
    return busRepo.save(bus);
  }

  public List<Bus> findBusByRoute(Long routeId){
    getRoute(routeId);
    return busRepo.findByRouteId(routeId);
  }
}
