
package com.bits.ticketbookingbus.mapper;
import java.util.List;
import com.bits.ticketbookingbus.persistence.entity.Ticket;
import com.bits.ticketbookingbus.dto.TicketDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface TicketMapper {
TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);
TicketDto toDto(Ticket ticket);
Ticket toEntity(TicketDto ticketDto);
List<TicketDto> toDtoList(List<Ticket> ticket);
List<Ticket> toEntityList(List<TicketDto> ticketDto);
}
