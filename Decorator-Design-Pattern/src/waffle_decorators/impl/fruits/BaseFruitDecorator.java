package waffle_decorators.impl.fruits;

import waffle_decorators.BaseDecorator;
import waffle_dough.BaseWaffle;

public abstract class BaseFruitDecorator extends BaseDecorator {
    BaseWaffle baseWaffle;

    public BaseFruitDecorator(BaseWaffle baseWaffle) {
        this.baseWaffle = baseWaffle;
        this.setDescription(baseWaffle.getDescription() + " adding fruits: ");
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
