package testPackage4finalKeyword;

//To prevent Inheritance we use final keyword after public
public class ParentClass {

    //To prevent method overriding final keyword after public
    public void start(){
        System.out.println("parent ---- start method");
    }
}

 //if final is used in both situation we'll get error in child class so I am not using till I want to run it with final keyword