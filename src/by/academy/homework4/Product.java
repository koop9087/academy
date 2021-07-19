package by.academy.homework4;

public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product() {
        super();
    }

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Product product = (Product) obj;
        return price == product.price
                && quantity == product.quantity
                && name != null ? name.equals(product.name) : name == null;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result += result * prime + price;
        result += result * prime + quantity;
        result += result * prime + (name == null ? 0 : name.hashCode());
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("name :").append(name).append("/");
        sb.append(", price :").append(price);
        sb.append(", quantity :").append(quantity);
        return sb.toString();
    }
}

