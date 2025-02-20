package pizza;
import java.util.Scanner;

import pizza.crust.ThickCrust;
import pizza.crust.ThinCrust;
import pizza.sauce.AlfredoSauce;
import pizza.sauce.MarinaraSauce;
import pizza.topping.BeefTopping;
import pizza.topping.BrisketTopping;
import pizza.topping.CheddarTopping;
import pizza.topping.ChickenTopping;
import pizza.topping.MozzarellaTopping;
import pizza.topping.MushroomTopping;
import pizza.topping.ParmesanTopping;
import pizza.topping.PepperTopping;
import pizza.topping.PizzaTopping;
import pizza.topping.RicottaTopping;
import pizza.topping.SausageTopping;
import pizza.topping.SpinachTopping;
import pizza.topping.TomatoTopping;

public class PizzaMain {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Pizza pizza = new Pizza();
        Integer crustChoice;
        Integer sauceChoice;
        Integer toppingChoice;
        Integer numToppings;
        Integer ingrediantChoice;
        String deepDishChoice;

        System.out.println("What kind of crust would you like:\n(1) Thin Crust\n(2) Thick Crust\nPlease Enter Corresponding Number: ");
        crustChoice = myScanner.nextInt();
        if (crustChoice == 1){
            pizza.addCrust(new ThinCrust());
        } else if (crustChoice == 2) {
            pizza.addCrust(new ThickCrust());
            System.out.println("Deep dish: Y/N");
            deepDishChoice = myScanner.next().trim();
            if (deepDishChoice.equals("y") || deepDishChoice.equals("Y")){
                pizza.crust.setIsDeepDish(true);
            } else {
                pizza.crust.setIsDeepDish(false);
            }
        }

        System.out.println("What ingrediant of crust would you like:\n(1) Flour\n(2) Cauliflower\nPlease Enter Corresponding Number: ");
        ingrediantChoice = myScanner.nextInt();
        if (ingrediantChoice == 1){
            pizza.crust.setCrustType("Flour");
        } else if (ingrediantChoice == 2) {
            pizza.crust.setCrustType("Cauliflower");
        }

        System.out.println("What kind of sauce would you like:\n(1) Marinara Sauce\n(2) Alfredo Sauce\nPlease Enter Corresponding Number: ");
        sauceChoice = myScanner.nextInt();
        if (sauceChoice == 1){
            pizza.addSauce(new MarinaraSauce());
        } else if (sauceChoice == 2) {
            pizza.addSauce(new AlfredoSauce());
        }

        System.out.println("How many toppings would you like: ");
        numToppings = myScanner.nextInt();

        for (Integer i = 0; i < numToppings; i++){
            System.out.println( "What kind of toppings would you like:\n(1) Mozzarella Topping\n(2) Ricotta Topping\n" +  
                                "(3) Parmesan Topping\n(4) Cheddar Topping\n" +
                                "(5) Beef Topping\n(6) Chicken Topping\n" +
                                "(7) Brisket Topping\n(8) Sausage Topping\n" +
                                "(9) Mushroom Topping\n(10) Pepper Topping\n" +
                                "(11) Spinach Topping\n(12) Tomato Topping\n" +
                                "Please Enter Corresponding Number: ");
            toppingChoice = myScanner.nextInt();
            if (toppingChoice == 1){
                pizza.addTopping(new MozzarellaTopping());
            } else if (toppingChoice == 2) {
                pizza.addTopping(new RicottaTopping());
            } else if (toppingChoice == 3) {
                pizza.addTopping(new ParmesanTopping());
            } else if (toppingChoice == 4) {
                pizza.addTopping(new CheddarTopping());
            } else if (toppingChoice == 5) {
                pizza.addTopping(new BeefTopping());
            } else if (toppingChoice == 6) {
                pizza.addTopping(new ChickenTopping());
            } else if (toppingChoice == 7) {
                pizza.addTopping(new BrisketTopping());
            } else if (toppingChoice == 8) {
                pizza.addTopping(new SausageTopping());
            } else if (toppingChoice == 9) {
                pizza.addTopping(new MushroomTopping());
            } else if (toppingChoice == 10) {
                pizza.addTopping(new PepperTopping());
            } else if (toppingChoice == 11) {
                pizza.addTopping(new SpinachTopping());
            } else if (toppingChoice == 12) {
                pizza.addTopping(new TomatoTopping());
            }
        }

        System.out.println("Your choice: " + pizza.crust.toNiceString() + "\n" + pizza.sauce.toNiceString());
        for (PizzaTopping topping : pizza.toppings) {
            System.out.println(topping.toNiceString());
        }
        System.out.println("Total Cost: $" + pizza.getPrice());

        myScanner.close();
        
    }
}
