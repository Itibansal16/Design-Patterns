package waffle_decorators.impl.fruits;

import waffle_decorators.BaseDecorator;
import waffle_dough.BaseWaffle;

public class KiwiDecorator extends BaseFruitDecorator {
    public KiwiDecorator(BaseWaffle baseWaffle) {
        super(baseWaffle);
        this.setPrice(baseWaffle.getPrice() + 50.0);
        this.setDescription(this.getDescription() + " Kiwi added;");
    }
}
