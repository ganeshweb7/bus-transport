
package com.example.transport.entity;

import jakarta.persistence.*;

@Entity
public class Bus {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String busNo;
  private String color;
  private int capacity;

  @ManyToOne
  @JoinColumn(name="route_id")
  private Route route;

  public Long getId(){return id;}
  public String getBusNo(){return busNo;}
  public void setBusNo(String b){this.busNo=b;}
  public String getColor(){return color;}
  public void setColor(String c){this.color=c;}
  public int getCapacity(){return capacity;}
  public void setCapacity(int c){this.capacity=c;}
  public Route getRoute(){return route;}
  public void setRoute(Route r){this.route=r;}
}
