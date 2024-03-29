package OOPConceptPart2;

                    //Child class of Car so Grandchild of Vehicle
        public class BMW extends Car { //Keyword "EXTENDS" creates THE relationship where child class inherits from dad
    // *IQ: What is this relationship called?    Ans: This is called HAS-A relationship, it's a CLASS to CLASS relationship by using keyword
    //Extends (HAS A parent's quality)
    // Only if we are calling by Dynamic (Runtime) Polymorphism then overridden method & child class method will be called.


    //Same # of arguments both parent and child's class but during compile time preference will be given to child's method hence
    // (Method-Overridden)
    public void start() {

        System.out.println("BMW... Electric Press Button Start");
    }


    /*When the SAME method name is in both parent and child class like the start() method above, JVM will call from the child class since child has
    it's own modified perhaps improved version.. hence it's Overridden the parent's method

    //**IQ: What is Method-Overriding?
    Method-Overridden)--> When same method is present in parent class as well as in child class with the SAME method() "NAME" and SAME # of
    ARGUMENTS but JVM prefers Child's method during "RUN TIME", this is called Method Overriding*/

    public void theftSafety(){

        System.out.println("BMW...AdvancedTheftSafety");
    }
}

   //Method overloading ---> When the method "NAME" is the SAME BUT with DIFFERENT ARGUMENTS or INPUT PARAMETERS within the same class
  //Overloading allows different methods to have same name, but different signatures where signature can differ by number of input parameters
 // or type of input parameters or both.
//Method OverLoading + is related to + Compile Time aka + or Static Polymorphism. (MOL + CT = SP) AKA Has-A relation

