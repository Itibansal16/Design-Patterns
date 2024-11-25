package waffle_dough;


public abstract class BaseWaffle {
    public String description = "Adding Base: ";
    public Double price = 0.0;

    public BaseWaffle() {
    }

    public BaseWaffle(String description, Double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
