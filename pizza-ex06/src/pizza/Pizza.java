package pizza;
import java.util.ArrayList;

import pizza.crust.PizzaCrust;
import pizza.sauce.PizzaSauce;
import pizza.topping.PizzaTopping;

public class Pizza implements MenuItem{
    PizzaSauce sauce;
    PizzaCrust crust;
    ArrayList<PizzaTopping> toppings = new ArrayList<>();
    ArrayList<MenuItem> prices = new ArrayList<>();

    public void addTopping(PizzaTopping inputTopping){
        this.toppings.add(inputTopping);
        this.prices.add(inputTopping);
    }

    public void addSauce(PizzaSauce inputSauce){
        this.sauce = inputSauce;
        this.prices.add(inputSauce);
    }

    public void addCrust(PizzaCrust inputCrust){
        this.crust = inputCrust;
        this.prices.add(inputCrust);
    }

    @Override
    public Double getPrice(){
        Double totalPrice = 0.0;

        for (MenuItem m : this.prices){
            totalPrice += m.getPrice();
        }

        return totalPrice;
    }
}
