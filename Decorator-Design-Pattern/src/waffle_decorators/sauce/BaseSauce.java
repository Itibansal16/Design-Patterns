package waffle_decorators.sauce;

import waffle_decorators.BaseDecorator;
import waffle_dough.BaseWaffle;

public abstract class BaseSauce extends BaseDecorator {
    BaseWaffle baseWaffle;

    public BaseSauce(BaseWaffle baseWaffle) {
        this.baseWaffle = baseWaffle;
        this.setDescription(baseWaffle.getDescription() + " Adding Sauce: ");
    }
    public String getDescription() {
        return this.description;
    }

    public Double getPrice() {
        return this.price;
    }
}
