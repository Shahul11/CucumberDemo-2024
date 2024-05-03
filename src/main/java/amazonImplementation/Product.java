package amazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	String productName;
	int price;

	public Product(String prdName, int pri) {
		this.productName=prdName;
		this.price=pri;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<String> getProductList() {
		List<String> productList = new ArrayList<>();
		productList.add("Apple Macbook Pro");
		productList.add("Apple Macbook Air");
		productList.add("Apple iPhone 16");
		productList.add("iPhone");

		return productList;

	}

}
