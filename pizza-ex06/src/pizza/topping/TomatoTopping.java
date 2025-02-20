package pizza.topping;
public class TomatoTopping extends VeggieTopping {
    @Override
    public String toString() {
        return "Tomato Topping";
    }

    @Override
    public Double getPrice() {
        return 2.0;
    }
}
