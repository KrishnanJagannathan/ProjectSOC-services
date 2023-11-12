
package com.bits.ticketbookingbus.persistence.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bits.ticketbookingbus.persistence.entity.DestinationLocation;
public interface DestinationLocationRepository extends JpaRepository<DestinationLocation, Integer> { 
}
