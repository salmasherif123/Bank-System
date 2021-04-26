package com.company;
import java.util.Scanner;
/**
 * @author Salma sherif Hussien 
 */

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        input.useDelimiter ( "\n" );
        int choice;
        boolean flag = false;
        Bank bank = new Bank("Al-Ahly","Branch 6th of October city",888888);
        while(true)
        {
            System.out.println("Menu of the Bank system");
            System.out.println("1- Add new client");
            System.out.println("2- List All Accounts/Clients");
            System.out.println("3- Withdraw /Deposit");
            System.out.println("4-Exit");
            System.out.print("Please Enter your Choice: ");
            choice=input.nextInt();
            if(choice==1)
            {
                while (true)
                {
                    Client client= new Client();
                    System.out.println("1-Normal Client\n2-Commercial Client");
                    choice = input.nextInt();
                    if(choice==1)
                    {
                        while(true)
                        {
                            System.out.println("1-Normal Account\n2-Special Account");
                            choice=input.nextInt();
                            if(choice==1)
                            {
                                Account account =new Account();
                                System.out.println("Fill your personal information:");
                                client.setAccount(account);
                                System.out.print("Please, enter your name: ");
                                String name = input.next();
                                client.setName(name);
                                System.out.print("Please, enter your address: ");
                                String address = input.next();
                                client.setAddress(address);
                                System.out.print("Please, enter your phone: ");
                                long phone =input.nextInt();
                                client.setPhone(phone);
                                System.out.print("Please, enter your national ID: ");
                                String national_id = input.next();
                                client.setNationalId(national_id);
                                bank.addAccount(account);
                                bank.addClient(client);
                                flag = true;
                                System.out.println();
                                break;
                            }
                            else if (choice==2)
                            {
                                Account specialaccount =new SpecialAccount();
                                System.out.println("Fill your personal information:");
                                client.setAccount(specialaccount);
                                System.out.print("Please, enter your name: ");
                                String name = input.next();
                                client.setName(name);
                                System.out.print("Please, enter your address: ");
                                String address = input.next();
                                client.setAddress(address);
                                System.out.print("Please, enter your phone: ");
                                long phone =input.nextLong();
                                client.setPhone(phone);
                                System.out.print("Please, enter your national ID: ");
                                String national_id = input.next();
                                client.setNationalId(national_id);
                                bank.addAccount(specialaccount);
                                bank.addClient(client);
                                flag = true;
                                System.out.println();
                                break;
                            }
                            else
                            {
                                System.out.println("Wrong input , Try Again");
                            }
                        }
                        if(flag==true)
                        {
                            break;
                        }
                }
                else if(choice==2)
                {
                    while(true)
                    {
                        CommercialClient commercialclient =new CommercialClient();
                        System.out.println("1-Normal Account\n2-Special Account");
                        choice=input.nextInt();
                        if(choice==1)
                        {
                            Account account =new Account();
                            System.out.println("Fill your commercial information:");
                            commercialclient.setAccount(account);
                            System.out.print("Please, enter commercial's name: ");
                            String name = input.next();
                            commercialclient.setName(name);
                            System.out.print("Please, enter commercial's address: ");
                            String address = input.next();
                            commercialclient.setAddress(address);
                            System.out.print("Please, enter commercial's phone: ");
                            long phone =input.nextLong();
                            commercialclient.setPhone(phone);
                            System.out.print("Please, enter commercial's ID: ");
                            long commercial_id = input.nextLong();
                            commercialclient.setCommercialId(commercial_id);
                            bank.addAccount(account);
                            bank.addClient(commercialclient);
                            flag = true ;
                            System.out.println();
                            break;
                        }
                        else if(choice==2)
                        {
                            Account specialaccount =new SpecialAccount();
                            System.out.println("Fill your commercial information:");
                            commercialclient.setAccount(specialaccount);
                            System.out.print("Please, enter commercial's name: ");
                            String name = input.next();
                            commercialclient.setName(name);
                            System.out.print("Please, enter commercial's address: ");
                            String address = input.next();
                            commercialclient.setAddress(address);
                            System.out.print("Please, enter commercial's phone: ");
                            long phone =input.nextLong();
                            commercialclient.setPhone(phone);
                            System.out.print("Please, enter commercial's ID: ");
                            long commercial_id = input.nextLong();
                            commercialclient.setCommercialId(commercial_id);
                            bank.addAccount(specialaccount);
                            bank.addClient(commercialclient);
                            flag = true;
                            System.out.println();
                            break;
                        }
                        else
                        {
                            System.out.println("Wrong input , Try Again");
                        }
                    }
                    if(flag==true)
                    {
                        break;
                    }
                }
                else
                {
                    System.out.println("Wrong input , Try Again");

                }
            }
            }
            else if(choice==2)
            {
                System.out.println("the info about this bank is");
                bank.print_all_accounts();
                bank.print_all_clients();
                System.out.println();

            }
            else if(choice==3)
            {
                while(true)
                {
                    flag = false;
                    System.out.println("1-withdraw\n2-Deposit");
                    choice = input.nextInt();
                    if (choice == 1)
                    {
                        flag = true;
                        System.out.print("please, Enter your account number: ");
                        long account_num = input.nextLong();
                        boolean flage = false;
                        for(int i =0 ; i< bank.clientList.size();i++)
                        {
                            if(account_num== bank.accountList.get(i).get_account_number())
                            {
                                System.out.print("please, Enter the amount of money that you want to withdraw: ");
                                int withdraw = input.nextInt();
                                bank.accountList.get(i).withdraw(withdraw);
                                flage = true;
                                break;
                            }

                        }
                        if(flage==false){
                            System.out.println("This account number not exist");
                        }
                    }
                    else if(choice==2)
                    {
                        flag = true;
                        System.out.print("please, Enter your account number: ");
                        long account_num = input.nextLong();
                        boolean flage = false;
                        for(int i =0 ; i< bank.clientList.size();i++)
                        {
                            if(account_num== bank.accountList.get(i).get_account_number())
                            {
                                System.out.print("please, Enter the amount of money that you want to deposit: ");
                                flag=true;
                                int money = input.nextInt();
                                bank.accountList.get(i).deposit(money);
                                break;
                            }


                        }
                        if(flage==false)
                        {
                            System.out.println("this account not exist");
                        }
                    }
                    else
                    {
                        System.out.println("Wrong input , Try Again");
                    }
                    if(flag==true){
                        break;
                    }
                }
            }
            else if(choice==4)
            {
                System.out.println();
                break;
            }
            else
            {
                System.out.println(" Wrong input, Try Again");
            }
        }
        System.out.println("+++++++++++++TEST ALL FUNCTIONS ++++++++++++");

       System.out.println("==========  Problem 1: Account class ==========");
        //create new object from account class.
        Account account1 =new Account(1234);
        //setter method that set balance.
        account1.set_balance(1000);
        //setter method that set account number.
        account1.set_account_number(1233);
        //getter method that get balance.
        System.out.println("Balance is : "+account1.get_balance());
        //getter method that get account number.
        System.out.println("Account number is : "+account1.get_account_number());
        //a method that enable the client to deposit a money in his account.
        account1.deposit(5000);
        // a method that enable the client to withdraw a money from his account.
        account1.withdraw(7000);
        //using a toString method to print all information about the account.
        System.out.println(account1);
        System.out.println("============================================");
        System.out.println("============  SpecialAccount class ============");
        //create new object from special account class.
        Account specialaccount =new SpecialAccount(3456);
        //setter method that set balance.
        specialaccount.set_balance(2000);
        //setter method that set account number.
        specialaccount.set_account_number(3455);
        //getter method that get balance.
        System.out.println("Balance is :"+specialaccount.get_balance());
        //getter method that get account number.
        System.out.println("Account number is :"+specialaccount.get_account_number());
        //a method that enable the client to deposit a money in his account.
        specialaccount.deposit(3000);
        //a method that inherited from account class which allows over drafting with maximum LE 1000 of lE.
        specialaccount.withdraw(4000);
        //using a toString method to print all information about the special account.
        System.out.println(specialaccount);
        System.out.println("============================================");
        System.out.println("********** Problem 2 : Client Class *************");
        //create new object from client class.
        Client client1 =new Client("Client 1", "11111111", "Egypt", 0111467675, account1);
        // setter method that set name.
        client1.setName("Mohammed");
        //setter method that set national id.
        client1.setNationalId("3010504210111");
        //setter method that set address.
        client1.setAddress("Cairo");
        //setter method that set phone number.
        client1.setPhone(01111375736);
        //setter method that set object from account class.
        client1.setAccount(account1);
        //getter method that get name.
        System.out.println("Client's Name :"+client1.getName());
        //getter method that get national id.
        System.out.println("Client's NID :"+client1.getNationalId());
        //getter method that get address.
        System.out.println("Client's Address :"+client1.getAddress());
        //getter method that get phone number.
        System.out.println("Client's Phone :"+client1.getPhone());
        //getter method that get all account's information.
        System.out.println("Client's Account :"+client1.getAccount());
        //using a toString method to print all information about the client.
        System.out.println(" Client's Information : "+client1);
        System.out.println("********************************************");
        System.out.println("******** CommercialClient Class **************");
        //create new object from commercial client class.
        CommercialClient commercialclient =new CommercialClient(11111111, "Commercial company", "Egypt", 0111646352, specialaccount);
        // setter method that set commercial id.
        commercialclient.setCommercialId(8576354);
        //setter method that set company's name.
        commercialclient.setName("Company's Name");
        //setter method that set company's address.
        commercialclient.setAddress("Gize");
        //setter method that set company's phone number.
        commercialclient.setPhone(647364);
        //setter method that set object from commercial client class.
        commercialclient.setAccount(specialaccount);
        //getter method that get company's Name.
        System.out.println("Company's Name :"+commercialclient.getName());
        //getter method that get company's address.
        System.out.println("Company's Address :"+commercialclient.getAddress());
        //getter method that get company's phone number.
        System.out.println("Company's Phone :"+commercialclient.getPhone());
        //getter method that get all company's info.
        System.out.println("Company's Account :"+commercialclient.getAccount());
        //getter method that get commercial id.
        System.out.println("Company's CID : "+commercialclient.getCommercialId());
        //getter method that get all company's info.
        System.out.println("Company's Information :"+commercialclient);
        System.out.println("**************************************************");
        System.out.println("##############################################");
        System.out.println("################ Problem 3:Bank Class #################");
        //create new object from bank class.
        Bank bank1 =new Bank("Bank Misr","Egypt",44465);
        //setter method that set bank's name.
        bank1.set_name("Bank Alahly");
        //setter method that set bank's address.
        bank1.set_address("6th of October City");
        //setter method that set bank's phone number.
        bank1.set_phone(888695);
        //getter method that get bank's name.
        System.out.println("Bank's Name : "+ bank1.get_name());
        //getter method that get bank's address.
        System.out.println("Bank's Address :"+bank1.get_address());
        //getter method that get bank's phone number.
        System.out.println("Bank's phone : "+bank1.get_phone());
        //method that adds a new account .
        bank1.addAccount(account1);
        //method that adds a new special account.
        bank1.addAccount(specialaccount);
        // add method that adds a new client.
        bank1.addClient(client1);
        //method that adds commercial client.
        bank1.addClient(commercialclient);
        //display method that print all accounts in the bank.
        bank1.print_all_accounts();
        //display method that print all clients in the bank.
        bank1.print_all_clients();
        System.out.println("#####################################################");
    }



}