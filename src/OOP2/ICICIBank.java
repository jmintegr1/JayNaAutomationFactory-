
package OOP2;     //IQ: How do we achieve multiple inheritance

               // Using Comma after USBank, to implement from additional bank such as RBIBank, this is called achieving Multiple Inheritance

public class ICICIBank extends Finance implements USBank, RBI{

       //*****Particular class can extend only one class but can implement multiple interfaces****
     //IS-A Relationship - means it's an Interface to Class relationship (Implementing = Is-A Relationship)

    //Indian bank ICICI Bank wants to open in US so Uncle Sam says you can but you have to follow US guidelines, rules & regulation.
    //Those guidelines in the form of Methods are Undefined in an Interface. So all banks that open in US will implement the Interface to
    //fulfill its obligation to Uncle Sam.

    //If a class is implementing an Interface then it's mandatory to define/OVERRIDE ALL the methods of the Interface
    //RBI Interface

    @Override   //Inheriting from RBI Interface
    public void educationLoan() {
        System.out.println("icici--edu loan");
          //With Interface we can achieve multiple inheritance, means Child CLASS can implement MULTIPLE Interfaces
    }   //Defined methods are called NON-Abstract method
      // Through interface a Child class can have multiple inheriting relationship from Uncle Classes

    @Override
    public void homeLoan() { //From RBI Interface
        System.out.println("icici--home loan");          //Dynamic polymorphism
    }                                                  //Child class object can be referred by parent Interface reference variable

    @Override
    public void carLoan() {  //From RBI Interface

        System.out.println("icici--car loan");
    }


    //Getting from USBank Interface by implementing, using comma after keyword implements on line 6
    @Override   //If a class is implementing an Interface then it's mandatory to define so Override ALL the methods from the Interface
    public void debit() {  //It's not required to write explicitly @Override but it helps to segregate and differentiate implemented methods vs. abstract (self) methods

        System.out.println("icici - debit"); //Calling from Interface USBank
    }

    @Override
    public void credit() {  //Calling from Interface USBank

        System.out.println("icici - credit");
    }

    @Override
    public void trasferMoney() {  //Calling from Interface USBank

        System.out.println("icici = transfer money");
    }

    @Override
    public void trading() {   //Calling from Interface USBank

        System.out.println("icici - trading");
    }


    //ICICIBank's own personal class methods: so @Override is NOT needed

    public void mutualFunds(){

        System.out.println("icici - mutual funds");
    }

    public void insurance() {
            System.out.println("icici - insurance");

    }
}

