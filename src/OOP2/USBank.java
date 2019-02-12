package OOP2;

public interface USBank {
    int min_balance = 100;


    public void debit();


    public void credit();


    public void trasferMoney();


    public void trading();



    //Interface has no method body, only method declaration, only method prototype
    //Cannot create the object of interface
    //No static methods allowed
    //But interface variables are static in nature by default
    //100% Abstrction -- 100% abstraction means you are just declaring the properties but 100% abstraction are happening
    //in the child class, in the ICICI class so this called abstraction feature
    //




}
