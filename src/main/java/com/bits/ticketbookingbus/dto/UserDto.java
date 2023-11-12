package com.bits.ticketbookingbus.dto;
public class UserDto { 

public UserDto() {
}
private Integer id;
private String name;
private String mailId;
private String password;
private Boolean isActive;
public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getMailId() {
    return mailId;
}
public void setMailId(String mailId) {
    this.mailId = mailId;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}
public Boolean getIsActive() {
    return isActive;
}
public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
}
} 

