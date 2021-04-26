package com.company;

/**
 * A class that inherited from client with an extra attribute
 */
public class CommercialClient extends Client{
    private long Commercial_Id;

    public CommercialClient() {
        super();

    }

    /**
     * parametrized constructor used to set the attributes
     * @param Commercial_Id set the value of commercial ID
     * @param name variable used to set the name
     * @param Address variable used to set the address
     * @param phone variable used to set the phone
     * @param account variable used to set the account
     */
    public CommercialClient(long Commercial_Id, String name, String Address, long phone, Account account) {
        super(name, Address, phone, account);
        this.Commercial_Id=Commercial_Id;

    }

    /**
     * method to set the value of commercial id
     * @param Commercial_Id variable used to set the value of commercial od
     */
    public void setCommercialId(long Commercial_Id) {
        this.Commercial_Id = Commercial_Id;
    }

    /**
     * method to get commercial id
     * @return commercial id
     */
    public long getCommercialId() {
        return Commercial_Id;
    }

    /**
     * Override the method toString ( ) inherited from class Object to make it return a meaningful string representation of the client information. String representing CommercialClient information, should also include his account’s information.
     * @return meaningful information
     */
    @Override
    public String toString() {
        return  (super.toString()+", CommercialId=" + Commercial_Id) ;
    }

}