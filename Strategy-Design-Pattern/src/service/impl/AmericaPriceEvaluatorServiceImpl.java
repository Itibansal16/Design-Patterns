package service.impl;

import model.Currency;
import model.Product;
import model.ProductSize;
import service.PriceEvaluateService;

public class AmericaPriceEvaluatorServiceImpl implements PriceEvaluateService {
    private final double USD_TAX = 0.75;
    private final double DUTY_TAX = 1.0;
    private double DELIVERY_COST = 15;
    @Override
    public Double calculatePrice(Product product) {
        double price = product.getPrice() * DUTY_TAX;
        return (price + DELIVERY_COST + USD_TAX);

    }

    @Override
    public Currency getCurrency() {
        return Currency.DOLLARS;
    }
}
