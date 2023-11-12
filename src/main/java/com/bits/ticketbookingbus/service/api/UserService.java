
package com.bits.ticketbookingbus.service.api;
import org.springframework.stereotype.Service;
import java.util.List;
import com.bits.ticketbookingbus.dto.UserDto;
@Service
public interface UserService {
List<UserDto> findAll();
List<UserDto> findById(Integer id);
UserDto save(UserDto newUser);
void deleteById(Integer id);
UserDto update(UserDto user, Integer id);
List<UserDto> saveAll(List<UserDto> entries);
}
