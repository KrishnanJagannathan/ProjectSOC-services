
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
import com.bits.ticketbookingbus.dto.UserRoleDto;
import com.bits.ticketbookingbus.service.api.UserRoleService;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
class UserRoleController {
@Autowired
private UserRoleService service;
@GetMapping("/user-role")
List<UserRoleDto> all() {
return service.findAll(); 
}
@GetMapping("/user-role/{id}")
List<UserRoleDto> one(@PathVariable Integer id) {
return service.findById(id); 
}
@PostMapping("/user-role")
UserRoleDto newUserRole(@RequestBody UserRoleDto newUserRole) {
return service.save(newUserRole); 
}
@DeleteMapping("/user-role/{id}")
void deleteUserRole(@PathVariable Integer id) {
service.deleteById(id); 
}
@PutMapping("/user-role/{id}")
UserRoleDto updateUserRole(@RequestBody UserRoleDto userRole, @PathVariable Integer id) {
return service.update(userRole,id); 
}
@GetMapping("/user-role/user-id")
List<UserRoleDto> findAllByUserId(@RequestParam List<Integer> idList) {
return service.findByUserIdIn(idList); 
}
@GetMapping("/user-role/role-id")
List<UserRoleDto> findAllByRoleId(@RequestParam List<Integer> idList) {
return service.findByRoleIdIn(idList); 
}
@PostMapping("/user-role-list")
List<UserRoleDto> saveAll(@RequestBody List<UserRoleDto> entries) {
return service.saveAll(entries); 
}
}
