package challenge;

// You job is to create a simple banking application.

// There should be a Bank class
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

// Demonstration autoboxing and unboxing in your code.
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

import java.util.ArrayList;

public class Branches {
    private String name;
    ArrayList<Customers> myCustomer;

    public Branches(String name) {
        this.name = name;
        this.myCustomer = new ArrayList<Customers>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customers> getMyCustomer() {
        return myCustomer;
    }

    public boolean addCustomers(String name, double amount){
        if (findIt(name) == null){
            Customers newCustomer = new Customers(name, amount);
            myCustomer.add(newCustomer);
            //myCustomer.add(new Customers(name, amount));
            return true;

        }
        return false;
    }

    public boolean addTransaction(String name, double newAmount) {
        Customers customers = findIt(name);
        if(customers != null){
            customers.addTransaction(newAmount);
            return true;
        }
        return false;
    }

    private Customers findIt(String customer){
        for (int i = 0; i<myCustomer.size(); i++){
            Customers myCust = this.myCustomer.get(i);
            if(myCust.getName().equals(customer)){
                return myCust;
            }
        }
        return null;
    }

    private int findIt(Customers customer){
        int pos = myCustomer.indexOf(customer);
        return pos;
    }
}
