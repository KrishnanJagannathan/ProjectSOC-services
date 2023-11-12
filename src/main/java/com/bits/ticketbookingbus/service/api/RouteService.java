
package com.bits.ticketbookingbus.service.api;
import org.springframework.stereotype.Service;
import java.util.List;
import com.bits.ticketbookingbus.dto.RouteDto;
@Service
public interface RouteService {
List<RouteDto> findAll();
List<RouteDto> findById(Integer id);
RouteDto save(RouteDto newRoute);
void deleteById(Integer id);
RouteDto update(RouteDto route, Integer id);
List<RouteDto> findBySourceIdIn(List<Integer> idList);
List<RouteDto> findByDestinationIdIn(List<Integer> idList);
List<RouteDto> saveAll(List<RouteDto> entries);
}
