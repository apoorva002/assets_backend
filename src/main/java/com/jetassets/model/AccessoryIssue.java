package com.jetassets.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class AccessoryIssue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private long accessoryId;
	private long employeeId;
	private String nonEmployee;
	 @JsonFormat(pattern="yyyy-MM-dd")
	private Date issueDate;
	private String issueQuantiy;
	private String remark;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAccessoryId() {
		return accessoryId;
	}
	public void setAccessoryId(long accessoryId) {
		this.accessoryId = accessoryId;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getNonEmployee() {
		return nonEmployee;
	}
	public void setNonEmployee(String nonEmployee) {
		this.nonEmployee = nonEmployee;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public String getIssueQuantiy() {
		return issueQuantiy;
	}
	public void setIssueQuantiy(String issueQuantiy) {
		this.issueQuantiy = issueQuantiy;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public AccessoryIssue(long id, long accessoryId, long employeeId, String nonEmployee, Date issueDate,
			String issueQuantiy, String remark) {
		super();
		this.id = id;
		this.accessoryId = accessoryId;
		this.employeeId = employeeId;
		this.nonEmployee = nonEmployee;
		this.issueDate = issueDate;
		this.issueQuantiy = issueQuantiy;
		this.remark = remark;
	}
	public AccessoryIssue() {
		super();
		
	}
	@Override
	public String toString() {
		return "AccessoryIssue [id=" + id + ", accessoryId=" + accessoryId + ", employeeId=" + employeeId
				+ ", nonEmployee=" + nonEmployee + ", issueDate=" + issueDate + ", issueQuantiy=" + issueQuantiy
				+ ", remark=" + remark + "]";
	}
	
	
	
	
	

}
