package OOP2;              //There is no Main Method in Interface

public interface USBank { // Interface is STATIC in Nature

    int min_balance = 100;

    public void debit();


    public void credit();


    public void trasferMoney();


    public void trading();


    //Interface has NO method BODY, they are EMPTY so only method declaration, only method prototype
    //Interface we only declare the variables, variables are default static in nature
    //Variable value will not be changed, it is FINAL/constant in nature
    //Cannot create the object of interface
    //Static Methods NOR Main Methods are allowed in INTERFACE
    //But interface variables are static in nature by default
    //CANNOT create an Object in Interface so 100% Abstrction -- 100% abstraction means we CANNOT INSTANTIATE and an object,
    //so just declaring the properties so 100% abstraction are happening
    //In the child class, in the ICICI class so this called abstraction feature


}
