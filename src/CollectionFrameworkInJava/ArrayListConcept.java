package CollectionFrameworkInJava;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static <E> void main(String[] args) {

        //Dynamic array -- ArrayList
        //1. can contain duplicated values/elements
        //2. Maintains insertion order, Java organizing principle 0,1,2,3,4,5..... to maintain the order of the Array
        //3. Not Synchronized, not thread safe, that's why ArrayList is slow
        //4. Allows random access to fetch any element because it stores the values on the basis of indexes

        int a[] = new int[3]; //This is Static array -- size is fixed, so can't go beyond that size

        ArrayList ar = new ArrayList();  //Now in Java memory an object is created.. represented with ar which can hold multiple array,
                                           // we can go beyond the size  (non-generic cuz no description in wrapper)
        ar.add(10);//0
        ar.add(20);//1
        ar.add(30);//2

        System.out.println(ar.size());  //ar.size method is used to length the size of the array

        ar.add(40);//3      //So on the next day we added 2 more, no problem
        ar.add(50);//4
        ar.add(50);//5

        System.out.println(ar.get(4)); // ar.GET method is used to the value of particular array position

        System.out.println(ar.size());  //Now updated array size shows it grows in dynamic array


       //ArrayList object reference line 18, we haven't defined the generic, that is why it's called NON-GENERIC ArrayLsit object, cuz we
                                         //haven't defined anything here so we can use primitive & non-primitive (reference) data type as below
        ar.add(12.33); //6
        ar.add("Test"); //7
        ar.add('a');//8
        ar.add("true");//9
        ar.add(600);//10


        ar.remove(10);

        System.out.println(ar.size());

        System.out.println(ar.get(5)); //If you want to get the value of particular index then use get method with ar.GET( ));

        //System.out.println(ar.get(11)); //Will give exception: IndexOutOfBoundsException

        //To print all the values from ArrayList:
        //1. Use for loop
        //2. Using iterator

        for(int i=0; i<ar.size(); i++){
            System.out.println(ar.get(i));
        }

        //Non generic vs. generic:


        ArrayList<Integer> ar2 = new ArrayList<Integer>();  //<Integer> makes it generic in java  (meaning only ONE type, only Integer)
        ar2.add(100);
        //ar1.add("Test"); //This will give error cuz after making it generic for Integer only in/wrapper class, it can only take integer so String will not do

        ArrayList<String> ar3 = new ArrayList<String >(); //Now it is defined generic for String only
        ar.add("Jewell");
        ar.add("Selenium");
        //ar3.add(100); //This is not allowed because now the wrapper class is set for String only


        //**IQ What is the difference between Array  & ArrayList?


       ArrayList<E> ar4 = new ArrayList<E>(); //Not sure what kind of data type (to keep it open so we use <E> to leave it flexible both data type
        //We can also define class object  | To keep if flexible you have to put <E> above, front of Main line 8: public static <E> void main(String[] args){

        //****How to define the user-defined class object ArrayList?

        //Create Employee User Defined CLASS and from there store the variables with help of constructor in this ArrayList object
        //Employee class Objects:
        Employee e1 = new Employee("Jewell", 43, "QA");
        Employee e2 = new Employee("Naveen", 29, "Admin");
        Employee e3 = new Employee("Peter", 25, "Dev");

        //IQ: How to create ArrayList for objects?
        ArrayList<Employee> ar5 = new ArrayList<Employee>();  //Put object name from above into the wrapper class, once instantiated then we can call & store the values
        ar5.add(e1);
        ar5.add(e2);
        ar5.add(e3);

         //Iterator to traverse the values:
        Iterator<Employee> it = ar5.iterator();  //Use Iterator W/help of WHILE Loop for above Employees ArrayList to traverse the value & print them
        while(it.hasNext()){    //HAS METHOD
            Employee emp = it.next();   //NEXT METHOD
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }
            //***IQ: How to store the specific user defined class object in a particular ArrayList?



        System.out.println("**************");



        //addAll() method
        ArrayList<String> ar6 = new ArrayList<String>();
        ar6.add("test");  //add method
        ar6.add("Selenium");
        ar6.add("QTP");

        ArrayList<String> ar7 = new ArrayList<String>();
        ar7.add("dev");
        ar7.add("Java");
        ar7.add("JavaScript");

                                   //How will you merge two ArrayList?
        ar6.addAll(ar7);          //Ans: addAll method will merge the two ar6 and ar7 object values together then will be stored inside ar6, so they will merged
        for(int i=0; i<ar6.size(); i++){
            System.out.println(ar6.get(i));   //Before ar6 had 3 values but after merge via the for loop it will have 6 values
        }




        System.out.println("**************");

       //removeAll method:   Here we are removing all ar7 values from ar6 = printing ony ar6 values
        ar6.removeAll(ar7);
        for(int i=0; i<ar6.size(); i++){
            System.out.println(ar6.get(i));
        }


        System.out.println("**************");



        //Now we will check the intersection part, the common part so use: retainAll() method

       ArrayList<String> ar8 = new ArrayList<String>();
        ar8.add("test");
        ar8.add("Selenium");
        ar8.add("QTP");

        ArrayList<String> ar9 = new ArrayList<String>();
        ar9.add("test");
        ar9.add("Java");

        ar8.retainAll(ar9);   //IQ: What will be printed in retainAll method? Ans: the common values from the two objects, so ans is: test
        for(int i=0; i<ar8.size(); i++){
            System.out.println(ar8.get(i));
        }

    }
}
