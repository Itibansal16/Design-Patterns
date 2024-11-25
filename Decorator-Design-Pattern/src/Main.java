import waffle_decorators.impl.fruits.KiwiDecorator;
import waffle_decorators.impl.fruits.OrangeDecorator;
import waffle_decorators.sauce.CaramelSauce;
import waffle_decorators.sauce.ChocolateSauce;
import waffle_dough.BaseWaffle;
import waffle_dough.impl.GlutenFreeWaffle;
import waffle_dough.impl.NormalWaffle;

public class Main {
    public static void main(String[] args) {

        BaseWaffle waffle1 = new GlutenFreeWaffle();
        waffle1 = new OrangeDecorator(waffle1);
        waffle1 = new CaramelSauce(waffle1);
        System.out.println(waffle1.getDescription() + " with price: " + waffle1.getPrice());

        BaseWaffle waffle2 = new GlutenFreeWaffle();
        waffle2 = new OrangeDecorator(waffle2);
        waffle2 = new CaramelSauce(waffle2);
        waffle2 = new OrangeDecorator(waffle2);
        System.out.println(waffle2.getDescription() + " with price: " + waffle2.getPrice());

    }
}