package OOP2;     //When you start a project FIRST DRAW OUT A DETAIL DIAGRAM (THE PLAN) THEN START YOUR CODING ACCORDINGLY. THIS IS BEST PRACTICE!!!

public abstract class Animal {

    public final void eat(){
        System.out.println("Animal -- eat");
    }
}
   //Abstraction we can do from 0-100%. 0 means no abstract method and 100% means all the methods are abstract in nature
   //Partial Abstract -- means some methods are abstract and some are not
   //Interface means 100% Abstraction . Abstraction -- is the process of hiding the implementation details