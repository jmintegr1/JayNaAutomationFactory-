package testPackage4finalKeyword;

public class ChildClass extends ParentClass {  //As soon as final is used after public in PARENT we get error here

    public void start() {   //If method is final in the parent class then you'll get error because you cannot override a "final" method

        System.out.println("child class' -- start method");
    }
}    //Same applies for method, as soon final is used after Public in PARENT class we get error here
