
package com.bits.ticketbookingbus.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.bits.ticketbookingbus.dto.TicketDto;
import com.bits.ticketbookingbus.service.api.TicketService;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
class TicketController {
@Autowired
private TicketService service;
@GetMapping("/ticket")
List<TicketDto> all() {
return service.findAll(); 
}
@GetMapping("/ticket/{id}")
List<TicketDto> one(@PathVariable Integer id) {
return service.findById(id); 
}
@PostMapping("/ticket")
TicketDto newTicket(@RequestBody TicketDto newTicket) {
return service.save(newTicket); 
}
@DeleteMapping("/ticket/{id}")
void deleteTicket(@PathVariable Integer id) {
service.deleteById(id); 
}
@PutMapping("/ticket/{id}")
TicketDto updateTicket(@RequestBody TicketDto ticket, @PathVariable Integer id) {
return service.update(ticket,id); 
}
@GetMapping("/ticket/user-id")
List<TicketDto> findAllByUserId(@RequestParam List<Integer> idList) {
return service.findByUserIdIn(idList); 
}
@GetMapping("/ticket/route-id")
List<TicketDto> findAllByRouteId(@RequestParam List<Integer> idList) {
return service.findByRouteIdIn(idList); 
}
@PostMapping("/ticket-list")
List<TicketDto> saveAll(@RequestBody List<TicketDto> entries) {
return service.saveAll(entries); 
}
}
