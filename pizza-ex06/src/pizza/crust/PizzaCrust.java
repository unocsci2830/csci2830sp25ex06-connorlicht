package pizza.crust;

import pizza.MenuItem;

public abstract class PizzaCrust implements MenuItem {
    protected String crustType;
    public abstract String toString();

    public String toNiceString() {
        return "Crust: " + this.toString() + " (" + this.crustType + ")";
    }

    protected abstract String checkIntegrity();

    public void setCrustType(String inputCrustType){
        this.crustType = inputCrustType;
    }

    public String getCrustType(){
        return this.crustType;
    }

    public Double getPrice() {
        return 8.0;
    }

    public abstract void setIsDeepDish(boolean b);
    protected abstract boolean getIsDeepDish(boolean b);
}