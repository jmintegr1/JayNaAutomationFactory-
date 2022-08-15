package JavaBasics;

public class ConstructorConcept {       //**IQ: What is the difference between constructor and functions/method? Ans: Constructor will NEVER return a value, where as Method CAN return a value.
                                       //IQ: why constructors are used in java? Ans: Constructor is used to initializing objects of a class and
                                      // allocate appropriate memory to objects.

    //Class variables, INSTANCE variables or Global variables
    String name;
    int age;

    public ConstructorConcept(){ //AKA Zero parameter constructor that's why it's called default constructor cuz zero parameter inside

        System.out.println("Default constructor");
    }

    public ConstructorConcept(int i ){ //1 parameter. Parameterized constructor with same name of constructor but different because 1 argument inside the parameter        System.out.println("1 parameter constructor");
        System.out.println(i);
    }

    //IQ: Can you over load constructor? Yes constructor can be over loaded, by having multiple ARGUMENTS in the parameter
    public ConstructorConcept(int i, int j){
        System.out.println("2 parameter constructors");
        System.out.println(i  + " " + j);
    }

    public ConstructorConcept(String name, int age) { //Until you fill in the parameters inside with arugments, it will conflict with 1st constructor cuz they are with same name
        this.name = name;  // Name and age here are local variable, above variables below class name are called INSTANCE /Global /Class variables
        this.age = age; //***Always remember this.classVariable = localVariable;!!!!  So 1st is Global variable from top then = (equal) then Local variable just like from top variable is Global then  down/inside is Local

        /*name = name1; //If you want to initialize directly, either way you have to differentiate instance variable from local variables
        age = age1;*/   //either by keyword "this" like above or change the local variable by adding 1 in parameter: public ConstructorConcept(String name1, int age1)
    }

    public static void main(String[] args) {

        ConstructorConcept obj = new ConstructorConcept();
        ConstructorConcept obj1 = new ConstructorConcept(10); //Reason it calls constructor with i is because that's the only one with parameter (int i)
        ConstructorConcept obj2 = new ConstructorConcept(10, 20);
        ConstructorConcept obj3 = new ConstructorConcept("Tom",  25); //name & age is automatically inputed as soon as you put "NAME" and space because we declared them as Class Variables from the top
        ConstructorConcept obj4 = new ConstructorConcept("Jewell", 44);

        System.out.println(obj3.name + " is " + obj3.age + " and it's fucking awesome! "); //This way we can call both of them side by side with string concatenation in print line statement
        System.out.println(obj3.name); //Here calling just the name
        System.out.println(obj3.age); //Just age
        System.out.println(obj4.name + " just turned " + obj4.age);

    }

}
