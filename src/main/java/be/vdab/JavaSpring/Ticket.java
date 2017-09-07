package be.vdab.JavaSpring;

public class Ticket {

    private Integer id;
    private double price;

    public Ticket(double price) {
        this.price = price;
    }

    public Ticket() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
