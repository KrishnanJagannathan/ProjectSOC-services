
package com.bits.ticketbookingbus.service.api;
import org.springframework.stereotype.Service;
import java.util.List;
import com.bits.ticketbookingbus.dto.RoleDto;
@Service
public interface RoleService {
List<RoleDto> findAll();
List<RoleDto> findById(Integer id);
RoleDto save(RoleDto newRole);
void deleteById(Integer id);
RoleDto update(RoleDto role, Integer id);
List<RoleDto> saveAll(List<RoleDto> entries);
}
