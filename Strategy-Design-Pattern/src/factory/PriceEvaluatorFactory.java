package factory;

import model.Cart;
import model.Region;
import service.PriceEvaluateService;

public interface PriceEvaluatorFactory {
    PriceEvaluateService getPriceEvaluatorService(Region region);
}
