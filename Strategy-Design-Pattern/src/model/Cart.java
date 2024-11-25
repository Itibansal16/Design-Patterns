package model;

import factory.PriceEvaluatorFactory;
import factory.PriceEvaluatorFactoryImpl;
import service.PriceEvaluateService;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> productList;
    Region region;
    PriceEvaluateService priceEvaluateService;

    public Cart(Region region) {
        this.productList = new ArrayList<>();
        PriceEvaluatorFactory priceEvaluatorFactory = new PriceEvaluatorFactoryImpl();
        this.region = region;
        this.priceEvaluateService = priceEvaluatorFactory.getPriceEvaluatorService(region);
    }

    private Double getTotalPrice() {
        return this.productList.stream().map(product -> priceEvaluateService.calculatePrice(product)).mapToDouble(Double::doubleValue).sum();
    }
    public String getCost() {
        Double price = getTotalPrice();
        Currency currency = priceEvaluateService.getCurrency();
        return price + " " + currency;
    }
    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }


}
