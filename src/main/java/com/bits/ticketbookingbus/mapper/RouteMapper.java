
package com.bits.ticketbookingbus.mapper;
import java.util.List;
import com.bits.ticketbookingbus.persistence.entity.Route;
import com.bits.ticketbookingbus.dto.RouteDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface RouteMapper {
RouteMapper INSTANCE = Mappers.getMapper(RouteMapper.class);
RouteDto toDto(Route route);
Route toEntity(RouteDto routeDto);
List<RouteDto> toDtoList(List<Route> route);
List<Route> toEntityList(List<RouteDto> routeDto);
}
