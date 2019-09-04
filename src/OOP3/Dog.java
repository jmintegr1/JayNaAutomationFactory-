
package OOP3;

public class Dog extends Animal {    //Extending abstract class

    public void eat(){ //Moment you write final in Animal (parent class), then child class (dog) cannot override this method

        System.out.println("Animal -- eat mouse");   // If we comment out defined method (eat method) in both classes then it becomes 100% abstraction)
    } //Defined method is called NON-Abastract method

//    public void shit(){
//        System.out.println("Dog eat shit");    //Cuz if it's final in parent class, so we'll get error. To run it, delete final from parent/Animal class
//
//    }

    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();  //Calling eat() from parent Abstract class
        d.shit(); //shit() is 100% abstract
    }
}

