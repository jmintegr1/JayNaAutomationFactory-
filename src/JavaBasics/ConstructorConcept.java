package JavaBasics;

public class ConstructorConcept {       //What is the difference between constructor and functions/method? Ans: Constructor will never return a value

    //Class variables, INSTANCE or Global variables

    String name;
    int age;

    public ConstructorConcept(){
        System.out.println("Default constructor"); //Zero parameter constructor that's why it's called default constructor
    }

    public ConstructorConcept(int i ){
        System.out.println("1 parameter constructor"); //1 parameter. Parameterized constructor but name of constructor is different
        System.out.println(i);
    }

    //IQ: Can you over load constructor? Yes constructor can be over loaded
    public ConstructorConcept(int i, int j){
        System.out.println("2 parameter constructors"); //2 parameter constructors , so total of 3 different constructors therefore constructors are over loaded here
        System.out.println(i  + " " + j);
    }

    public ConstructorConcept(String name, int age) { //Until you fill in parameters here, it will conflict with 1st constructor
        this.name = name;  // name and age here are local variable, above variables below class name are called INSTANCE /Global /Class variables
        this.age = age; //***Always remember this.classVariable = localVariable;!!!!  So 1st is Globar variable after = Local variable just like from from top down

        /*name = name1; //If you want to initialize directly, either way you have to differentiate instance variable from local variables
        age = age1;*/   //either by keyword "this" like above or change the variable by adding 1 in parameter: public ConstructorConcept(String name1, int age1)
    }



    public static void main(String[] args) {


        ConstructorConcept obj = new ConstructorConcept();
        ConstructorConcept obj1 = new ConstructorConcept(10); //Reason it calls constructor with i is because that's the only one with 1 parameter w/ (int i)
        ConstructorConcept obj2 = new ConstructorConcept(10, 20);
        ConstructorConcept obj3 = new ConstructorConcept("Tom",  25);

        System.out.println(obj3.name + " " + obj3.age); //This way we can call both of them side by side with string concatenation
        //System.out.println(obj3.name); //Here it is one at a time
        System.out.println(obj3.age);

    }

}
