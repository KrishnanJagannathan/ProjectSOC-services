package com.bits.ticketbookingbus.dto;

import java.time.LocalDateTime;

public class TicketDto { 

public TicketDto() {
}
private Integer id;
private Integer userId;
private Integer routeId;
private String ticketNumber;
private LocalDateTime journeyDate;
public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
}
public Integer getUserId() {
    return userId;
}
public void setUserId(Integer userId) {
    this.userId = userId;
}
public Integer getRouteId() {
    return routeId;
}
public void setRouteId(Integer routeId) {
    this.routeId = routeId;
}
public String getTicketNumber() {
    return ticketNumber;
}
public void setTicketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
}
public LocalDateTime getJourneyDate() {
    return journeyDate;
}
public void setJourneyDate(LocalDateTime journeyDate) {
    this.journeyDate = journeyDate;
}
} 

