package by.academy.homework4.deal;

public class Burger extends Product {
    private String type;
    private double weight;

    public Burger(String type, double weight, String name, double price, int quantity) {
        super();
        this.type = type;
        this.weight = weight;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double discount(){
        double result = 0;
        if(weight > 1) {
            result = 0.20;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Burger burger = (Burger) o;

        if (Double.compare(burger.weight, weight) != 0) return false;
        return type != null ? type.equals(burger.type) : burger.type == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}