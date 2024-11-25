package waffle_dough.impl;

import waffle_dough.BaseWaffle;

public class NormalWaffle extends BaseWaffle {
    public NormalWaffle() {
        this.setPrice(100.0);
        this.setDescription("Normal waffle dough;");
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
