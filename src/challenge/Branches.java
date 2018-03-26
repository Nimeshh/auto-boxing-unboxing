package challenge;

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
