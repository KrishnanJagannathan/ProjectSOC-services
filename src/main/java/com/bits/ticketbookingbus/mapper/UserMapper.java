
package com.bits.ticketbookingbus.mapper;
import java.util.List;
import com.bits.ticketbookingbus.persistence.entity.User;
import com.bits.ticketbookingbus.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface UserMapper {
UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
UserDto toDto(User user);
User toEntity(UserDto userDto);
List<UserDto> toDtoList(List<User> user);
List<User> toEntityList(List<UserDto> userDto);
}
