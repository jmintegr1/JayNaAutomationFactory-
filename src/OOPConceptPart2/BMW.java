package OOPConceptPart2;

public class BMW extends Car { //Keyword "extends" creates THE relationship (child inherits). //*IQ: What is this relationship called?
    //Ans: This is called HAS-A relationship. Only if we are calling by Dynamic Polymorphism then overridden method & parent class method will be called.


    public void start() {  //Same # of arguments both parent and child's class but during compile time preference will be given to child's method since (Method-Overridden)
        System.out.println("BMW... Press Button Start");
    }


    /*When the SAME method name is in both parent and child class like the start() method above, it will call from the child class since child has
    it's own modified perhaps improved version.

    //**IQ: What is Method-Overriding?
    Method-Overridden)--> When same method is present in parent class as well as in child class with the SAME "NAME" and SAME # of ARGUMENTS
    is called Method Overriding*/

    public void theftSafety(){
        System.out.println("BMW...AdvancedTheftSafety");
    }
}


  //Method overloading ---> When the method "NAME" is the same but with DIFFERENT ARGUMENTS or INPUT PARAMETERS within the same class
 //Overloading allows different methods to have same name, but different signatures where signature can differ by number of input parameters
// or type of input parameters or both.
//Method OverLoading is related to Compile Time aka or Static Polymorphism. MOL = CT = SP

