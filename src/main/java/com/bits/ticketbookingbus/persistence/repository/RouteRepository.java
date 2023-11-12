
package com.bits.ticketbookingbus.persistence.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bits.ticketbookingbus.persistence.entity.Route;
import java.util.List;
public interface RouteRepository extends JpaRepository<Route, Integer> { 
List<Route> findBySourceIdIn(List<Integer> idList);
List<Route> findByDestinationIdIn(List<Integer> idList);
}
