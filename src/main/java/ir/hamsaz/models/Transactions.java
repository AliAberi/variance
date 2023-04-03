package ir.hamsaz.models;

import java.util.*;

public class Transactions {

    List<Transaction> trs = new ArrayList<>();

    public Transactions(){}

    public void setTrs(List<Transaction> trs) {
        this.trs = trs;
    }

    public void addTrs(Transaction t){
        trs.add(t);
    }

    public void addTrs(String price,String trackingNumber){
        Transaction t = new Transaction(price,trackingNumber);
        trs.add(t);
    }

    public List<Transaction> getTrs() {
        return trs;
    }

    public String get_price(int i){
        Transaction t = trs.get(i);
        return t.getPrice();
    }

    public String get_traking_number(int i){
        Transaction t = trs.get(i);
        return t.getTrackingNumber();
    }

    public int get_trs_size(){
        return trs.size();
    }

    public boolean isEmpty(){
        return trs.isEmpty();
    }
}
