
package com.example.transport.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Route {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;
  private String source;
  private String destination;
  private String stations;

  @OneToMany(mappedBy = "route", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Bus> buses = new ArrayList<>();

  public Long getId(){return id;}
  public String getTitle(){return title;}
  public void setTitle(String t){this.title=t;}
  public String getSource(){return source;}
  public void setSource(String s){this.source=s;}
  public String getDestination(){return destination;}
  public void setDestination(String d){this.destination=d;}
  public String getStations(){return stations;}
  public void setStations(String s){this.stations=s;}
  public List<Bus> getBuses(){return buses;}
}
