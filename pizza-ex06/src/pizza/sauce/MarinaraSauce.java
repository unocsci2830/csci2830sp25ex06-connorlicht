package pizza.sauce;
public class MarinaraSauce extends PizzaSauce {
    @Override
    public String toString() {
        return "Marinara Sauce";
    }

    @Override
    public Double getPrice() {
        return 3.0;
    }
}