
package com.bits.ticketbookingbus.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.bits.ticketbookingbus.dto.UserRoleDto;
import com.bits.ticketbookingbus.persistence.entity.UserRole;
import com.bits.ticketbookingbus.persistence.repository.UserRoleRepository;
import com.bits.ticketbookingbus.service.api.UserRoleService;
import com.bits.ticketbookingbus.mapper.UserRoleMapper;
@Service
public class UserRoleServiceImpl implements UserRoleService {
@Autowired
private UserRoleRepository repository;
@Override
public List<UserRoleDto> findAll() {
return UserRoleMapper.INSTANCE.toDtoList(repository.findAll()); 
}
@Override
public List<UserRoleDto> findById(Integer id) {
Optional<UserRole> userRole = repository.findById(id);
if(userRole.isPresent()) {
return UserRoleMapper.INSTANCE.toDtoList(new ArrayList<UserRole>() {
{ add(userRole.get()); 
}
});
} else return Collections.emptyList();
}
@Override
public UserRoleDto save(UserRoleDto newUserRole) {
UserRole userRole = UserRoleMapper.INSTANCE.toEntity(newUserRole);
userRole = repository.save(userRole);
return UserRoleMapper.INSTANCE.toDto(userRole);
}
@Override
public void deleteById(Integer id) {
repository.deleteById(id); 
}
@Override
public UserRoleDto update(UserRoleDto userRole, Integer id) {
Optional<UserRole> obj = repository.findById(id);
if(obj.isPresent()) {
UserRole x = obj.get();
x.setId(userRole.getId());
x.setUserId(userRole.getUserId());
x.setRoleId(userRole.getRoleId());
return UserRoleMapper.INSTANCE.toDto(repository.save(x));
}
else {
return UserRoleMapper.INSTANCE.toDto(repository.save(UserRoleMapper.INSTANCE.toEntity(userRole)));
}
}
@Override
public List<UserRoleDto> findByUserIdIn(List<Integer> idList) {
return UserRoleMapper.INSTANCE.toDtoList(repository.findByUserIdIn(idList)); 
}
@Override
public List<UserRoleDto> findByRoleIdIn(List<Integer> idList) {
return UserRoleMapper.INSTANCE.toDtoList(repository.findByRoleIdIn(idList)); 
}
@Override
public List<UserRoleDto> saveAll(List<UserRoleDto> entries) {
List<UserRole> list = UserRoleMapper.INSTANCE.toEntityList(entries);
list = repository.saveAll(list);
return UserRoleMapper.INSTANCE.toDtoList(list);
}
}
