
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
import com.bits.ticketbookingbus.dto.UserDto;
import com.bits.ticketbookingbus.service.api.UserService;
@RestController
class UserController {
@Autowired
private UserService service;
@GetMapping("/user")
List<UserDto> all() {
return service.findAll(); 
}
@GetMapping("/user/{id}")
List<UserDto> one(@PathVariable Integer id) {
return service.findById(id); 
}
@PostMapping("/user")
UserDto newUser(@RequestBody UserDto newUser) {
return service.save(newUser); 
}
@DeleteMapping("/user/{id}")
void deleteUser(@PathVariable Integer id) {
service.deleteById(id); 
}
@PutMapping("/user/{id}")
UserDto updateUser(@RequestBody UserDto user, @PathVariable Integer id) {
return service.update(user,id); 
}
@PostMapping("/user-list")
List<UserDto> saveAll(@RequestBody List<UserDto> entries) {
return service.saveAll(entries); 
}
}
