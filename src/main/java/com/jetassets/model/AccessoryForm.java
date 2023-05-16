package com.jetassets.model;

import java.io.File;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class AccessoryForm {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String skuNumber;
	private String name;
	private String description;
	 @JsonFormat(pattern="yyyy-MM-dd")
	private Date purchaseDate;
	private double unitCost;
	private long purchaseQuantity;
	private String billNo;
	private String vendor;
	private long type;
	private File billDocument;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSkuNumber() {
		return skuNumber;
	}
	public void setSkuNumber(String skuNumber) {
		this.skuNumber = skuNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public double getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}
	public long getPurchaseQuantity() {
		return purchaseQuantity;
	}
	public void setPurchaseQuantity(long purchaseQuantity) {
		this.purchaseQuantity = purchaseQuantity;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public long getType() {
		return type;
	}
	public void setType(long type) {
		this.type = type;
	}
	public File getBillDocument() {
		return billDocument;
	}
	public void setBillDocument(File billDocument) {
		this.billDocument = billDocument;
	}
	public AccessoryForm(long id, String skuNumber, String name, String description, Date purchaseDate, double unitCost,
			long purchaseQuantity, String billNo, String vendor, long type, File billDocument) {
		super();
		this.id = id;
		this.skuNumber = skuNumber;
		this.name = name;
		this.description = description;
		this.purchaseDate = purchaseDate;
		this.unitCost = unitCost;
		this.purchaseQuantity = purchaseQuantity;
		this.billNo = billNo;
		this.vendor = vendor;
		this.type = type;
		this.billDocument = billDocument;
	}
	public AccessoryForm() {
		super();
		
	}
	@Override
	public String toString() {
		return "AccessoryForm [id=" + id + ", skuNumber=" + skuNumber + ", name=" + name + ", description="
				+ description + ", purchaseDate=" + purchaseDate + ", unitCost=" + unitCost + ", purchaseQuantity="
				+ purchaseQuantity + ", billNo=" + billNo + ", vendor=" + vendor + ", type=" + type + ", billDocument="
				+ billDocument + "]";
	}
	
	
	

}
