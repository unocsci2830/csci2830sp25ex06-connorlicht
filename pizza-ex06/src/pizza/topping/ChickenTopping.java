package pizza.topping;
public class ChickenTopping extends MeatTopping {
    @Override
    public String toString() {
        return "Chicken Topping";
    }

    @Override
    public Double getPrice() {
        return 2.0;
    }
}