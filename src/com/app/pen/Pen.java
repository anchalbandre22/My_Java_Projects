package com.app.pen;

import java.time.LocalDate;

public class Pen {
/*A company StyleWithPen sells stylish Pens online. 
Company needs an interface for site admin to manage stocks.

Write a console-based menu driven java program for site ADMIN to perform following operations: 

1. Add new Pen
2. Update stock of aPen
3. Set discount of 20% for all the pens which are not at all sold in last 3 months
4. Remove Pens which arenever sold once listed in 9 months

You can define a class Pen with the following fields – 
a.	ID (unique identifier for each Pen, should be generated automatically)
b.	Brand (Example:  Cello, Parker, Reynolds etc.)
c.	Color
d.	InkColor
e.	Material (Example: Plastic, Alloy Steel, Metal etc.)
f.	Stock (Available quantity)
g.	Stock Update Date (it changed every time when admin update stock or user order executed)
h.	Stock Listing Date (date on which product is added to site for sale)
i.	Price (in INR) 
j.	Discounts (in percentage)

Note: You can use java collection to store items in memory. */
	
	
	private int penId;
	private BrandType brandtype;
	private String color ;
	private String inkColor;
	private MaterialType matType;
	private double quntity;
	private LocalDate updateDate;
	private LocalDate listingDate;
	private double price;
	private double discount;
	
	public Pen() {
		
	}
	public Pen(int penId, BrandType brandtype, String color, String inkColor, MaterialType matType, double quntity,
			LocalDate updateDate, LocalDate listingDate, double price, double discount) {
		super();
		this.penId = penId;
		this.brandtype = brandtype;
		this.color = color;
		this.inkColor = inkColor;
		this.matType = matType;
		this.quntity = quntity;
		this.updateDate = updateDate;
		this.listingDate = listingDate;
		this.price = price;
		this.discount = discount;
	} 
	
	


   public Pen(int penId) {
		super();
		this.penId = penId;
	}




//	public Pen(BrandType brandtype, String color, String inkColor, MaterialType matType, double quntity,
//			LocalDate updateDate, LocalDate listingDate, double price, double discount) {
//		super();
//		this.brandtype = brandtype;
//		this.color = color;
//		this.inkColor = inkColor;
//		this.matType = matType;
//		this.quntity = quntity;
//		this.updateDate = updateDate;
//		this.listingDate = listingDate;
//		this.price = price;
//		this.discount = discount;
//	}


	public int getPenId() {
		return penId;
	}


	public void setPenId(int penId) {
		this.penId = penId;
	}


	public BrandType getBrandtype() {
		return brandtype;
	}


	public void setBrandtype(BrandType brandtype) {
		this.brandtype = brandtype;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getInkColor() {
		return inkColor;
	}


	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}


	public MaterialType getMatType() {
		return matType;
	}


	public void setMatType(MaterialType matType) {
		this.matType = matType;
	}


	public double getQuntity() {
		return quntity;
	}


	public void setQuntity(double quntity) {
		this.quntity = quntity;
	}


	public LocalDate getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}


	public LocalDate getListingDate() {
		return listingDate;
	}


	public void setListingDate(LocalDate listingDate) {
		this.listingDate = listingDate;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	@Override
	public String toString() {
		return "Pen [penId=" + penId + ", brandtype=" + brandtype + ", color=" + color + ", inkColor=" + inkColor
				+ ", matType=" + matType + ", quntity=" + quntity + ", updateDate=" + updateDate + ", listingDate="
				+ listingDate + ", price=" + price + ", discount=" + discount + "]";
	}
	
	
	
	
}
