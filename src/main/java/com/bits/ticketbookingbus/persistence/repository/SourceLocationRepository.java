
package com.bits.ticketbookingbus.persistence.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bits.ticketbookingbus.persistence.entity.SourceLocation;
public interface SourceLocationRepository extends JpaRepository<SourceLocation, Integer> { 
}
