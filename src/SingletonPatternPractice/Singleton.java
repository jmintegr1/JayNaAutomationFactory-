package SingletonPatternPractice;


public class Singleton {


//    Important for Framework & Interview.
//    or implement the concept in Selenium?
//    Singleton is a PATTERN, it is NOT a KEYWORD!!


//    **IQ: What you mean by Singleton pattern or Singleton class in Java and how can you achieve the same concept in Selenium?
//     Ans: Ans: In OOP, a singleton CLASS is a special class that can have ONLY ONE OBJECT or INSTANCE of the class AT A TIME. Same thing
//     we can achieve in Selenium as well. If the DRIVER = NULL then create the object, otherwise don't create it.


//    How to design Singleton class?     **IQ: What do you mean by Lazy Initialization?

//    1st: Make constructor of the class as PRIVATE
//    2nd: Write a Main Method, then call the getInstance() method, that also that has a Return Type of object of this SINGLETON class.
//    AKA Lazy Initialization



    private static Singleton singleton_instance = null;
    public String str;    //(Reference variable) = pointing to NULL

    //#1 constructor PRIVATE
    private Singleton(){
        str = "Hey.. I am using singleton class pattern (NOT a Fing keyword) cuz it kicks ass!";
    }


    //#2. INITILIZE getInstance Method will return the Instance of this particular Singleton class, the object of this class
    public static Singleton getInstance(){  //During interview you have to WRITE this method and "if" condition (this is also called LAZY Initialization)
        if(singleton_instance == null); //If Reference Variable is = NULL then you can Initialize this particular instance variable
        singleton_instance = new Singleton(); //If it is NULL, only then we initialize other wise NO need to initialize
        return singleton_instance;
    }


    //#3. Now we can call it
    public static void main(String[] args) {  //Now to test it write PSVM method, Inside we'll test this feature
        Singleton x = Singleton.getInstance(); //Call getInstance method with help of Singleton class . (dot) will give option to call getInstance(), this will return Singleton Class object..
        Singleton y = Singleton.getInstance();//then store it inside Singleton class reference variable like Singleton X = therefore instantiate into an object
        Singleton z = Singleton.getInstance();
        //Created three objects with three references so 3x calling getInstance() method

        x.str = (x.str).toUpperCase(); //Will return str = string & convert to capital with UpperCase() method then STORE it inside x.str on the other side of =

        System.out.println(x.str);  //Once object is created it is given to X including with the statement from str
        System.out.println(y.str); //Y will call getInstance() method as well and discover in Line 31 that Singleton_instance is NOT = NULL anymore cuz it is ALREADY Initialized W/ X so that means ONLY 1 time Object is created, only 1 time this class is instantiated by X
        System.out.println(z.str);//Z will discover that Singleton_instance is NOT NULL as well, so Y & Z will return the same statement cuz it is pointing to the same object which is X
                                 //So this returns "Singleton Instance" only, which is already pointed to object (X) so these 3 objects will refer to "COMMON OBJECT" & this is called = SINGLETON

        z.str = z.str.toLowerCase();  //First we change Z to lower case with LowerCase() method then Store it on the other side of = in z.str
        //You can put reference variable inside () or use it without it to call constructor str

        System.out.println("*************************");

        System.out.println(x.str);  //If instantiated into an object then we can call them and print in PLS
        System.out.println(y.str);
        System.out.println(z.str);  //Now X is converted to lower case of the statement inside str and Y & Z will follow suit as they are pointed to the same object

    }
}



