package factory;

import model.Cart;
import model.Region;
import service.PriceEvaluateService;
import service.impl.AmericaPriceEvaluatorServiceImpl;
import service.impl.IndiaPriceEvaluatorServiceImpl;

public class PriceEvaluatorFactoryImpl implements PriceEvaluatorFactory{
    @Override
    public PriceEvaluateService getPriceEvaluatorService(Region region) {
        if(region.equals(Region.IN))
            return new IndiaPriceEvaluatorServiceImpl();
        return new AmericaPriceEvaluatorServiceImpl();
    }
}
