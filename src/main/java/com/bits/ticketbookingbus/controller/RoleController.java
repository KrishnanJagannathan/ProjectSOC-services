
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
import com.bits.ticketbookingbus.dto.RoleDto;
import com.bits.ticketbookingbus.service.api.RoleService;
@RestController
class RoleController {
@Autowired
private RoleService service;
@GetMapping("/role")
List<RoleDto> all() {
return service.findAll(); 
}
@GetMapping("/role/{id}")
List<RoleDto> one(@PathVariable Integer id) {
return service.findById(id); 
}
@PostMapping("/role")
RoleDto newRole(@RequestBody RoleDto newRole) {
return service.save(newRole); 
}
@DeleteMapping("/role/{id}")
void deleteRole(@PathVariable Integer id) {
service.deleteById(id); 
}
@PutMapping("/role/{id}")
RoleDto updateRole(@RequestBody RoleDto role, @PathVariable Integer id) {
return service.update(role,id); 
}
@PostMapping("/role-list")
List<RoleDto> saveAll(@RequestBody List<RoleDto> entries) {
return service.saveAll(entries); 
}
}
