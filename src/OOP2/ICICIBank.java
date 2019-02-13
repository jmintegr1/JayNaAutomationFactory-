
package OOP2;
                                 //Comma, used after USBank to implement from additional bank such as RBIBank, this is called achieving Multiple Inheritance
public class ICICIBank implements USBank, RBI{
 //IS-A Relationship - means it's an Interface to Class relationship
                                       // Indian bank ICICI Bank wants to open in US so Uncle Sam says you can but you have to follow guidelines, rules & regulation.
                                      //Those guidelines in the form of Methods are defined in an Interface. So all banks that open in US will implement the Interface to
                                     // fulfill it's obligation to Uncle Sam.

    //If a class is implementing an Interface then it's mandatory to define/override ALL the methods of the  Interface
    //RBI Interface
    @Override
    public void educationLoan() {
        System.out.println("icici--edu loan");       //In Interface we can achieve multiple inheritance, means child class can implement multiple interface
    }                                               //Through interface a Child class can have multiple inheriting relationship from Uncle Class

    @Override
    public void homeLoan() {
        System.out.println("icici--home loan");                 //Dynamic polymorphism
    }                                                          //Child class object can be referred by parent Interface reference variable

    @Override
    public void carLoan() {
        System.out.println("icici--car loan");
    }


    //Coming from USBank Interface
    @Override       //If a class is implementing an Interface then it's mandatory to define/Override ALL the methods of the Interface
    public void debit() {
        System.out.println("icici - debit");
    }

    @Override
    public void credit() {
        System.out.println("icici - credit");
    }

    @Override
    public void trasferMoney() {
        System.out.println("icici = transfer money");
    }

    @Override
    public void trading() {
        System.out.println("icici - trading");
    }



    //ICICIBank's own class methods:
        public void mutualFunds(){
            System.out.println("icici - mutual funds");
    }

    public void insurance() {
            System.out.println("icici - insurance");

    }
}

