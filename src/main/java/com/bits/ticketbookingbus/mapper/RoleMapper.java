
package com.bits.ticketbookingbus.mapper;
import java.util.List;
import com.bits.ticketbookingbus.persistence.entity.Role;
import com.bits.ticketbookingbus.dto.RoleDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface RoleMapper {
RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);
RoleDto toDto(Role role);
Role toEntity(RoleDto roleDto);
List<RoleDto> toDtoList(List<Role> role);
List<Role> toEntityList(List<RoleDto> roleDto);
}
