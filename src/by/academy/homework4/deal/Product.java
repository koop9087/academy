package by.academy.homework4.deal;

public abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product() {
        super();
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double calcPrice() {
        return (1 - discount() * price * quantity);
    }

    protected abstract double discount();


    public String getType() {
        return name;
    }

    public void setType(String type) {
        this.name = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        if (quantity != product.quantity) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) price;
        result = 31 * result + quantity;
        return result;
    }

    @Override
    public String toString() {
        return "lesson5.deal.Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}