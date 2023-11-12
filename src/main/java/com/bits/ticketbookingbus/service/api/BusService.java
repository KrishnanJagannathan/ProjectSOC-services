
package com.bits.ticketbookingbus.service.api;
import org.springframework.stereotype.Service;
import java.util.List;
import com.bits.ticketbookingbus.dto.BusDto;
@Service
public interface BusService {
List<BusDto> findAll();
List<BusDto> findById(Integer id);
BusDto save(BusDto newBus);
void deleteById(Integer id);
BusDto update(BusDto bus, Integer id);
List<BusDto> saveAll(List<BusDto> entries);
}
