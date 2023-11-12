
package com.bits.ticketbookingbus.mapper;
import java.util.List;
import com.bits.ticketbookingbus.persistence.entity.UserRole;
import com.bits.ticketbookingbus.dto.UserRoleDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface UserRoleMapper {
UserRoleMapper INSTANCE = Mappers.getMapper(UserRoleMapper.class);
UserRoleDto toDto(UserRole userRole);
UserRole toEntity(UserRoleDto userRoleDto);
List<UserRoleDto> toDtoList(List<UserRole> userRole);
List<UserRole> toEntityList(List<UserRoleDto> userRoleDto);
}
