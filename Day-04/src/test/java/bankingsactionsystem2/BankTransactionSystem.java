package bankingsactionsystem2;

import banktransactionsystem.*;

import banktransactionsystem.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testWithdraw_Successful() throws InsufficientBalanceException {
        BankAccount account = new BankAccount(1000);
        account.withdraw(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    void testWithdraw_InsufficientBalance() {
        BankAccount account = new BankAccount(300);
        Exception exception = assertThrows(InsufficientBalanceException.class, () -> account.withdraw(500));
        assertEquals("Insufficient balance!", exception.getMessage());
    }

    @Test
    void testWithdraw_InvalidAmount() {
        BankAccount account = new BankAccount(1000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100));
        assertEquals("Invalid amount!", exception.getMessage());
    }
}
