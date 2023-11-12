
package com.bits.ticketbookingbus.service.api;
import org.springframework.stereotype.Service;
import java.util.List;
import com.bits.ticketbookingbus.dto.DestinationLocationDto;
@Service
public interface DestinationLocationService {
List<DestinationLocationDto> findAll();
List<DestinationLocationDto> findById(Integer id);
DestinationLocationDto save(DestinationLocationDto newDestinationLocation);
void deleteById(Integer id);
DestinationLocationDto update(DestinationLocationDto destinationLocation, Integer id);
List<DestinationLocationDto> saveAll(List<DestinationLocationDto> entries);
}
