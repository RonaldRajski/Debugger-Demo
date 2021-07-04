package academy.learnProgramming.BankAccount;

import static junit.framework.TestCase.assertEquals;

public class BankAccountTest {
    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @org.junit.Before
    public void setup(){
        account = new BankAccount("Joey", "Ski", 100.00, BankAccount.CHECKING);
        System.out.println("Running a test");
    }

    @org.junit.Test
    public void deposit() throws Exception{
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.Test
    public void withdraw_branch() throws Exception{
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception{
        double balance = account.withdraw(600.00, false);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test
    public void getBalamce_deposit() throws Exception{
        account.deposit(200.00, true);
        assertEquals(1200, account.getBalance(), 0);
    }

    @org.junit.Test
    v















}
