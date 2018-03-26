package challenge;

import java.util.ArrayList;

public class Customers {
    private String name;
    private double amount;
    ArrayList<Double> transactions;

    public Customers(String name, double amount){
        this.name = name;
        this.transactions = new ArrayList<Double>();
        //this.amount = amount;
        addTransaction(amount);
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double amount){
        //this.transactions.add(Double.valueOf(amount));
        this.transactions.add(amount);
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
