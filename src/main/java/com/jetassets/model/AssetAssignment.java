package com.jetassets.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class AssetAssignment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private long asset;
    private long employee;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date issueDate;
    private String issueCondition;
    private String issueRemark;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date returnDate;
    private String returnCondition;
    private String returnRemark;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAsset() {
		return asset;
	}
	public void setAsset(long asset) {
		this.asset = asset;
	}
	public long getEmployee() {
		return employee;
	}
	public void setEmployee(long employee) {
		this.employee = employee;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public String getIssueCondition() {
		return issueCondition;
	}
	public void setIssueCondition(String issueCondition) {
		this.issueCondition = issueCondition;
	}
	public String getIssueRemark() {
		return issueRemark;
	}
	public void setIssueRemark(String issueRemark) {
		this.issueRemark = issueRemark;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public String getReturnCondition() {
		return returnCondition;
	}
	public void setReturnCondition(String returnCondition) {
		this.returnCondition = returnCondition;
	}
	public String getReturnRemark() {
		return returnRemark;
	}
	public void setReturnRemark(String returnRemark) {
		this.returnRemark = returnRemark;
	}
	public AssetAssignment(long id, long asset, long employee, Date issueDate, String issueCondition,
			String issueRemark, Date returnDate, String returnCondition, String returnRemark) {
		super();
		this.id = id;
		this.asset = asset;
		this.employee = employee;
		this.issueDate = issueDate;
		this.issueCondition = issueCondition;
		this.issueRemark = issueRemark;
		this.returnDate = returnDate;
		this.returnCondition = returnCondition;
		this.returnRemark = returnRemark;
	}
	public AssetAssignment() {
		super();
		
	}
	@Override
	public String toString() {
		return "AssetAssignment [id=" + id + ", asset=" + asset + ", employee=" + employee + ", issueDate=" + issueDate
				+ ", issueCondition=" + issueCondition + ", issueRemark=" + issueRemark + ", returnDate=" + returnDate
				+ ", returnCondition=" + returnCondition + ", returnRemark=" + returnRemark + "]";
	}
    
    
    

}
