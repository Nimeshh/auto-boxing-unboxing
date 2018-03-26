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
// Also needs to add additional transactions for that customer/bank

// Bank:
// Add a new bank
// Add a customer to that bank with initial transaction
// Add a transaction for an existing customer for that bank
// Show a list of customers for a particular bank and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code

// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions


import java.util.ArrayList;

public class Bank {
    private String bank;
    ArrayList<Branches> myBranch;

    public Bank(String bank){
        this.bank = bank;
        this.myBranch = new ArrayList<Branches>();
    }

    public String getBank(){
        return this.bank;
    }

    public void printCustomers(){
        }

    public boolean addBranch(String branch){
        Branches newBranch = findBranch(branch);
        if(newBranch == null){
            myBranch.add(new Branches(branch));
            return true;
        }
        else{
            return false;
        }
    }

    public boolean addNewCustomer(String branch, String customer, double amount){
        Branches findBranch = findBranch(branch);
        if(findBranch != null){
            findBranch.addCustomers(customer, amount);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean addNewTransaction(String branch, String customer, double amount) {
        Branches findBranch = findBranch(branch);
        if(findBranch != null){
            findBranch.addTransaction(customer, amount);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean listCustomers(String name, boolean showTransaction){
        Branches branch = findBranch(name);
        if(branch != null){
            System.out.println("Customer details for "+branch.getName());

            ArrayList<Customers> branchCustomers = branch.getMyCustomer();
            //the code above provides the list of customers in the respective bank

            for(int i = 0; i<branchCustomers.size(); i++){
                Customers customer = branchCustomers.get(i);
                System.out.println("Customer "+ (i+1) +". "+customer.getName());

                if(showTransaction){

                    ArrayList<Double> doubleArrayList = customer.getTransactions();
                    for(int j = 0; j<doubleArrayList.size(); j++){
                        System.out.println((j+1)+". Amount: "+doubleArrayList.get(j));
                    }
                }
            }
        return true;

        }
        return false;
    }

    private Branches findBranch(String branch){
        for(int i = 0; i<myBranch.size(); i++){
            Branches newBranch = myBranch.get(i);
            if (newBranch.getName().equals(branch))
                return newBranch;
        }
        return null;
    }
}
