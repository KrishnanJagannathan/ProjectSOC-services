
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
import com.bits.ticketbookingbus.dto.DestinationLocationDto;
import com.bits.ticketbookingbus.service.api.DestinationLocationService;
@RestController
class DestinationLocationController {
@Autowired
private DestinationLocationService service;
@GetMapping("/destination-location")
List<DestinationLocationDto> all() {
return service.findAll(); 
}
@GetMapping("/destination-location/{id}")
List<DestinationLocationDto> one(@PathVariable Integer id) {
return service.findById(id); 
}
@PostMapping("/destination-location")
DestinationLocationDto newDestinationLocation(@RequestBody DestinationLocationDto newDestinationLocation) {
return service.save(newDestinationLocation); 
}
@DeleteMapping("/destination-location/{id}")
void deleteDestinationLocation(@PathVariable Integer id) {
service.deleteById(id); 
}
@PutMapping("/destination-location/{id}")
DestinationLocationDto updateDestinationLocation(@RequestBody DestinationLocationDto destinationLocation, @PathVariable Integer id) {
return service.update(destinationLocation,id); 
}
@PostMapping("/destination-location-list")
List<DestinationLocationDto> saveAll(@RequestBody List<DestinationLocationDto> entries) {
return service.saveAll(entries); 
}
}
