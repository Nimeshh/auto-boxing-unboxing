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
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions


public class Main {

    public static void main(String[] args){
        Bank bank = new Bank("NC");
        bank.addBranch("Durham");
        bank.addNewCustomer("Durham", "Nimesh", 500.00);
        bank.addNewTransaction("Durham", "Nimesh", 100.00);
        bank.listCustomers("Durham",true);

        bank.addBranch("Cary");
        bank.addNewCustomer("Cary", "Thapa", 700.00);
        bank.listCustomers("Cary", true);

    }
}
