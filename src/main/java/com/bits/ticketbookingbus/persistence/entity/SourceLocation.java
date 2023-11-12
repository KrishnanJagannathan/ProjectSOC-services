
package com.bits.ticketbookingbus.persistence.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name = "m_source_location")
public class SourceLocation { 

public SourceLocation() {
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private Integer id;
@Column(name = "name")
private String name;
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
} 

