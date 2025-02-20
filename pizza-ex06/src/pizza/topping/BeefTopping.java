package pizza.topping;
public class BeefTopping extends MeatTopping {
    @Override
    public String toString() {
        return "Beef Topping";
    }

    @Override
    public Double getPrice() {
        return 1.0;
    }
}
