package JavaBasics;

public class LocalVsGlobalVariables {

    //Gobal variable aka Class variable | They are defined immediately after the class
    String name = "Tom"; //NON-STATIC global variable
    int age = 25;

    public static void main(String[] args) {

        int i = 10;   //Local variable for MAIN method
        System.out.println(i); //Can be called directly without instantiating it

        LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
        System.out.println(obj.name);  //If you try to print variable name from class(global) variable it will give you error cuz those are also global variables
        System.out.println(obj.age);
        //So to access global variable that are NON-STATIC then we have to create an object of their class which is NaveensLovalVsGlobalVariables, so instantiate this class
    }

    public void sum(){
        int i = 15;    //This is local variable for sum method
        int j =20;    //These 2 variables are called local variables

    }
}
