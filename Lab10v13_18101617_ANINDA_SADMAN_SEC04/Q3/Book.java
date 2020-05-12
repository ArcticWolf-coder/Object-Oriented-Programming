package Q3;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString(){
        return "'"+getName()+"' by "+this.author;
    }

}
