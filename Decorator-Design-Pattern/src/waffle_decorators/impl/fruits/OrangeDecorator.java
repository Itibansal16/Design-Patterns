package waffle_decorators.impl.fruits;

import waffle_dough.BaseWaffle;

public class OrangeDecorator extends BaseFruitDecorator{
    public OrangeDecorator(BaseWaffle baseWaffle) {
        super(baseWaffle);
        this.setDescription(this.description + "Orange added;");
        this.setPrice(baseWaffle.getPrice() + 40.0);
    }
}
