package waffle_decorators.sauce;

import waffle_dough.BaseWaffle;

public class CaramelSauce extends BaseSauce{
    public CaramelSauce(BaseWaffle baseWaffle) {
        super(baseWaffle);
        this.setDescription(this.getDescription() + " Caramel added;");
        this.setPrice(baseWaffle.getPrice() + 25.0);
    }
}
