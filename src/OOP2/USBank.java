package OOP2;              //There is no Main Method in Interface

public interface USBank { // Interface is STATIC & Final by Nature

    int min_balance = 100;   //Interface variable is STATIC & Final by Nature

    public void debit();


    public void credit();


    public void trasferMoney();


    public void trading();


//    Interface has NO method BODY, they are EMPTY so only method declaration, only method prototype
//    Interface we only declare the variables, variables are by default static & final in nature
//    Variable value will NOT be changed, it is FINAL/Constant in nature
//    Cannot create the object of interface
//    Static Methods NOR Main Methods are allowed in INTERFACE
//    But interface variables are ALLOWED, also static in nature by default
//    CANNOT create an Object in Interface so 100% Abstraction -- 100% abstraction means we CANNOT INSTANTIATE and an object...
//    ..so just declaring the properties then 100% abstraction taking place
//    In the child class, in the ICICI class so this is called abstraction feature
    //IQ: WHEN TO USE ABSTRACT CLASS AND WHEN TO USE INTERFACE?

}
