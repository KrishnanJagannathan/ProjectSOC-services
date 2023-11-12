
package com.bits.ticketbookingbus.service.api;
import org.springframework.stereotype.Service;
import java.util.List;
import com.bits.ticketbookingbus.dto.SourceLocationDto;
@Service
public interface SourceLocationService {
List<SourceLocationDto> findAll();
List<SourceLocationDto> findById(Integer id);
SourceLocationDto save(SourceLocationDto newSourceLocation);
void deleteById(Integer id);
SourceLocationDto update(SourceLocationDto sourceLocation, Integer id);
List<SourceLocationDto> saveAll(List<SourceLocationDto> entries);
}
