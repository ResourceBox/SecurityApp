package ru.security.domain.model;

/**
 * Created by d.mashkov on 31.08.2015.
 */
public class Book {

    private String name;
    private Long price;

    public Book(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
