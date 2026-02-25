
package com.example.transport.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
import com.example.transport.entity.Bus;

public interface BusRepository extends JpaRepository<Bus,Long>{
  List<Bus> findByRouteId(Long routeId);
}
