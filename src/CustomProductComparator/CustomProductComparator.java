package CustomProductComparator;

import java.util.Comparator;

public class CustomProductComparator  implements Comparator<Product>{

    @Override
    public int compare(Product product1, Product product2) {
        
        int categoryCompare = product1.getCategoryName().compareTo(product2.getCategoryName());
        if (categoryCompare != 0) {
            return categoryCompare;
        }

        
        int priceCompare = Double.compare(product1.getPrice(), product2.getPrice());
        if (priceCompare != 0) {
            return priceCompare;
        }

        
        return product1.getProductName().compareTo(product2.getProductName());
    }

}
