package OOP3;

public class Test extends Shape{

    Test(){
        System.out.println("Test class constructor");
    }

    public static void main(String[] args){

         //Can you create the object of an abstract class (Shape class)? :
        // Ans: NO this is NOT allowed: Shape s = new Shape(); cuz below

//        Shape s  = new Test();  // I can create the reference variable and this reference will point to the child class
//         s.drawing(); //As there is widning happening here as child class is extending to Shape class (Abstract), then I can create child reference variable
//         s.fill();

        //If you are going to run w/ Test Object (child class OR) then comment out above codes line 14-16
        Test test = new Test();  //Now this object will call constructors from Shape class (Abstract / parent) class
        test.drawing();  //This object can also call methods from parent Shape class (abstract class)
        test.fill();
    }

    @Override
    void drawing() {
        System.out.println("Test -- drawing, chld class defining paret's abstract class method");
        //Abstract method is being called from parent shape (abstract class) but child class is defining it because it's an abstract method
    }
}
