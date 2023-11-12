
package com.bits.ticketbookingbus.service.api;
import org.springframework.stereotype.Service;
import java.util.List;
import com.bits.ticketbookingbus.dto.TicketDto;
@Service
public interface TicketService {
List<TicketDto> findAll();
List<TicketDto> findById(Integer id);
TicketDto save(TicketDto newTicket);
void deleteById(Integer id);
TicketDto update(TicketDto ticket, Integer id);
List<TicketDto> findByUserIdIn(List<Integer> idList);
List<TicketDto> findByRouteIdIn(List<Integer> idList);
List<TicketDto> saveAll(List<TicketDto> entries);
}
