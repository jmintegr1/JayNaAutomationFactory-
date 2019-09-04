package OOP3;     //When you start a project FIRST DRAW OUT A DETAIL DIAGRAM (THE PLAN) THEN START YOUR CODING ACCORDINGLY. THIS IS BEST PRACTICE!!!

public abstract class Animal {

    public void eat(){ //Moment you write final, then child class (dog) cannot override this method

        System.out.println("Animal -- eat duck");   //Defined method is called NON-Abastract method
    }

    public final void shit(){ //Abstract class can have final method as well

    }

}
    //Abstraction we can do from 0-100%. 0 means NO abstract methods and 100% means ALL the methods are abstract in nature

    //Partial Abstract -- means some methods are abstract and some are not, cuz in Java we can have abstract class w/o any abstract methods

    //Interface means 100% Abstraction. Abstraction -- is the process of HIDING the implementation details

    //IQ: WHEN TO USE ABSTRACT CLASS AND WHEN TO USE INTERFACE?    Ans: When we want faster performance, we use abstract class.