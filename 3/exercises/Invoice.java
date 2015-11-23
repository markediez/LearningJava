/*
 * Author: Mark Diez
 * Date: 22 November 2015
 * Excercise 3.12
 * Invoice class for a hardware store
 */

public class Invoice {
	// Instance Variables
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	// Constructor
	public Invoice(String partNumber, String partDescription,
					int quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		if(quantity > 0)
			this.quantity = quantity;
		if(pricePerItem > 0)
			this.pricePerItem = pricePerItem;
	}

	// method to return total of invoice
	public double getInvoiceAmount() {
		return quantity * pricePerItem;
	}

	// Getters and Setters
	public String getPartNumber() {
		return partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public void setQuantity(int quantity) {
		if(quantity > 0)
			this.quantity = quantity;
	}

	public void setPricePerItem(double pricePerItem) {
		if(pricePerItem > 0)
			this.pricePerItem = pricePerItem;
	}
}