package pizza.crust;
public class ThinCrust extends PizzaCrust {
    @Override
    public String toString() {
        return "Thin Crust";
    }

    @Override
    public String toNiceString(){
        return super.toNiceString() + " $" + this.getPrice();
    }

    @Override
    protected String checkIntegrity() {
        return "";
    }

    @Override
    public void setIsDeepDish(boolean b) {
    }

    @Override
    protected boolean getIsDeepDish(boolean b) {
        return false;
    }

}