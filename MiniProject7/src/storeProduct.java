public class storeProduct {
	public String itemName;
	public String itemDescription;
	public double price;
	public int numberInStock;
	public boolean isFragile;
	
	public storeProduct(String s, double p) {
		itemName=s;
		price=p;
		itemDescription="";
		numberInStock=1000;
		isFragile=false;
	}
	public void setDescription(String d) {
		itemDescription=d;
	}
	public void setIsFragile(boolean b) {
		isFragile=b;
	}
	public void setStock(int x) {
		numberInStock=x;
	}
	public double calculateTotalPrice(int quantity) {
		double totPrice=price*quantity;
		if(quantity>=20&&quantity<100) {
			totPrice+=10;
		}
		if(quantity>=100) {
			totPrice+=25;
		}
		if(isFragile==true) {
			totPrice= totPrice+(1.25*quantity);
		}
		if(quantity>numberInStock) {
			return 0;
		}else {
			return totPrice;
		}
	}
	public int theStock() {
		return numberInStock;
	}
}