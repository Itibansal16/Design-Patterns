package service.impl;

import model.Currency;
import model.Product;
import service.PriceEvaluateService;

public class IndiaPriceEvaluatorServiceImpl implements PriceEvaluateService {
    private final double IND_TAX = 0.75;
    private final double DUTY_TAX = 1.0;
    private double DELIVERY_COST = 10;
    @Override
    public Double calculatePrice(Product product) {
        double price = product.getPrice() * DUTY_TAX;
        return (price + DELIVERY_COST + IND_TAX);
    }

    @Override
    public Currency getCurrency() {
        return Currency.RS;
    }
}
