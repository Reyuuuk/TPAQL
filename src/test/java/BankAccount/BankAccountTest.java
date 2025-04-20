package BankAccount;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.example.TP0.BankAccount;

class BankAccountTest {
    protected BankAccount account;
    private BankAccount otherAccount;
    private static final double INITIAL_BALANCE = 1000.0;
    private static final double INTEREST_RATE = 0.05; // 5%

    @BeforeEach
    void setUp() {
        account = new BankAccount(INITIAL_BALANCE, INTEREST_RATE);
        otherAccount = new BankAccount(500.0, 0.03);
    }

    // Tests pour deposit()
    @Test
    @DisplayName("Dépôt d'un montant positif augmente le solde")
    void depositPositiveAmount() {
        account.deposit(200.0);
        assertEquals(1200.0, account.getBalance(), 0.001);
    }

    @Test
    @DisplayName("Dépôt d'un montant nul ne change pas le solde")
    void depositZeroAmount() {
        account.deposit(0.0);
        assertEquals(INITIAL_BALANCE, account.getBalance(), 0.001);
    }

    @Test
    @DisplayName("Dépôt d'un montant négatif lève une exception")
    void depositNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-100.0));
    }

    // Tests pour withdraw()
    @Test
    @DisplayName("Retrait d'un montant positif diminue le solde")
    void withdrawPositiveAmount() {
        account.withdraw(200.0);
        assertEquals(800.0, account.getBalance(), 0.001);
    }

    @Test
    @DisplayName("Retrait d'un montant nul ne change pas le solde")
    void withdrawZeroAmount() {
        account.withdraw(0.0);
        assertEquals(INITIAL_BALANCE, account.getBalance(), 0.001);
    }

    @Test
    @DisplayName("Retrait d'un montant négatif lève une exception")
    void withdrawNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100.0));
    }

    @Test
    @DisplayName("Retrait d'un montant supérieur au solde lève une exception")
    void withdrawAmountExceedingBalance() {
        assertThrows(IllegalStateException.class, () -> account.withdraw(INITIAL_BALANCE + 1));
    }

    @Test
    @DisplayName("Retrait du solde exact met le solde à zéro")
    void withdrawExactBalance() {
        account.withdraw(INITIAL_BALANCE);
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    // Tests pour transfer()
    @Test
    @DisplayName("Transfert d'un montant positif entre comptes")
    void transferPositiveAmount() {
        account.transfer(300.0, otherAccount);
        assertEquals(700.0, account.getBalance(), 0.001);
        assertEquals(800.0, otherAccount.getBalance(), 0.001);
    }

    @Test
    @DisplayName("Transfert vers un compte null lève une exception")
    void transferToNullAccount() {
        assertThrows(NullPointerException.class, () -> account.transfer(100.0, null));
    }

    @Test
    @DisplayName("Transfert d'un montant négatif lève une exception")
    void transferNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.transfer(-100.0, otherAccount));
    }

    @Test
    @DisplayName("Transfert d'un montant supérieur au solde lève une exception")
    void transferAmountExceedingBalance() {
        assertThrows(IllegalStateException.class, () -> account.transfer(INITIAL_BALANCE + 1, otherAccount));
    }

    // Tests pour addInterest()
    @Test
    @DisplayName("Ajout d'intérêts met à jour correctement le solde")
    void addInterest() {
        account.addInterest();
        double expectedBalance = INITIAL_BALANCE * (1 + INTEREST_RATE);
        assertEquals(expectedBalance, account.getBalance(), 0.001);
    }

    @Test
    @DisplayName("Ajout d'intérêts avec un solde nul ne change pas le solde")
    void addInterestWithZeroBalance() {
        BankAccount zeroAccount = new BankAccount(0.0, INTEREST_RATE);
        zeroAccount.addInterest();
        assertEquals(0.0, zeroAccount.getBalance(), 0.001);
    }

    // Tests pour getBalance()
    @Test
    @DisplayName("getBalance retourne le solde correct")
    void getBalanceReturnsCorrectValue() {
        assertEquals(INITIAL_BALANCE, account.getBalance(), 0.001);
    }
}