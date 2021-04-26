package com.company;
import java.util.Vector;
import java.util.ArrayList;
/**
 * A class use to save the information about the clients and their accounts'
 */
public class Bank {
    private String name;
    private String address;
    private long phone;
    /**
     * Array lists to save info
     */
    public ArrayList<Account>accountList=new ArrayList<Account>();
    public ArrayList<Client>clientList=new ArrayList<Client>();

    /**
     * parameterized constructor to set the values of the attributes
     * @param name variable to set the name
     * @param address variable to set the address
     * @param phone variable to set the phone
     */
    public Bank(String name,String address,long phone){
        this.name=name;
        this.address=address;
        this.phone=phone;
    }

    /**
     * method to set the name
     * @param name variable used to set the name
     */
    public void set_name(String name){
        this.name=name;
    }

    /**
     * method to set the address
     * @param address variable used to set the address
     */
    public void set_address(String address){
        this.address=address;
    }

    /**
     * method to  set the phone
     * @param phone variable used to set the phone
     */
    public void set_phone(long phone){
        this.phone=phone;
    }

    /**
     * method to get name
     * @return name
     */
    public String get_name(){
        return name;
    }

    /**
     * method to get address
     * @return address
     */
    public String get_address(){
        return address;
    }

    /**
     * method to get phone
     * @return phone
     */
    public long get_phone (){
        return phone;
    }

    /**
     * method to add an object from account in the arraylist
     * @param account an object used to add to the arraylist of accountlist
     */
    public void addAccount(Account account){
        accountList.add(account);
    }

    /**
     * method to add an object from specialaccount in the arraylist
     * @param account an object used to add to the arraylist of accountlist
     */
    public void addAccount(SpecialAccount account){
        accountList.add(account);
    }

    /**
     * method to add an object from client in the accountlist
     * @param client an object used to add to the arraylist of clientlist
     */
    public void addClient(Client client){
        clientList.add(client);
    }

    /**
     * method to add an object from commercialclient in the accountlist
     * @param client an object used to add to the arraylist of clientlist
     */
    public void addClient(CommercialClient client){
        clientList.add(client);
    }

    /**
     * method to print all clients in bank
     */
    public void print_all_clients(){
        System.out.print("All clients in this bank: ")  ;
        System.out.println(clientList);
    }

    /**
     * method to print all accounts in bank
     */
    public void print_all_accounts(){
        System.out.print("Client's account in this bank: ")  ;
        System.out.println(accountList);
    }




}