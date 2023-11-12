
package com.bits.ticketbookingbus.persistence.entity;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name = "t_ticket")
public class Ticket { 

public Ticket() {
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private Integer id;
@Column(name = "user_id")
private Integer userId;
@Column(name = "route_id")
private Integer routeId;
@Column(name = "ticket_number")
private String ticketNumber;
@Column(name = "journey_date")
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

