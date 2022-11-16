package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest() {
        //given
        Account sundayAccount = new Account(0);
        //when i deposit 5000
        sundayAccount.deposit(5000, "1234");
        //check that balance is 5000
        int sundayAccountBalance = sundayAccount.getBalance();
        assertEquals(5000, sundayAccountBalance);
    }

    @Test
    public void depositTwiceTest() {
        //given there is an account
        Account sunday = new Account(0);
        //given that  initial balance is 4000
        sunday.deposit(4000, "1234");
        //when i deposit 2000
        sunday.deposit(2000, "1234");
        //check that balance is 6000
        int sundayAccountBalance = sunday.getBalance();
        assertEquals(6000, sundayAccountBalance);
    }

    @Test
    public void depositNegativeAmountTest() {
        //given there is an account
        Account sundayAccount = new Account(0);
        //given that  initial balance is 4000
        sundayAccount.deposit(4000, "1234");
        //when i deposit 2000
        sundayAccount.deposit(-2000, "1234");
        //check that balance is 4000
        int sundayAccountBalance = sundayAccount.getBalance();
        assertEquals(4000, sundayAccountBalance);
    }


    @Test
    public void withdrawAmountTest() {
        //given there is an account
        Account sundayAccount = new Account(0);
        //given that initial balance is 10000
        sundayAccount.deposit(10000, "1234");
        //when I withdraw 5000
        sundayAccount.withdraw(5000,"1234");
        //check that balance is 5000
        int sundayAccountBalance = sundayAccount.getBalance();
        assertEquals(5000, sundayAccountBalance);
    }

    @Test
    public void withdrawAmountTwiceTest() {
        //given there is an account
        Account sundayAccount = new Account(0);
        //given that initial balance
        sundayAccount.deposit(30000, "1234");
        //when I withdraw 10000
        sundayAccount.withdraw(10000,"1234");
        //when I withdraw another 15000
        sundayAccount.withdraw(10000,"1234");
        //check that balance is 5000
        int sundayAccountBalance = sundayAccount.getBalance();
        assertEquals(10000, sundayAccountBalance);
    }

    @Test
    public void withdrawNegativeAmountTest () {
        //given there is an account
        Account sundayAccount = new Account(0);
        //given that initial balance
        sundayAccount.deposit(50000, "1234");
        //when I withdraw 30000
        sundayAccount.withdraw(-30000,"1234");
        //check that balance is 20000
        int sundayAccountBalance = sundayAccount.getBalance();
        assertEquals(50000, sundayAccountBalance);
    }

    @Test
    public void withdrawThanBalance() {
        //given there is an account
        Account sundayAccount = new Account(0);
        //given initial balance is
        sundayAccount.deposit(5000, "1234");
        //when I withdraw 10000
        sundayAccount.withdrawMoreThanBalance(10000);
        //check that balance is 5000
        int sundayAccountBalance = sundayAccount.getBalance();
        assertEquals(5000, sundayAccountBalance);
    }

}