
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
import com.bits.ticketbookingbus.dto.RouteDto;
import com.bits.ticketbookingbus.service.api.RouteService;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
class RouteController {
@Autowired
private RouteService service;
@GetMapping("/route")
List<RouteDto> all() {
return service.findAll(); 
}
@GetMapping("/route/{id}")
List<RouteDto> one(@PathVariable Integer id) {
return service.findById(id); 
}
@PostMapping("/route")
RouteDto newRoute(@RequestBody RouteDto newRoute) {
return service.save(newRoute); 
}
@DeleteMapping("/route/{id}")
void deleteRoute(@PathVariable Integer id) {
service.deleteById(id); 
}
@PutMapping("/route/{id}")
RouteDto updateRoute(@RequestBody RouteDto route, @PathVariable Integer id) {
return service.update(route,id); 
}
@GetMapping("/route/source-id")
List<RouteDto> findAllBySourceId(@RequestParam List<Integer> idList) {
return service.findBySourceIdIn(idList); 
}
@GetMapping("/route/destination-id")
List<RouteDto> findAllByDestinationId(@RequestParam List<Integer> idList) {
return service.findByDestinationIdIn(idList); 
}
@PostMapping("/route-list")
List<RouteDto> saveAll(@RequestBody List<RouteDto> entries) {
return service.saveAll(entries); 
}
}
