package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class AppComparator {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> prodList = new ArrayList<>();

		prodList.add(new Product("TV", 900.0));
		prodList.add(new Product("Notebook", 1200.00));
		prodList.add(new Product("Tablet", 450.0));

		for (Product p : prodList) {
			System.out.println(p);
		}

		System.out.println("------------");

		// Comparator<Product> comp = (o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
		// This would also work;

				
		/*
		 * Comparator<Product> comp = new Comparator<Product>() {
		 * 
		 * @Override public int compare(Product o1, Product o2) {
		 * 
		 * return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase()); 
		 * } 
		 * };	 * This would also work, with no lambda expression;
		 */

		/*
		 * prodList.sort(new MyComparator()); 
		 * 
		 * This would also work, Assim também funcionaria (creating a class to implement
		 * the interface and then using it;
		 */

		prodList.sort( (o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase()) );

		for (Product p : prodList) {
			System.out.println(p);
		}
	}

}
