package com.utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.app.exception.PenException;
import com.app.pen.Pen;

public class PenUtils {

  public  updateResult updateStockAndPrice(int Id,double newQuantity,Map<Integer,Pen> pen ) {
	  
	  if(pen.containsKey(Id)){
		  // return the pen details of particular id 
		  Pen pens = pen.get(Id);
		  double updateQuantity=pens.getQuntity()+newQuantity;
		  double updatePrice =pens.getPrice()*updateQuantity;
		  pens.setQuntity(updateQuantity);
		  pens.setPrice(updatePrice);
		  pens.setUpdateDate(LocalDate.now());
		  pen.put(Id, pens);
		  return new updateResult(updateQuantity,updatePrice);
		   
		   
	    }
	return null;
  }
	  public static void addDiscount(Map<Integer, Pen> pen){
		  LocalDate date = LocalDate.now();
		  for(Pen pen1 : pen.values()) {
			  int yeardiff = date.getYear()-pen1.getUpdateDate().getYear();
			  if(date.getMonthValue()-pen1.getUpdateDate().getMonthValue()+yeardiff*12>=3) {
				  pen1.setDiscount(20);
			  }
		  }
		  
	  }
	    
	public static void removePen(Map<Integer, Pen> pen){
		
	
		 Iterator<Map.Entry<Integer, Pen>> iterator = pen.entrySet().iterator();

	        while (iterator.hasNext()) {
	            Map.Entry<Integer, Pen> entry = iterator.next();
	            Pen pen1 = entry.getValue();
	        	LocalDate date = LocalDate.now();
		
			 int yeardiff = date.getYear()-pen1.getUpdateDate().getYear();
			 if(date.getMonthValue()-pen1.getUpdateDate().getMonthValue()+yeardiff*12>=9) {
				    iterator.remove();
			 }
		 }
		
	}  
	
	  
  }
	
	

