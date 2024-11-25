package model;

public class Product {
    private Double price;
    private String id;
    private String name;
    private ProductSize size;

    public Product(Double price, String id, String name, ProductSize size) {
        this.price = price;
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductSize getSize() {
        return size;
    }

    public void setSize(ProductSize size) {
        this.size = size;
    }
}
