package pizza.topping;
public class RicottaTopping extends CheeseTopping {
    @Override
    public String toString() {
        return "Ricotta Topping";
    }

    @Override
    public Double getPrice() {
        return 3.0;
    }
}
