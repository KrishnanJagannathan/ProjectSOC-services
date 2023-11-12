
package com.bits.ticketbookingbus.persistence.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bits.ticketbookingbus.persistence.entity.Ticket;
import java.util.List;
public interface TicketRepository extends JpaRepository<Ticket, Integer> { 
List<Ticket> findByUserIdIn(List<Integer> idList);
List<Ticket> findByRouteIdIn(List<Integer> idList);
}
