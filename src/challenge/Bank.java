package challenge;

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
