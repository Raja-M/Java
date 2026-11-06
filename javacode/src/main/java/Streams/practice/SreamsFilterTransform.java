package Streams.practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

record Product( String name, String category, double price, boolean isAvailable){}


public class SreamsFilterTransform  {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Laptop", "Electronics", 1200.0, true),
                new Product("Smartphone", "Electronics", 800.0, false),
                new Product("Headphones", "Electronics", 150.0, true),
                new Product("Refrigerator", "Appliances", 1000.0, true),
                new Product("Microwave", "Appliances", 200.0, false),
                new Product( "Java Book", "Books", 30.0, true),
                new Product( "Coffee Mug", "Home", 25.0, false)

        );

        List<String> availableElectronics = products.stream().filter(p -> p.category().equals("Electronics") && p.isAvailable())
                .map(p -> p.name().toUpperCase())
                .collect(Collectors.toList());
              //  .toList();
        availableElectronics.forEach(System.out::println);

        double SumOfAvailableElectronics =   products.stream().filter(p -> p.isAvailable()).mapToDouble (p -> p.price()).sum();
        System.out.println("Sum of available electronics: " + SumOfAvailableElectronics);

        String MostExpensiveProduct = products.stream().max( (p1,p2) -> Double.compare(p1.price(), p2.price())).map(p -> p.name().toUpperCase()).orElse("No products");
        System.out.println("Most expensive product: " + MostExpensiveProduct);

        /* Use a single stream pipeline with Collectors.summarizingDouble() to print out the count, sum, minimum, average, and maximum price of all products at the same time */

        var summary = products.stream().collect(Collectors.groupingBy( Product::category, Collectors.maxBy(Comparator.comparing(Product::price)) ));
        System.out.println("Most expensive product by category: " + summary);


        var summary2 = products.stream().collect(Collectors.summarizingDouble(Product::price));
        System.out.println("Product price summary: " + summary2);

        var categoryProductNames = products.stream().collect(Collectors.groupingBy(Product::category, Collectors.mapping(Product::name,  Collectors.collectingAndThen( Collectors.toList(), list -> { Collections.sort(list); return list; } ))));
        System.out.println("Products grouped by category: " + categoryProductNames);

        var maxPriceJump = IntStream.range(0, products.size() - 1)
                .mapToDouble(i -> {
                            double price1 = products.get(i).price();
                            double price2 = products.get(i + 1).price();
                            return Math.abs(price2 - price1);
                        }
                        )
                .max()
                .orElse(0.0);
        System.out.println("Maximum price jump: " + maxPriceJump);
    }
}