public class BankAccount {

    private int accNo;
    private int bal;
    private String name;

    //default constructor
    public BankAccount() {
        System.out.println("BankAccount()");
        accNo = 100;
        bal = 0;
        name = "Not Available";
    }

    //Parameterized constructor
    public BankAccount(int aNo, int amt, String n) {
        //validations
        accNo = aNo;
        bal = amt;
        name = n;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(int aNo, int amt, String n) {
        //validations
        accNo = aNo;
        bal = amt;
        name = n;
    }

    public void display() {
        System.out.println(accNo + " " + bal  +" " + name);
    }

    public boolean deposit(int amt) {
        if(amt <= 0) {
            return false;
        }

        bal = bal + amt;
        return true;
    }

    public int withDraw(int amt) {
        if(amt <= 0 || amt > bal) {
            return 0;
        }

        bal = bal - amt;
        return amt;
    }
}
