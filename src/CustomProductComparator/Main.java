package CustomProductComparator;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
        products.add(new DefaultProduct(1, "Laptop", "Electronics", 75000));
        products.add(new DefaultProduct(2, "Headphones", "Electronics", 2500));
        products.add(new DefaultProduct(3, "Apple", "Grocery", 120));
        products.add(new DefaultProduct(4, "Banana", "Grocery", 60));
        products.add(new DefaultProduct(5, "Smartwatch", "Electronics", 2500));

        System.out.println("Before sorting:");
        products.forEach(System.out::println);

        products.sort(new CustomProductComparator());

        System.out.println("\nAfter sorting:");
        products.forEach(System.out::println);

	}

}
