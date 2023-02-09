package first.workshop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;
 

public class MainFuncional {
	
	public static void main(String[] args) {
		
		// First WorkShop
		
		List<Integer> numbers= List.of(18,6,4,15,55,78,12,9,8);
		Long count=numbers.stream().filter(num->num>10).count();
		System.out.println(count);
		
		// Second Workshoo
		
		List<Product> shopping = List.of(
                new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
                new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
                new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
                new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
                new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
                new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));
		
	
		BigDecimal amount = shopping.stream()
                .map(x -> x.price.add(x.price.multiply(new BigDecimal(x.tax.percent)).divide(new BigDecimal(100))))
                .reduce(BigDecimal.ZERO, (x, y) -> x.add(y)).setScale(2, RoundingMode.CEILING);
		
        System.out.println("Total amount with taxes: " + amount + " €");
        
        String productsStartsWithC = shopping.stream()
            .filter(x -> x.name.startsWith("C"))
            .sorted((x,y) -> x.name.compareToIgnoreCase(y.name))
            .map(x -> x.name)
            .collect(Collectors.joining(", ", "Products starts with C are ", "."));
        System.out.println(productsStartsWithC);
		
		
}
}
