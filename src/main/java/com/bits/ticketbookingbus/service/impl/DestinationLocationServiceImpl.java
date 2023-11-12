
package com.bits.ticketbookingbus.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.bits.ticketbookingbus.dto.DestinationLocationDto;
import com.bits.ticketbookingbus.persistence.entity.DestinationLocation;
import com.bits.ticketbookingbus.persistence.repository.DestinationLocationRepository;
import com.bits.ticketbookingbus.service.api.DestinationLocationService;
import com.bits.ticketbookingbus.mapper.DestinationLocationMapper;
@Service
public class DestinationLocationServiceImpl implements DestinationLocationService {
@Autowired
private DestinationLocationRepository repository;
@Override
public List<DestinationLocationDto> findAll() {
return DestinationLocationMapper.INSTANCE.toDtoList(repository.findAll()); 
}
@Override
public List<DestinationLocationDto> findById(Integer id) {
Optional<DestinationLocation> destinationLocation = repository.findById(id);
if(destinationLocation.isPresent()) {
return DestinationLocationMapper.INSTANCE.toDtoList(new ArrayList<DestinationLocation>() {
{ add(destinationLocation.get()); 
}
});
} else return Collections.emptyList();
}
@Override
public DestinationLocationDto save(DestinationLocationDto newDestinationLocation) {
DestinationLocation destinationLocation = DestinationLocationMapper.INSTANCE.toEntity(newDestinationLocation);
destinationLocation = repository.save(destinationLocation);
return DestinationLocationMapper.INSTANCE.toDto(destinationLocation);
}
@Override
public void deleteById(Integer id) {
repository.deleteById(id); 
}
@Override
public DestinationLocationDto update(DestinationLocationDto destinationLocation, Integer id) {
Optional<DestinationLocation> obj = repository.findById(id);
if(obj.isPresent()) {
DestinationLocation x = obj.get();
x.setId(destinationLocation.getId());
x.setName(destinationLocation.getName());
return DestinationLocationMapper.INSTANCE.toDto(repository.save(x));
}
else {
return DestinationLocationMapper.INSTANCE.toDto(repository.save(DestinationLocationMapper.INSTANCE.toEntity(destinationLocation)));
}
}
@Override
public List<DestinationLocationDto> saveAll(List<DestinationLocationDto> entries) {
List<DestinationLocation> list = DestinationLocationMapper.INSTANCE.toEntityList(entries);
list = repository.saveAll(list);
return DestinationLocationMapper.INSTANCE.toDtoList(list);
}
}
