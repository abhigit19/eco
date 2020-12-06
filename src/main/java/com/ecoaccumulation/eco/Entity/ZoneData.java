package com.ecoaccumulation.eco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "zone_data")
public class ZoneData {
	
    @Id
    @GeneratedValue
    @Column(name="zone_id")
	long zoneId;
    
    @Column(name="zone_name")
	String zoneName;
    
	@Column(name="cleanliness_percent")
	String cleanlinesPercent;
	
	@ManyToOne
    @JoinColumn(name="id", nullable=false)
    private City city;

	public long getZoneId() {
		return zoneId;
	}

	public void setZoneId(long zoneId) {
		this.zoneId = zoneId;
	}

	public String getZoneName() {
		return zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

	public String getCleanlinesPercent() {
		return cleanlinesPercent;
	}

	public void setCleanlinesPercent(String cleanlinesPercent) {
		this.cleanlinesPercent = cleanlinesPercent;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	

}
