package com.company;

/**
 * A class that use to set the the account information of the client
 */
public class Account {
    private double balance;
    private long Account_Number;
    private static long account_number =100 ;

    /**
     * Empty constructor
     */
    public Account (){
        account_number++;
        Account_Number=account_number;
        balance = 1000; // as an initial value
    }

    /**
     * A parameterized constructor take the account number from user and put initial value of the balance
     * @param Account_Number variable takes to set the account number
     */
    public Account (int Account_Number){
        balance = 1000;
        this.Account_Number = Account_Number;
    }

    /**
     * setter method to set the value of the balance
     * @param balance variable takes to set to the balance
     */
    public void set_balance(double balance){
        this.balance = balance;
    }

    /**
     * setter method to set the value of teh account number
     * @param account_number parameter which use to set the value of the account number
     */
    public void set_account_number(int account_number){
        this.Account_Number = account_number;
    }

    /**
     * method that return the value of the balance
     * @return return the value of the balance
     */
    public double get_balance(){
        return balance;
    }

    /**
     * method that return the value of the account number
     * @return
     */
    public long get_account_number(){
        return Account_Number;
    }

    /**
     * Override the method toString ( ) inherited from class Object to make it return a meaningful string representation of the account information.
     * @return a meaningful string representation of the account information.
     */
    @Override
    public String toString() {
        return  "balance=" + balance + ", account_number=" + Account_Number ;
    }

    /**
     * method enable client to be able to take money
     * @param num the value that he want to take from its balance
     */
    public void withdraw(double num){
        if(num<balance){
            double new_balance = balance - num ;
            balance = new_balance ;}
        else
        {System.out.println("your balance account less than your entry number ");}
    }

    /**
     * method enable the client to put mney to his balance
     * @param num the value that he want to put to his balance
     */

    public void deposit(double num ){
        double new_balance = balance + num ;
        balance = new_balance;
    }

}