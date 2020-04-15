package com.modernjava.training;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {
        Product product = fetchProductById(1).orElseThrow();

        int discount = getDiscount();
        System.out.println(discount);

        List<Integer> integerList = List.of(1, 5, 6, 3, 26, 3, 65, 34, 35);
        System.out.println(max(integerList));

        Set<Integer> integerSet = Set.copyOf(integerList);
        integerSet.forEach(System.out::println);

        print("product");
    }

    private static int getDiscount() {
        DayOfWeek dayOfWeek = DayOfWeek.from(LocalDate.now());
        return switch (dayOfWeek) {
            case MONDAY -> 30;
            case TUESDAY -> 25;
            case WEDNESDAY -> 20;
            case THURSDAY -> 15;
            case FRIDAY -> 10;
            default -> 5;
        };
    }

    private static List<Product> createProducts() {
        List<Product> products = new ArrayList<>();
        for (var i = 0; i < 5; i++) {
            var name = "Product " + i;
            Product product = new Product(i, name);
            products.add(product);
        }
        return products;
    }

    private static Optional<Product> fetchProductById(int id) {
        List<Product> products = createProducts();
        return products.stream()
                .filter(e -> e.id() == id)
                .findFirst();
    }

    private static int max(List<Integer> integers) {
        return integers.stream()
                .mapToInt(v -> v)
                .max()
                .orElseThrow();
    }

    private static void print(Object obj){
        if(obj instanceof String s){
            System.out.println(s.toUpperCase());
        } else if(obj instanceof Integer i){
            System.out.println("# is " + i);
        }
    }
}
