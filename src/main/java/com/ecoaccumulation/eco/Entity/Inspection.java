package com.ecoaccumulation.eco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="inspection")
public class Inspection {

    @Id
    @GeneratedValue
    @Column(name="inspection_id")
    private long id;
    
    @Column(name="examiner")
    private String examiner;
    
    @Column(name="deplete_percent")
    private String depletePercent;
    
    @Column(name="inspection_date")
    private String inspectionDate;
   
	@ManyToOne
    @JoinColumn(name="zone_id", nullable=false)
    private ZoneData zoneData;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getExaminer() {
		return examiner;
	}

	public void setExaminer(String examiner) {
		this.examiner = examiner;
	}

	public String getDepletePercent() {
		return depletePercent;
	}

	public void setDepletePercent(String depletePercent) {
		this.depletePercent = depletePercent;
	}

	public String getInspectionDate() {
		return inspectionDate;
	}

	public void setInspectionDate(String inspectionDate) {
		this.inspectionDate = inspectionDate;
	}

	public ZoneData getZoneData() {
		return zoneData;
	}

	public void setZoneData(ZoneData zoneData) {
		this.zoneData = zoneData;
	}
	
}
