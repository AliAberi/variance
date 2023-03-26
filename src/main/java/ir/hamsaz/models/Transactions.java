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

    public List<Transaction> getTrs() {
        return trs;
    }
}
