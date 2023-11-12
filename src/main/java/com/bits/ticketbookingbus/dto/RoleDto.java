package com.bits.ticketbookingbus.dto;
public class RoleDto { 

public RoleDto() {
}
private Integer id;
private String name;
private Boolean canLogin;
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
public Boolean getCanLogin() {
    return canLogin;
}
public void setCanLogin(Boolean canLogin) {
    this.canLogin = canLogin;
}
} 

