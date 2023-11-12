
package com.bits.ticketbookingbus.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.bits.ticketbookingbus.dto.TicketDto;
import com.bits.ticketbookingbus.persistence.entity.Ticket;
import com.bits.ticketbookingbus.persistence.repository.TicketRepository;
import com.bits.ticketbookingbus.service.api.TicketService;
import com.bits.ticketbookingbus.mapper.TicketMapper;
@Service
public class TicketServiceImpl implements TicketService {
@Autowired
private TicketRepository repository;
@Override
public List<TicketDto> findAll() {
return TicketMapper.INSTANCE.toDtoList(repository.findAll()); 
}
@Override
public List<TicketDto> findById(Integer id) {
Optional<Ticket> ticket = repository.findById(id);
if(ticket.isPresent()) {
return TicketMapper.INSTANCE.toDtoList(new ArrayList<Ticket>() {
{ add(ticket.get()); 
}
});
} else return Collections.emptyList();
}
@Override
public TicketDto save(TicketDto newTicket) {
Ticket ticket = TicketMapper.INSTANCE.toEntity(newTicket);
ticket = repository.save(ticket);
return TicketMapper.INSTANCE.toDto(ticket);
}
@Override
public void deleteById(Integer id) {
repository.deleteById(id); 
}
@Override
public TicketDto update(TicketDto ticket, Integer id) {
Optional<Ticket> obj = repository.findById(id);
if(obj.isPresent()) {
Ticket x = obj.get();
x.setId(ticket.getId());
x.setUserId(ticket.getUserId());
x.setRouteId(ticket.getRouteId());
x.setTicketNumber(ticket.getTicketNumber());
x.setJourneyDate(ticket.getJourneyDate());
return TicketMapper.INSTANCE.toDto(repository.save(x));
}
else {
return TicketMapper.INSTANCE.toDto(repository.save(TicketMapper.INSTANCE.toEntity(ticket)));
}
}
@Override
public List<TicketDto> findByUserIdIn(List<Integer> idList) {
return TicketMapper.INSTANCE.toDtoList(repository.findByUserIdIn(idList)); 
}
@Override
public List<TicketDto> findByRouteIdIn(List<Integer> idList) {
return TicketMapper.INSTANCE.toDtoList(repository.findByRouteIdIn(idList)); 
}
@Override
public List<TicketDto> saveAll(List<TicketDto> entries) {
List<Ticket> list = TicketMapper.INSTANCE.toEntityList(entries);
list = repository.saveAll(list);
return TicketMapper.INSTANCE.toDtoList(list);
}
}
