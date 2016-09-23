
public class Book {

	private String title, author, description,SKU;
	
	private double price;
	private boolean isInStock;
	
	Book(){
		isInStock = true;
	}
	Book(double price){
		this.price=price;
		isInStock = true;
	}
	
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isInStock() {
		return isInStock;
	}
	public void setInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}
	public double getPrice(int n){
		double p=0;
		int count = 0;
		while(isInStock&&count<n){
			p+=price;
			count++;
		}
		return p;
	}
	public String getDisplayText(){
		return ("Author: "+ author +"\nTitle: "+ title+"\nDescription: "+ description);
	}
	
	
	
}
