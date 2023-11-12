
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
import com.bits.ticketbookingbus.dto.SourceLocationDto;
import com.bits.ticketbookingbus.service.api.SourceLocationService;
@RestController
class SourceLocationController {
@Autowired
private SourceLocationService service;
@GetMapping("/source-location")
List<SourceLocationDto> all() {
return service.findAll(); 
}
@GetMapping("/source-location/{id}")
List<SourceLocationDto> one(@PathVariable Integer id) {
return service.findById(id); 
}
@PostMapping("/source-location")
SourceLocationDto newSourceLocation(@RequestBody SourceLocationDto newSourceLocation) {
return service.save(newSourceLocation); 
}
@DeleteMapping("/source-location/{id}")
void deleteSourceLocation(@PathVariable Integer id) {
service.deleteById(id); 
}
@PutMapping("/source-location/{id}")
SourceLocationDto updateSourceLocation(@RequestBody SourceLocationDto sourceLocation, @PathVariable Integer id) {
return service.update(sourceLocation,id); 
}
@PostMapping("/source-location-list")
List<SourceLocationDto> saveAll(@RequestBody List<SourceLocationDto> entries) {
return service.saveAll(entries); 
}
}
