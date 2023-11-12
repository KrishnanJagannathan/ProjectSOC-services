package com.bits.ticketbookingbus.dto;
public class RouteDto { 

public RouteDto() {
}
private Integer id;
private Integer sourceId;
private Integer destinationId;
private String weekdayList;
private Integer sleeperBusId;
private Integer semiBusId;
public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
}
public Integer getSourceId() {
    return sourceId;
}
public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
}
public Integer getDestinationId() {
    return destinationId;
}
public void setDestinationId(Integer destinationId) {
    this.destinationId = destinationId;
}
public String getWeekdayList() {
    return weekdayList;
}
public void setWeekdayList(String weekdayList) {
    this.weekdayList = weekdayList;
}
public Integer getSleeperBusId() {
    return sleeperBusId;
}
public void setSleeperBusId(Integer sleeperBusId) {
    this.sleeperBusId = sleeperBusId;
}
public Integer getSemiBusId() {
    return semiBusId;
}
public void setSemiBusId(Integer semiBusId) {
    this.semiBusId = semiBusId;
}
} 

