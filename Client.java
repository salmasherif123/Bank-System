package com.company;

/**
 * A class takes the info about the client
 */
public class Client  {
    private String name;
    private String National_Id="00000000000000";
    private String Address;
    private long phone;
    private Account account;

    /**
     * Empty constructor
     */
    public Client() {
    }

    /**
     * parameterized constructor to set the value of the attributes with national ID
     * @param name variable to set the name
     * @param NationalId variable to set the value of National ID
     * @param Address variable used to set address
     * @param phone variable which used to set the value of the phone
     * @param account object used to set the account of the client
     */
    public Client(String name, String NationalId, String Address, long phone, Account account) {
        this.name = name;
        this.National_Id = NationalId;
        this.Address = Address;
        this.phone = phone;
        this.account = account;
    }

    /**
     * parameterized constructor to set the value of the attributes without national ID to use in commercial client class
     * @param name variable to set the name
     * @param Address variable used to set address
     * @param phone variable which used to set the value of the phone
     * @param account object used to set the account of the client
     */
    public Client(String name, String Address, long phone,Account account) {
        this.name = name;
        this.Address = Address;
        this.phone = phone;
        this.account = account;
    }

    /**
     * method used to set the name
     * @param name variable takes to set the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * method to set the value of national ID
     * @param NationalId value to set national ID
     */
    public void setNationalId(String NationalId) {
        this.National_Id = NationalId;
    }

    /**
     * method to set address
     * @param Address variable to set address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * method to set the value phone
     * @param phone variable use to set the value of phone
     */
    public void setPhone(long phone) {
        this.phone = phone;
    }

    /**
     * method to set the object of account class
     * @param account object from account class used to set the account in this class
     */
    public void setAccount (Account account) {
        this.account = account;
    }

    /**
     * method to get the name of the client
     * @return the name of the client
     */
    public String getName() {
        return name;
    }

    /**
     * method to get the national Id
     * @return National Id
     */
    public String getNationalId() {
        return National_Id;
    }

    /**
     * method to get address
     * @return address
     */
    public String getAddress() {
        return Address;
    }

    /**
     *method to get phone
     * @return value of the phone
     */
    public long getPhone() {
        return phone;
    }

    /**
     * method to get the object of the account class
     * @return the object of the account class
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Override the method toString ( ) inherited from class Object to make it return a meaningful string representation of the client information. String representing Client information, should also include his account’s information.
     * @return a meaningful of the information of the client
     */
    @Override
    public String toString() {
        return  "Name=" + name + ", NationalId=" + National_Id + ", Address=" + Address + ", phone=" + phone + ", " +account ;
    }


}