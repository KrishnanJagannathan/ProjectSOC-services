
package com.bits.ticketbookingbus.persistence.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name = "m_route")
public class Route { 

public Route() {
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private Integer id;
@Column(name = "source_id")
private Integer sourceId;
@Column(name = "destination_id")
private Integer destinationId;
@Column(name = "weekday_list")
private String weekdayList;
@Column(name = "sleeper_bus_id")
private Integer sleeperBusId;
@Column(name = "semi_bus_id")
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

