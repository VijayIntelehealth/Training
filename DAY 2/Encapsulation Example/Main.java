//Encapsulation: Making sure that the state of the object can be changed only through it's behaviours

public class Main {
    public static void main(String[] args) {

        //Array of Objects
        BankAccount [] bankAccounts = new BankAccount[4];

        bankAccounts[0] = new BankAccount(345, 340, "EE");
        bankAccounts[1] = new BankAccount(240, 1340, "AA");
        bankAccounts[2] = new BankAccount(110, 240, "DD");
        bankAccounts[3] = new BankAccount(190, 40, "BB");

        for(int i = 0; i < bankAccounts.length; i++) {
            bankAccounts[i].display();
        }

        int passes = bankAccounts.length - 1;
        int comps = bankAccounts.length - 1;

        for(int i = 0; i < passes; i++) {
            for(int j = 0; j < (comps - i); j++) {
                if(bankAccounts[j].getAccNo() > bankAccounts[j+1].getAccNo()) {
                    BankAccount temp = bankAccounts[j];
                    bankAccounts[j] = bankAccounts[j+1];
                    bankAccounts[j+1] = temp;
                }
            }
        }

        System.out.println();
        for(int i = 0; i < bankAccounts.length; i++) {
            bankAccounts[i].display();
        }



    }
}
