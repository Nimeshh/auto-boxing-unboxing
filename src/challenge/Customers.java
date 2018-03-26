package challenge;

// You job is to create a simple banking application.
// There should be a Bank class.
// It should have an arrayList of Branches.
// Each Branch should have an arrayList of Customers.
// The Customer class should have an arrayList of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

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
