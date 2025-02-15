package junit.adavancedproblem.bankingtransactions;



import static org.junit.jupiter.api.Assertions.*;

import junit.adancedproblem.bankingtransactions.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount();
    }

    @Test
    public void testDeposit() {
        account.deposit(500);
        assertEquals(500, account.getBalance(), "Balance should be 500 after deposit.");
    }

    @Test
    public void testWithdrawSuccessful() {
        account.deposit(1000);
        assertTrue(account.withdraw(500), "Withdrawal should succeed with sufficient funds.");
        assertEquals(500, account.getBalance(), "Balance should be 500 after withdrawal.");
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        account.deposit(500);
        assertFalse(account.withdraw(600), "Withdrawal should fail when funds are insufficient.");
        assertEquals(500, account.getBalance(), "Balance should remain 500 after failed withdrawal.");
    }

    @Test
    public void testWithdrawNegativeAmount() {
        account.deposit(500);
        assertFalse(account.withdraw(-100), "Withdrawal should fail for negative amounts.");
        assertEquals(500, account.getBalance(), "Balance should remain 500 after invalid withdrawal attempt.");
    }

    @Test
    public void testInitialBalance() {
        assertEquals(0, account.getBalance(), "Initial balance should be 0.");
    }
}