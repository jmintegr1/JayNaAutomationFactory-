package CollectionFrameworkInJava;
                                        //This is a a test, it is ONLY A TEST!!


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static <E> void main(String[] args) {

        //Dynamic array -- ArrayList
        //1. can contain duplicated values/elements
        //2. Maintains Insertion order (Java organizing principle 0,1,2,3,4,5..... to maintain the order of the Array)
        //3. Non-Synchronized, it is NOT thread safe, that's why ArrayList is slow  |  IQ: Why ArrayList is slow?
        //4. Allows random access to fetch any element because it stores the values on the basis of Indexes

        int a[] = new int[3]; //This is Static array -- size is fixed, so can't go beyond that size  //What is Array Static?

        ArrayList ar = new ArrayList();  //Now in Java memory an object is created.. represented with ar which can hold multiple array,
                                        //We can go beyond the size in here (Non-Generic) cuz no square brackets & no limitation by [#] number in array)
        ar.add(10);//0                 //This is a dynamic array
        ar.add(20);//1
        ar.add(30);//2               //Using add() we can different insert values in the index

        System.out.println(ar.size());  //ar.size method is used to tally (count the total size of the Array)

        ar.add(40);//3      //So on the next day we added 3 more, no problem because it is dynamic Array.. it will expand by demand
        ar.add(50);//4
        ar.add(50);//5

        System.out.println(ar.get(4)); // .GET() method is used to get the value of particular array index position

        System.out.println(ar.size());  //Now updated array size shows it has grown in dynamic array


       //ArrayList object reference line 20, we haven't defined the generic, that is why it's called NON-GENERIC ArrayList object, cuz we
                                   //haven't defined anything here so we can use primitive & non-primitive aka Reference  data type as below
        ar.add(12.33); //6
        ar.add("Test"); //7
        ar.add('a');//8
        ar.add("true");//9
        ar.add(600);//10


        ar.remove(6);   //To remove index 6 use remove() method

        System.out.println(ar.size());

        System.out.println(ar.get(5)); //If you want to get the value of particular index then use get method with ar.GET( ));

        //System.out.println(ar.get(11)); //Will give exception: IndexOutOfBoundsException

        System.out.println("****************");

        //**IQ: How do you print all the values from ArrayList? Ans:
        //1. Use for loop
        //2. Using iterator

        for(int i=0; i<ar.size(); i++){
            System.out.println(ar.get(i));
        }

        //Non generic vs. generic:


        ArrayList<Integer> ar2 = new ArrayList<Integer>();  //<Integer> makes it GENERIC in java  (meaning only ONE type, specifying only Integer)
        ar2.add(100);
        //ar2.add("Test"); //This will give error cuz after making it generic for Integer only in angular brackets, it will can only take integer so it will NOT take String here

        ArrayList<String> ar3 = new ArrayList<String >(); //Now it is defined generic for String only
        ar3.add("Jewell");
        ar3.add("Selenium");
        //ar3.add(100); //This is not allowed because now in angular bracket it is defined for String only in this ar3 object

        System.out.println(ar2);
        System.out.println(ar3);


        System.out.println("****************");


        //**IQ What is the difference between Array  & ArrayList?


        ArrayList<E> ar4 = new ArrayList<E>(); //If we are NOT sure what kind of data type (so to keep it super FLEXIBLE we use <E> to leave it OPEN for different data type.
        // We can also define class object  | To keep it flexible, you have to put <E>, between static _ & void as well in line 8: public static <E> void main(String[] args){



        //****IQ: How to define the user-defined class object ArrayList?

        //Create Employee User Defined CLASS (Employees class below, open it and see name, age, & dept) and from there store the variables with the HELP of CONSTRUCTOR in this ArrayList object here
        //Employee class Objects:
        Employee e1 = new Employee("Jewell", 44, "QA");
        Employee e2 = new Employee("Naveen", 29, "Admin");
        Employee e3 = new Employee("Peter", 25, "Dev");


        //How do you print all the values from ArrayList? Ans:
        //1. Use for loop and with combination of iterator


        //IQ: How to create ArrayList for objects?
        ArrayList<Employee> ar5 = new ArrayList<Employee>();  //Put class name from above in angular brackets (to make it generic) then once it's instantiated then we can call w/ the help of instance variable & store the values
        ar5.add(e1);
        ar5.add(e2);
        ar5.add(e3);


         //Then Iterator to traverse the values:  | Iterator does NOT work on the basis of Index so we use "for loop" because they are stored on the basis of an Object

        Iterator<Employee> it = ar5.iterator();  //So we use Iterator Method W/help of WHILE Loop for above Employees ArrayList object to traverse the value & print them

        while(it.hasNext()){    //HasNext Method Creates the Iterator selection and CHECKS if the first value in the Array box is available here or NOT so hasNext will POINT to the first value

            Employee emp = it.next();   //NEXT Method will: "Return the NEXT element in line, in the Iteration" from the constructor above and so on... since the first value is E1 (employee type)
            //so we STORE it inside employee type reference variable here by making Employee emp =
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }

            //****IQ: How to store the specific user defined class object in a particular ArrayList?

           //In the User Defined Class in "Employee class" we created constructor with these 3 variables then back
          // here in ArrayListConcept to store the values by creating ArrayList Object then with the help of Iterator
         // we print all the values & we have to Iterate to traverse all the value from these 3 objects.


        System.out.println("**************");


        //addAll() method
        ArrayList<String> ar6 = new ArrayList<String>();
        ar6.add("test");  //add method
        ar6.add("Selenium");
        ar6.add("QTP");

        System.out.println(ar6);

        ArrayList<String> ar7 = new ArrayList<String>();
        ar7.add("dev");
        ar7.add("Java");
        ar7.add("JavaScript");

        System.out.println(ar7);


        //How will you merge two ArrayList? -- In ArrayList & other collections class we use .size() method. We ONLY use .length in Regular Array or Static arry
        ar6.addAll(ar7);          //Ans: addAll method will merge the two ar6 and ar7 object values together then it will be stored inside ar6 so they will be merged..
        for(int i=0; i<ar6.size(); i++){       //.. and with the help of for loop.
            System.out.println(ar6.get(i));   //Before ar6 had 3 values but after merge via .addALL() & for loop it will have 6 values
        }

        ArrayList<Integer> arz = new ArrayList<Integer>();
        arz.add(7);  //add method w/ Integer in angular brackets makes it generic for integer only
        arz.add(9);
        arz.add(11);

        System.out.println(arz);


        System.out.println("**************");

       //removeAll method:   Here we are removing all ar7 values from ar6 then using for loop, printing ony ar6 values so back to 3 values
        ar6.removeAll(ar7);
        for(int i=0; i<ar6.size(); i++){    //In Dynamic ArrayList we use .size() method to get total size
            System.out.println(ar6.get(i));
        }


        System.out.println("**************");


        //How do you check the COMMON or Intersecting parts?
        // Ans: we will check the intersecting part, the common value part by using retainAll() method with the help of for loop

        ArrayList<String> ar8 = new ArrayList<String>();
        ar8.add("test");
        ar8.add("Selenium");
        ar8.add("QTP");

        ArrayList<String> ar9 = new ArrayList<String>();        // Retain = Common value so retainAll() is keep All Common parts
        ar9.add("test");
        ar9.add("Java");

        ar8.retainAll(ar9);   //**IQ: What will be printed in retainAll method? Ans: the COMMON VALUES from the two objects, so ans is: test
        for(int i=0; i<ar8.size(); i++){
            System.out.println(ar8.get(i));

        }
    }
}
