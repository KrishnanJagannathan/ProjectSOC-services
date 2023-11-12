
package com.bits.ticketbookingbus.service.api;
import org.springframework.stereotype.Service;
import java.util.List;
import com.bits.ticketbookingbus.dto.UserRoleDto;
@Service
public interface UserRoleService {
List<UserRoleDto> findAll();
List<UserRoleDto> findById(Integer id);
UserRoleDto save(UserRoleDto newUserRole);
void deleteById(Integer id);
UserRoleDto update(UserRoleDto userRole, Integer id);
List<UserRoleDto> findByUserIdIn(List<Integer> idList);
List<UserRoleDto> findByRoleIdIn(List<Integer> idList);
List<UserRoleDto> saveAll(List<UserRoleDto> entries);
}
