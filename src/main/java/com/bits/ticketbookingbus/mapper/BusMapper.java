
package com.bits.ticketbookingbus.mapper;
import java.util.List;
import com.bits.ticketbookingbus.persistence.entity.Bus;
import com.bits.ticketbookingbus.dto.BusDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface BusMapper {
BusMapper INSTANCE = Mappers.getMapper(BusMapper.class);
BusDto toDto(Bus bus);
Bus toEntity(BusDto busDto);
List<BusDto> toDtoList(List<Bus> bus);
List<Bus> toEntityList(List<BusDto> busDto);
}
