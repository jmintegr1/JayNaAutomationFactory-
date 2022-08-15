
package OOP2;

public class TestBank {

    public static void main(String[] args) {


        ICICIBank ic = new ICICIBank();  //Can you create object of child class? : Yes you can create object of child class. In here ICICIBank is a class

        ic.educationLoan(); //Calling method from RBIBank
        ic.homeLoan();
        ic.carLoan();


        ic.credit();  //Now calling from USBank
        ic.debit();
        ic.trading();
        ic.trasferMoney();

        ic.mutualFunds();  //Calling ICICI's own methods
        ic.insurance();

        ic.stock();


        System.out.println(USBank.min_balance); //Calling interface variable (from ICICI), since it's STATIC in NATURE we don't have
        //to instantiate it, we can just call its variable this way = Class Name. Dot & Variable name inside PLS()


        //USBank.min_balance = 200; //Interface variable is "Final & Static" by nature, so it's set in ICICIBank = 100, therefore it cannot be
                                  //assigned nor Changed like this

        //Dynamic polymorphism
        //Child class object can be referred by parent Interface reference variable

        USBank us = new ICICIBank(); //Here ICICIBank is the object and us for (USBank) is the reference variable(same as.. WebDriver driver = new ChromeDriver)
        us.credit();               //Although we cannot create object of interface but we can create REFERENCE of INTERFACE which will refer to child class' object
        us.debit();
        us.trading();
        us.trasferMoney();   //INTERFACE is also called 100% ABSTRACTION

    }
}

