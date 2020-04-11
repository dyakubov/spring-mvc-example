package ru.geekbrains.persist;

import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


@Repository
public class ProductRepository {

    private AtomicInteger id = new AtomicInteger(0);

    public ProductRepository() {

    }

    private final Map<Integer, Product> products = new HashMap<>();

    private Map<Integer, Product> searchResults = new HashMap<>();

    public void insert (Product product){
        products.put(id.incrementAndGet(), product);
    }

    public Map<Integer, Product> getAllProducts(){
        return Collections.unmodifiableMap(products);
    }

    public Map<Integer, Product> getProductById(int id){
        searchResults.put(id, products.get(id));
        return searchResults;
    }
}
