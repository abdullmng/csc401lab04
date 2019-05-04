/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.util.Scanner;
/**
 *
 * @author MUHAMMAD
 */
public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Account Name: ");
        String name = input.nextLine();
        System.out.print("Enter Account number: ");
        int accountNumber = input.nextInt();
        System.out.print("Enter Initial amount: ");
        double balance = input.nextDouble();
        
        //bankAccount object for customer 
        BankAccount bankAccount = new BankAccount(name,accountNumber, balance);
        
        
        System.out.print("Enter amount to deposit: ");
        double amountToDeposit = input.nextDouble();
        //calls the deposit method
        bankAccount.deposit(amountToDeposit);
        //gets and display new balance after deposit
        System.out.printf("balance after deposit is: N%.2f\n",bankAccount.getBalance());
        
        
        System.out.print("Enter amount to withdraw: ");
        double amountToWithdraw = input.nextDouble();
        if(amountToWithdraw < bankAccount.getBalance()) {
            //calls the withdrawal function
            bankAccount.withdraw(amountToWithdraw);

            //gets and display new balance after withdrawal
            System.out.printf("Account Balance after withdrawal is: N%.2f\n", bankAccount.getBalance());    
        }else{
            System.out.print("Insufficient Balance\nPlease try again!!\n");
        }
        }
}
