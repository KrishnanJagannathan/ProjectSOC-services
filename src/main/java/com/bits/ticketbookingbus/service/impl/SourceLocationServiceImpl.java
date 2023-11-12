
package com.bits.ticketbookingbus.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.bits.ticketbookingbus.dto.SourceLocationDto;
import com.bits.ticketbookingbus.persistence.entity.SourceLocation;
import com.bits.ticketbookingbus.persistence.repository.SourceLocationRepository;
import com.bits.ticketbookingbus.service.api.SourceLocationService;
import com.bits.ticketbookingbus.mapper.SourceLocationMapper;
@Service
public class SourceLocationServiceImpl implements SourceLocationService {
@Autowired
private SourceLocationRepository repository;
@Override
public List<SourceLocationDto> findAll() {
return SourceLocationMapper.INSTANCE.toDtoList(repository.findAll()); 
}
@Override
public List<SourceLocationDto> findById(Integer id) {
Optional<SourceLocation> sourceLocation = repository.findById(id);
if(sourceLocation.isPresent()) {
return SourceLocationMapper.INSTANCE.toDtoList(new ArrayList<SourceLocation>() {
{ add(sourceLocation.get()); 
}
});
} else return Collections.emptyList();
}
@Override
public SourceLocationDto save(SourceLocationDto newSourceLocation) {
SourceLocation sourceLocation = SourceLocationMapper.INSTANCE.toEntity(newSourceLocation);
sourceLocation = repository.save(sourceLocation);
return SourceLocationMapper.INSTANCE.toDto(sourceLocation);
}
@Override
public void deleteById(Integer id) {
repository.deleteById(id); 
}
@Override
public SourceLocationDto update(SourceLocationDto sourceLocation, Integer id) {
Optional<SourceLocation> obj = repository.findById(id);
if(obj.isPresent()) {
SourceLocation x = obj.get();
x.setId(sourceLocation.getId());
x.setName(sourceLocation.getName());
return SourceLocationMapper.INSTANCE.toDto(repository.save(x));
}
else {
return SourceLocationMapper.INSTANCE.toDto(repository.save(SourceLocationMapper.INSTANCE.toEntity(sourceLocation)));
}
}
@Override
public List<SourceLocationDto> saveAll(List<SourceLocationDto> entries) {
List<SourceLocation> list = SourceLocationMapper.INSTANCE.toEntityList(entries);
list = repository.saveAll(list);
return SourceLocationMapper.INSTANCE.toDtoList(list);
}
}
