package pizza.crust;
public class ThickCrust extends PizzaCrust {
    private boolean isDeepDish;
    @Override
    public String toString() {
        return "Thick Crust";
    }
    public String toNiceString(){
        return super.toNiceString() + (this.isDeepDish == true ? "(Deep Dish)" : "") + " $" + this.getPrice() + checkIntegrity();
    }

    @Override
    public void setIsDeepDish(boolean b) {
        this.isDeepDish = b;
    }
    @Override
    protected boolean getIsDeepDish(boolean b) {
        return this.isDeepDish;
    }
    @Override
    protected String checkIntegrity() {
        if (this.crustType == "Cauliflower"){
            return "\nWarning: this pizza crust may fall apart.";
        }else {
            return "";
        }
    }
    
}