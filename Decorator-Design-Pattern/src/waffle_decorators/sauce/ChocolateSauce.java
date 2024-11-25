package waffle_decorators.sauce;

import waffle_dough.BaseWaffle;

public class ChocolateSauce extends BaseSauce{
    public ChocolateSauce(BaseWaffle baseWaffle) {
        super(baseWaffle);
        this.setDescription(this.getDescription() + " Chocolate sauce added;");
        this.setPrice(baseWaffle.getPrice() + 30.0);
    }
}
