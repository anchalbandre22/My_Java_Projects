package com.utils;

public class updateResult {
	
	
	    private double quantity;
	    private double price;

	    public updateResult(double quantity, double price) {
	        this.quantity = quantity;
	        this.price = price;
	    }

	    public double getQuantity() {
	        return quantity;
	    }

	    public double getPrice() {
	        return price;
	    }

	    @Override
	    public String toString() {
	        return "UpdateResult{" +
	                "quantity=" + quantity +
	                ", price=" + price +
	                '}';
	    }

}
