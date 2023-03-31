package ir.hamsaz.models;

public class Transaction {

    private String price;
    private String trackingNumber;

    public Transaction(String price,String traking_number){
        this.price = price;
        this.trackingNumber = traking_number;
    }


    public String getPrice() {
        return price;
    }



    public void setPrice(String price) {
        this.price = price;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}
