
package com.bits.ticketbookingbus.persistence.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name = "m_bus")
public class Bus { 

public Bus() {
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private Integer id;
@Column(name = "type")
private String type;
@Column(name = "reg_no")
private String regNo;
@Column(name = "capacity")
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

