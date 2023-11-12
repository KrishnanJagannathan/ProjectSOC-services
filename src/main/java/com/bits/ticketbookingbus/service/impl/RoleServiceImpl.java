
package com.bits.ticketbookingbus.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.bits.ticketbookingbus.dto.RoleDto;
import com.bits.ticketbookingbus.persistence.entity.Role;
import com.bits.ticketbookingbus.persistence.repository.RoleRepository;
import com.bits.ticketbookingbus.service.api.RoleService;
import com.bits.ticketbookingbus.mapper.RoleMapper;
@Service
public class RoleServiceImpl implements RoleService {
@Autowired
private RoleRepository repository;
@Override
public List<RoleDto> findAll() {
return RoleMapper.INSTANCE.toDtoList(repository.findAll()); 
}
@Override
public List<RoleDto> findById(Integer id) {
Optional<Role> role = repository.findById(id);
if(role.isPresent()) {
return RoleMapper.INSTANCE.toDtoList(new ArrayList<Role>() {
{ add(role.get()); 
}
});
} else return Collections.emptyList();
}
@Override
public RoleDto save(RoleDto newRole) {
Role role = RoleMapper.INSTANCE.toEntity(newRole);
role = repository.save(role);
return RoleMapper.INSTANCE.toDto(role);
}
@Override
public void deleteById(Integer id) {
repository.deleteById(id); 
}
@Override
public RoleDto update(RoleDto role, Integer id) {
Optional<Role> obj = repository.findById(id);
if(obj.isPresent()) {
Role x = obj.get();
x.setId(role.getId());
x.setName(role.getName());
x.setCanLogin(role.getCanLogin());
return RoleMapper.INSTANCE.toDto(repository.save(x));
}
else {
return RoleMapper.INSTANCE.toDto(repository.save(RoleMapper.INSTANCE.toEntity(role)));
}
}
@Override
public List<RoleDto> saveAll(List<RoleDto> entries) {
List<Role> list = RoleMapper.INSTANCE.toEntityList(entries);
list = repository.saveAll(list);
return RoleMapper.INSTANCE.toDtoList(list);
}
}
