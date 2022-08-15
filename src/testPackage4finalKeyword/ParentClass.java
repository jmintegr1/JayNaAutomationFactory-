package testPackage4finalKeyword;

//To prevent INHERITANCE we use final keyword after public
public class ParentClass {

    //If I want to prevent METHOD Overriding, then I will use final keyword after public
    public void start(){

        System.out.println("parent ---- start method");
    }
}
//If final is used in Class & Method, we'll get error in child class so I am not using until I want to run it with final keyword and make them
// CONSTANT