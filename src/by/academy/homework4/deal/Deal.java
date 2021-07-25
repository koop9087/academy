package by.academy.homework4.deal;

import java.util.Arrays;
import java.util.Date;

public class Deal {
    private Product product[];
    private User seller;
    private User buyer;
    private Date dealDate;

    public Deal(Product product[], User user, User buyer, Date dealDate) {
        this.product = product;
        this.seller = user;
        this.buyer = buyer;
        this.dealDate = dealDate;
    }

    public double calcFullPrice(Product product[]) {
        double result = 0;
        for (int i = 0; i < product.length; i++) {
            if (product[i] != null) {
                result += product[i].calcPrice();
            }
        }
        return result;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Date getDealDate() {
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    public Deal() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deal deal = (Deal) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(product, deal.product)) return false;
        if (seller != null ? !seller.equals(deal.seller) : deal.seller != null) return false;
        if (buyer != null ? !buyer.equals(deal.buyer) : deal.buyer != null) return false;
        return dealDate != null ? dealDate.equals(deal.dealDate) : deal.dealDate == null;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(product);
        result = 31 * result + (seller != null ? seller.hashCode() : 0);
        result = 31 * result + (buyer != null ? buyer.hashCode() : 0);
        result = 31 * result + (dealDate != null ? dealDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "lesson5.deal.Deal{" +
                "product=" + Arrays.toString(product) +
                ", seller=" + seller +
                ", buyer=" + buyer +
                ", dealDate=" + dealDate +
                '}';
    }
}