
package com.bits.ticketbookingbus.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.bits.ticketbookingbus.dto.RouteDto;
import com.bits.ticketbookingbus.persistence.entity.Route;
import com.bits.ticketbookingbus.persistence.repository.RouteRepository;
import com.bits.ticketbookingbus.service.api.RouteService;
import com.bits.ticketbookingbus.mapper.RouteMapper;
@Service
public class RouteServiceImpl implements RouteService {
@Autowired
private RouteRepository repository;
@Override
public List<RouteDto> findAll() {
return RouteMapper.INSTANCE.toDtoList(repository.findAll()); 
}
@Override
public List<RouteDto> findById(Integer id) {
Optional<Route> route = repository.findById(id);
if(route.isPresent()) {
return RouteMapper.INSTANCE.toDtoList(new ArrayList<Route>() {
{ add(route.get()); 
}
});
} else return Collections.emptyList();
}
@Override
public RouteDto save(RouteDto newRoute) {
Route route = RouteMapper.INSTANCE.toEntity(newRoute);
route = repository.save(route);
return RouteMapper.INSTANCE.toDto(route);
}
@Override
public void deleteById(Integer id) {
repository.deleteById(id); 
}
@Override
public RouteDto update(RouteDto route, Integer id) {
Optional<Route> obj = repository.findById(id);
if(obj.isPresent()) {
Route x = obj.get();
x.setId(route.getId());
x.setSourceId(route.getSourceId());
x.setDestinationId(route.getDestinationId());
x.setWeekdayList(route.getWeekdayList());
x.setSleeperBusId(route.getSleeperBusId());
x.setSemiBusId(route.getSemiBusId());
return RouteMapper.INSTANCE.toDto(repository.save(x));
}
else {
return RouteMapper.INSTANCE.toDto(repository.save(RouteMapper.INSTANCE.toEntity(route)));
}
}
@Override
public List<RouteDto> findBySourceIdIn(List<Integer> idList) {
return RouteMapper.INSTANCE.toDtoList(repository.findBySourceIdIn(idList)); 
}
@Override
public List<RouteDto> findByDestinationIdIn(List<Integer> idList) {
return RouteMapper.INSTANCE.toDtoList(repository.findByDestinationIdIn(idList)); 
}
@Override
public List<RouteDto> saveAll(List<RouteDto> entries) {
List<Route> list = RouteMapper.INSTANCE.toEntityList(entries);
list = repository.saveAll(list);
return RouteMapper.INSTANCE.toDtoList(list);
}
}
