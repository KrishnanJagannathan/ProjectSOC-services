
package com.bits.ticketbookingbus.persistence.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name = "m_user")
public class User { 

public User() {
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private Integer id;
@Column(name = "name")
private String name;
@Column(name = "mail_id")
private String mailId;
@Column(name = "password")
private String password;
@Column(name = "is_active")
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

