package OOP3;

public class Test extends Shape{

    Test(){
        System.out.println("Test class constructor");
    }

    public static void main(String[] args){

        //Can you create the object of Shape class (abstract class)? :
        // Ans: NO this is NOT allowed: Shape s = new Shape(); cuz below

//        Shape s  = new Test();  // I can create the reference variable and this reference points to the child class
//         s.drawing();
//         s.fill();

        //If you are going to run w/ Test Object then comment out above codes line 14-16
        Test test = new Test();  //Now this object will call constructors from Shape class (Abstract / parent) class
        test.drawing();  //This object can also call methods from parent Shape class
        test.fill();
    }

    @Override
    void drawing() {
        System.out.println("Test -- drawing");

    }
}
