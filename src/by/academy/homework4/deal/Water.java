package by.academy.homework4.deal;

public class Water extends Product{
    private String type;
    private double weight;

    public Water() {
        super();
    }

    public Water(String name, double price, int quantity, String type, double weight) {
        super(name, price, quantity);
        this.type = type;
        this.weight = weight;
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
        if(weight > 0.2) {
            result = 0.30;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Water water = (Water) o;

        if (Double.compare(water.weight, weight) != 0) return false;
        return type != null ? type.equals(water.type) : water.type == null;
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
        final StringBuilder sb = new StringBuilder("Water{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append(", type='").append(type).append('\'');
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
