
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
import com.bits.ticketbookingbus.dto.BusDto;
import com.bits.ticketbookingbus.service.api.BusService;
@RestController
class BusController {
@Autowired
private BusService service;
@GetMapping("/bus")
List<BusDto> all() {
return service.findAll(); 
}
@GetMapping("/bus/{id}")
List<BusDto> one(@PathVariable Integer id) {
return service.findById(id); 
}
@PostMapping("/bus")
BusDto newBus(@RequestBody BusDto newBus) {
return service.save(newBus); 
}
@DeleteMapping("/bus/{id}")
void deleteBus(@PathVariable Integer id) {
service.deleteById(id); 
}
@PutMapping("/bus/{id}")
BusDto updateBus(@RequestBody BusDto bus, @PathVariable Integer id) {
return service.update(bus,id); 
}
@PostMapping("/bus-list")
List<BusDto> saveAll(@RequestBody List<BusDto> entries) {
return service.saveAll(entries); 
}
}
