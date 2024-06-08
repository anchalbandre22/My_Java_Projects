package com.utils;

import java.time.LocalDate;

import com.app.pen.BrandType;
import com.app.pen.MaterialType;
import com.app.pen.Pen;

public class PenValidations {
	
	public static Pen validateInputs(int id ,  String  brandtype, String color, String inkColor, String matType, double qauntity,
			String updateDate,  String listingDate, double price, double discount) {
     	LocalDate updatedate = parseDate(updateDate);
     	LocalDate listingdate = parseDate(listingDate);
     	BrandType btype = brandParsing(brandtype);
     	MaterialType mtype = materialParsing(matType);
		
		
		return new Pen(id , btype,color,inkColor, mtype,qauntity,updatedate,listingdate,price,discount);
		
	}
	
	
  public static LocalDate parseDate(String date) {
	  
	return LocalDate.parse(date);
	  
  }	
  
  public static  BrandType  brandParsing(String brand) {
	return BrandType.valueOf(brand.toUpperCase());
	 
  }
  
  public static  MaterialType  materialParsing(String material) {
		return MaterialType.valueOf(material.toUpperCase());
		 
	  }

}
