/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author MUHAMMAD
 */
public class BankAccount {
    public int accountNumber;
    public String accountName;
    public double balance;
    public BankAccount(String name, int number, double accountBalance){
        accountNumber = number;
        accountName = name;
        balance = accountBalance;
    }
    public void deposit(double amountToDeposit) {
        balance = balance + amountToDeposit;
    }
    public void withdraw(double amountToWithdraw){
        balance = balance - amountToWithdraw;
    }
    
    public double getBalance() {
       return balance;
    }
}
