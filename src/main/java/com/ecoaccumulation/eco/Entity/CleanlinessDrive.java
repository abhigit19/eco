package com.ecoaccumulation.eco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="CLEANLINESS_DRIVE")
public class CleanlinessDrive {

    @Id
    @GeneratedValue
    @Column(name="cid")
    private long id;
    
    @Column(name="organizer_name")
    private String organizerName;
    
    @Column(name="event_name")
    private String eventName;
    
    @Column(name="expected_percent")
    private String expectedPercent;
    
    @Column(name="drive_date")
    private String driveDate;
   
	@ManyToOne
    @JoinColumn(name="zone_id", nullable=false)
    private ZoneData zoneData;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrganizerName() {
		return organizerName;
	}

	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getExpectedPercent() {
		return expectedPercent;
	}

	public void setExpectedPercent(String expectedPercent) {
		this.expectedPercent = expectedPercent;
	}

	public String getDriveDate() {
		return driveDate;
	}

	public void setDriveDate(String driveDate) {
		this.driveDate = driveDate;
	}

	public ZoneData getZoneData() {
		return zoneData;
	}

	public void setZoneData(ZoneData zoneData) {
		this.zoneData = zoneData;
	}

}
