package academy.learnProgramming.BankAccount;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVING = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int typeOfAccount){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeOfAccount;
    }
}
