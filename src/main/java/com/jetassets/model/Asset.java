package com.jetassets.model;

import java.io.File;
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
public class Asset {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String SKUNumber;
	private String description;
	
	/*
	 * @OneToOne(cascade = CascadeType.MERGE)
	 * 
	 * @JoinColumn(name = "asset_type_id") 
	 */
	private long assetType;
	private long parentType;
	
	 @JsonFormat(pattern="yyyy-MM-dd")
	private Date purchaseDate;
	private String cost;
	private String billNo;
	private String name;
	private String model;
	 @JsonFormat(pattern="yyyy-MM-dd")
	private Date warrantyUpTo;
	private String vendor;
	private File billDocument;
	public Asset(long id, String sKUNumber, String description, long assetType, long parentType, Date purchaseDate,
			String cost, String billNo, String name, String model, Date warrantyUpTo, String vendor,
			File billDocument) {
		super();
		this.id = id;
		SKUNumber = sKUNumber;
		this.description = description;
		this.assetType = assetType;
		this.parentType = parentType;
		this.purchaseDate = purchaseDate;
		this.cost = cost;
		this.billNo = billNo;
		this.name = name;
		this.model = model;
		this.warrantyUpTo = warrantyUpTo;
		this.vendor = vendor;
		this.billDocument = billDocument;
	}
	public Asset() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSKUNumber() {
		return SKUNumber;
	}
	public void setSKUNumber(String sKUNumber) {
		SKUNumber = sKUNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getAssetType() {
		return assetType;
	}
	public void setAssetType(long assetType) {
		this.assetType = assetType;
	}
	public long getParentType() {
		return parentType;
	}
	public void setParentType(long parentType) {
		this.parentType = parentType;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Date getWarrantyUpTo() {
		return warrantyUpTo;
	}
	public void setWarrantyUpTo(Date warrantyUpTo) {
		this.warrantyUpTo = warrantyUpTo;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public File getBillDocument() {
		return billDocument;
	}
	public void setBillDocument(File billDocument) {
		this.billDocument = billDocument;
	}
	@Override
	public String toString() {
		return "Asset [id=" + id + ", SKUNumber=" + SKUNumber + ", description=" + description + ", assetType="
				+ assetType + ", parentType=" + parentType + ", purchaseDate=" + purchaseDate + ", cost=" + cost
				+ ", billNo=" + billNo + ", name=" + name + ", model=" + model + ", warrantyUpTo=" + warrantyUpTo
				+ ", vendor=" + vendor + ", billDocument=" + billDocument + "]";
	}
	
	
	
	
	
	

}
