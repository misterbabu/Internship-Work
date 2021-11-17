package org.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUD_TAB")
public class Student {

	@Id
	@Column(name = "STUD_ID")
	private Integer studId;
	@Column(name = "STUD_PANID")
	private String studPanId;
	
	
	public Integer getStudId() {
		return studId;
	}
	public void setStudId(Integer studId) {
		this.studId = studId;
	}
	public String getStudPanId() {
		return studPanId;
	}
	public void setStudPanId(String studPanId) {
		this.studPanId = studPanId;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studPanId=" + studPanId + "]";
	}
	
	
}