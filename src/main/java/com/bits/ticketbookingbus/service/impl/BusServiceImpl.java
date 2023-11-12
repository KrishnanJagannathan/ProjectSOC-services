
package com.bits.ticketbookingbus.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.bits.ticketbookingbus.dto.BusDto;
import com.bits.ticketbookingbus.persistence.entity.Bus;
import com.bits.ticketbookingbus.persistence.repository.BusRepository;
import com.bits.ticketbookingbus.service.api.BusService;
import com.bits.ticketbookingbus.mapper.BusMapper;
@Service
public class BusServiceImpl implements BusService {
@Autowired
private BusRepository repository;
@Override
public List<BusDto> findAll() {
return BusMapper.INSTANCE.toDtoList(repository.findAll()); 
}
@Override
public List<BusDto> findById(Integer id) {
Optional<Bus> bus = repository.findById(id);
if(bus.isPresent()) {
return BusMapper.INSTANCE.toDtoList(new ArrayList<Bus>() {
{ add(bus.get()); 
}
});
} else return Collections.emptyList();
}
@Override
public BusDto save(BusDto newBus) {
Bus bus = BusMapper.INSTANCE.toEntity(newBus);
bus = repository.save(bus);
return BusMapper.INSTANCE.toDto(bus);
}
@Override
public void deleteById(Integer id) {
repository.deleteById(id); 
}
@Override
public BusDto update(BusDto bus, Integer id) {
Optional<Bus> obj = repository.findById(id);
if(obj.isPresent()) {
Bus x = obj.get();
x.setId(bus.getId());
x.setType(bus.getType());
x.setRegNo(bus.getRegNo());
x.setCapacity(bus.getCapacity());
return BusMapper.INSTANCE.toDto(repository.save(x));
}
else {
return BusMapper.INSTANCE.toDto(repository.save(BusMapper.INSTANCE.toEntity(bus)));
}
}
@Override
public List<BusDto> saveAll(List<BusDto> entries) {
List<Bus> list = BusMapper.INSTANCE.toEntityList(entries);
list = repository.saveAll(list);
return BusMapper.INSTANCE.toDtoList(list);
}
}
