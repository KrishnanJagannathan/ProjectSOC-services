
package com.bits.ticketbookingbus.mapper;
import java.util.List;
import com.bits.ticketbookingbus.persistence.entity.DestinationLocation;
import com.bits.ticketbookingbus.dto.DestinationLocationDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface DestinationLocationMapper {
DestinationLocationMapper INSTANCE = Mappers.getMapper(DestinationLocationMapper.class);
DestinationLocationDto toDto(DestinationLocation destinationLocation);
DestinationLocation toEntity(DestinationLocationDto destinationLocationDto);
List<DestinationLocationDto> toDtoList(List<DestinationLocation> destinationLocation);
List<DestinationLocation> toEntityList(List<DestinationLocationDto> destinationLocationDto);
}
