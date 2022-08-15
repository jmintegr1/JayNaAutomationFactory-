package JavaBasics;

public class LocalVsGlobalVariables {

    //Gobal variable aka Class variable ir Instance Variable | They are defined immediately after the class
    String name = "Tom"; //NON-STATIC Global Variable
    int age = 25;
    String Whatever = "Jewell";

    public static void main(String[] args) {

        int i = 10;   //LOCAL variable for MAIN method is below MAIN & IS Static by nature
        String myFirstName = "Mohammed";
        String myLastName = "Mehedi";

        System.out.println(i); //Because it's inside main method I can call it directly without instantiating it cuz it's static by nature
        System.out.println(myFirstName);
        System.out.println(myLastName); //Local variable my names are called directly as well cuz...

        //So to access GLOBAL variable that are NON-STATIC then we have to create an object of their class name which is LovalVsGlobalVariables, so instantiate this class...

        LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
        System.out.println(obj.name);  //If you try to print variable name from class/global variable w/o instantiating it, will give you error cuz those are also global variables that are NOT static
        System.out.println(obj.age);
        System.out.println(obj.Whatever);

    }

    public void sum(){
        int i = 15;    //This is local variable for sum method
        int j =20;    //Main() & sum() method's variables are called local variables

    }
}
