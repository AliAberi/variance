package ir.hamsaz.models;

public class Transaction {

    private int price;
    private int traking_number;

    public Transaction(){}


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTraking_number() {
        return traking_number;
    }

    public void setTraking_number(int traking_number) {
        this.traking_number = traking_number;
    }
}
