package challenge;

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
