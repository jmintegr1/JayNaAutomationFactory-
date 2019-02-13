
package OOP2;

public class TestBank {

    public static void main(String[] args) {


        ICICIBank ic = new ICICIBank();

        ic.educationLoan(); //Calling method from RBIBank
        ic.homeLoan();
        ic.carLoan();


        ic.credit();  //Now calling from USBank
        ic.debit();
        ic.trading();
        ic.trasferMoney();

        ic.mutualFunds();  //Calling ICICI's own method
        ic.insurance();

        System.out.println(USBank.min_balance); //Calling interface variable (ICICI's), since it's static in nature we don't have
        //to instantiate it, we can just call its variable this way = Class Name Dot & Variable

        //USBank.min_balance =200;  //Interface variable is "Final" in nature, so it's set in ICICIBank therefore it cannot be assigned nor Changed like this


        //Dynamic polymorphism
        //Child class object can be referred by parent Interface reference variable
        USBank u = new ICICIBank(); //Here ICICIBank is the object and us (USBank) is the reference variable (Hybrid P)
        u.credit();
        u.debit();     //INTERFACE is also called 100% ABSTRACTION
        u.trading();
        u.trasferMoney();


        //Child class object can be referred by parent Interface reference variable

    }
}

