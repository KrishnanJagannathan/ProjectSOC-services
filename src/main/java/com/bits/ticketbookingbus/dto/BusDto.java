package com.bits.ticketbookingbus.dto;
public class BusDto { 

public BusDto() {
}
private Integer id;
private String type;
private String regNo;
private Integer capacity;
public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
}
public String getType() {
    return type;
}
public void setType(String type) {
    this.type = type;
}
public String getRegNo() {
    return regNo;
}
public void setRegNo(String regNo) {
    this.regNo = regNo;
}
public Integer getCapacity() {
    return capacity;
}
public void setCapacity(Integer capacity) {
    this.capacity = capacity;
}
} 

