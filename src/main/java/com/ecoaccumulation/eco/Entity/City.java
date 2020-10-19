package com.ecoaccumulation.eco.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="city")
public class City {

    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;
    
    @Column(name="city")
    private String city;
    
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<ZoneData> zoneData;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
    
    
}
