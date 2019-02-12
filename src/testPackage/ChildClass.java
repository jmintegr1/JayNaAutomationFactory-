package testPackage;

public class ChildClass extends ParentClass {
    //To prevent inheritance


    public void start() {   //If method is final in the parent class then you'll get error because you cannot prevent method overriding
        System.out.println("child class -- start method");
    }
}
