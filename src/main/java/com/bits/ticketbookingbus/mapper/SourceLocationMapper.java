
package com.bits.ticketbookingbus.mapper;
import java.util.List;
import com.bits.ticketbookingbus.persistence.entity.SourceLocation;
import com.bits.ticketbookingbus.dto.SourceLocationDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface SourceLocationMapper {
SourceLocationMapper INSTANCE = Mappers.getMapper(SourceLocationMapper.class);
SourceLocationDto toDto(SourceLocation sourceLocation);
SourceLocation toEntity(SourceLocationDto sourceLocationDto);
List<SourceLocationDto> toDtoList(List<SourceLocation> sourceLocation);
List<SourceLocation> toEntityList(List<SourceLocationDto> sourceLocationDto);
}
