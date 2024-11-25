package service;

import model.Currency;
import model.Product;

public interface PriceEvaluateService {
    Double calculatePrice(Product product);
    Currency getCurrency();
}
