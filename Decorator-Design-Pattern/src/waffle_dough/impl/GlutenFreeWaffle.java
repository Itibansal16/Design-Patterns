package waffle_dough.impl;

import waffle_dough.BaseWaffle;

public class GlutenFreeWaffle extends BaseWaffle {
    public GlutenFreeWaffle() {
        this.setPrice(200.0);
        this.setDescription("Gluten free waffle dough;");
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
