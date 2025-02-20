package pizza.topping;
public class BrisketTopping extends MeatTopping {
    @Override
    public String toString() {
        return "Brisket Topping";
    }

    @Override
    public Double getPrice() {
        return 3.0;
    }
}
