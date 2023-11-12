
package com.bits.ticketbookingbus.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.bits.ticketbookingbus.dto.UserDto;
import com.bits.ticketbookingbus.persistence.entity.User;
import com.bits.ticketbookingbus.persistence.repository.UserRepository;
import com.bits.ticketbookingbus.service.api.UserService;
import com.bits.ticketbookingbus.mapper.UserMapper;
@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserRepository repository;
@Override
public List<UserDto> findAll() {
return UserMapper.INSTANCE.toDtoList(repository.findAll()); 
}
@Override
public List<UserDto> findById(Integer id) {
Optional<User> user = repository.findById(id);
if(user.isPresent()) {
return UserMapper.INSTANCE.toDtoList(new ArrayList<User>() {
{ add(user.get()); 
}
});
} else return Collections.emptyList();
}
@Override
public UserDto save(UserDto newUser) {
User user = UserMapper.INSTANCE.toEntity(newUser);
user = repository.save(user);
return UserMapper.INSTANCE.toDto(user);
}
@Override
public void deleteById(Integer id) {
repository.deleteById(id); 
}
@Override
public UserDto update(UserDto user, Integer id) {
Optional<User> obj = repository.findById(id);
if(obj.isPresent()) {
User x = obj.get();
x.setId(user.getId());
x.setName(user.getName());
x.setMailId(user.getMailId());
x.setPassword(user.getPassword());
x.setIsActive(user.getIsActive());
return UserMapper.INSTANCE.toDto(repository.save(x));
}
else {
return UserMapper.INSTANCE.toDto(repository.save(UserMapper.INSTANCE.toEntity(user)));
}
}
@Override
public List<UserDto> saveAll(List<UserDto> entries) {
List<User> list = UserMapper.INSTANCE.toEntityList(entries);
list = repository.saveAll(list);
return UserMapper.INSTANCE.toDtoList(list);
}
}
