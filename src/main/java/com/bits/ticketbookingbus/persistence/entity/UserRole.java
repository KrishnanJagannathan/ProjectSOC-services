
package com.bits.ticketbookingbus.persistence.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name = "map_user_role")
public class UserRole { 

public UserRole() {
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private Integer id;
@Column(name = "user_id")
private Integer userId;
@Column(name = "role_id")
private Integer roleId;
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

public Integer getRoleId() {
    return roleId;
}
public void setRoleId(Integer roleId) {
    this.roleId = roleId;
}
} 

