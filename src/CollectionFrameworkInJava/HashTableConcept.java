package CollectionFrameworkInJava;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

    public static void main(String[] args) {

//        ***IQ: What is the difference between HashMap vs. HashTable?
//
//        HashTable IS "Synchronized" where as HashMap is Non-Synchronized
//        So HashTable is thread safe so it's sequential threading as one thread at a time can get access therefore performance is slower
//        If we want to improve performance then we don't use HashTable, rather use HashMap
//        HashTable -- is an implementation of Map interface, it stores information on the basis of keys & value, in the HashCode of an object.
//        //A NON-Null object CAN be used as a KEY and as a VALUE
//        It stores the values on the basis of key & value, NOT index which is in ArrayList
//
          System.out.println("***Key--> Object -- HashCode --> Value***");
//
//        In HashTable the Key is stored on the form of an Object and each & Every Object inside Java have an Unique Identifier which is called
//        the HashCode.
//        **IQ: What you mean by HashCode?
//        HashCode is a Java Object Number (JON), whenever we create an object, Java provides particular HashCode for that specific object, so
//        Java object is defined by a unique identifier (number) and that # is called HashCode number.


        Hashtable h1 = new Hashtable();
             //Key, Value
        h1.put("A", "Tom");      //put() is a Method to add through object reference
        h1.put("B", "Nathan");  //Key 1st, Value 2nd
        h1.put("C", "Java");
        h1.put(3, "Python");  //Key can be Integer as WELL

        System.out.println(h1.size());

            //Key, Value
        h1.put(1, 100);
        h1.put(2, 200);

        System.out.println(h1.size());  //After adding 2 more, now getting the size of it increases it

        System.out.println(h1.get(2));  //Now want to "GET" the "value" of specific key = 2
        System.out.println(h1.get(1));

        System.out.println(h1.get("C"));

        System.out.println(h1.get("A"));

        h1.put(3, "Jewell"); //Here we did opposite combo, instead of letter as key we put number int 3 as key & value as String Jewell

        System.out.println("****************");

        //But if you want to restrict to Key & Value, it should be only integer for both then do:

        Hashtable<Integer, Integer> h2 = new Hashtable<Integer, Integer>(); //Make it generic & restrict for integer only
        h2.put(1, 100);
        System.out.println("The value of h2 = " + h2);

        h1.put("A", 200); //Now PutMethod will not work because we restricted it with 2 integers in h2 object so will not add Int and String for h2

        Hashtable<Integer, String> h3 = new Hashtable<Integer, String>();

        h3.put(1, "Nathan");    //It will take both int & string now because we defined it in angular bracket
        System.out.println("The value of h3 = " + h3);

        Hashtable<Integer, String> h4 = new Hashtable<Integer, String>();

        h4.put(1, "Hotdog");
        System.out.println("The value of h4 = " + h4);

        Hashtable<String, String> h5 = new Hashtable<String, String>();

        h5.put("Tom Eats", "Natahn's Hotdog");
        System.out.println("The value of h5 = " + h5);

        Hashtable<String, Integer> h7 = new Hashtable<String, Integer>();

        h7.put("I love keto carnivore", 10 );
        System.out.println("The value of h7 = " + h7);



        System.out.println("*****************");


        //How to create a clone copy/shallow copy:

        Hashtable h6 = new Hashtable(); //1st make an object

        //#2 Clone h1 by h6 using clone method
        h6 = (Hashtable) h1.clone(); //Answer: We have to type cast into HashTable, now h6 will get all the 4 values from h1
        //h6 = (Hashtable) h1.clone();

        System.out.println("The values from h1 to h6 after clone: " + h1);
        System.out.println("The values of h6 same as h1 after clone: " + h6); //Here the values of h1 is given to h2, since h6 now have identical values as h1 so it prints the same values as above

        h1.clear();  //Clear method takes out all the values from h1
        System.out.println("The values from h1: " + h1); //So now h1 will show empty

        h6.clear();
        System.out.println("The values from h6: " + h6);


        System.out.println("*****************");


        //Methods called.. Contains values:

        Hashtable st = new Hashtable();
        st.put("A", "Naveen");
        st.put("B", "Jewell");
        st.put("C", "Selenium");   //Given 3 values in this HashTable object
        //st.put("D", "Supreme"); // W/ or W/Out

        // now want to check weather a value exist or NOT
        if (st.containsValue("Jewell"))
            System.out.println("Value is Fing found using constainsValue() method = Jewell");
        else
            System.out.println("The value is not Fucking here so not found");

        if (st.containsValue("Bullshit"))
            System.out.println("Value is Fing found using constainsValue method = Bullshit");
        else
            System.out.println("Value Bullshit is not there in st reference object variable so not found, that's that shit ain't right!!!");


        //How to print all the values from HashTable using -- using Enumeration & elements() method?

        //1st Method to print values from HashTable
        Enumeration e = st.elements();  //st.elements() method returns an enumeration of the values in this HashTable, use this method on the returned object to fetch elements sequentially
        System.out.println("Below you'll see values printed using enumeration and elements() method: ");

        //2d in While  use e to call hasMoreElements method
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement()); //Finally e to call nextElement method to print each and every element sequentially
        }

        System.out.println("******************");
        //Get all the values from HasTable using --entrySet() -- return set of HashTable values:

        //Method to print the values from HashTable
        System.out.println("Print values from st Object reference using entrySet(): ");

        //A Set is a Collection that cannot contain duplicate elements. It models the mathematical set abstraction. The Set interface contains
        // only methods inherited from Collection and adds the restriction that duplicate Elements are prohibited.
        Set s = st.entrySet(); //Using St ORV to call entry() method
        System.out.println(s);


        System.out.println("*****************");


        Hashtable st1 = new Hashtable();

        st1.put("A", "Naveen");
        st1.put("B", "Jewell");
        st1.put("C", "Selenium");
        st1.put("C", "Selenium"); //It contains only UNIQUE values, since "C" is already used so when printed Selenium will not print twice
        // since it is HashMap


        //***IQ: Is Null key or Null values allowed in HashTable?
        //HashTable does NOT allow Null Key or Null Values

        //st1.put("c", null); //NO Null value in HashTable
        //st1.put(null, "Selenium"); //NO Null key in HashTable
        //If you comment in line 158, with null key or values it will give you: NullPointerException
        //But in HashMap Multiple null VALUES and 1 null key is ALLOWED.. NOT in HashTable, NO NULL Key or Values allowed in HashTable!!

        System.out.println("values from st1: " + st1);
        System.out.println(st1); //This also works, leaving above blank & put (st1) inside here
        // Will NOT print Selenium 2 times even tough it is written twice above because in HashTable (unlike in Array) it ONLY contains
        // Unique elements so called only once


        System.out.println("*****************");


        //How to check both HashTables are equal or NOT?   Ans: User equals()
        if (st.equals(st1)) //Use OVR then call equals() pass in what we want to compare, st = st.1
            System.out.println("both objects are equal");
        else
            System.out.println("fuck no, both are not equal!!");


        System.out.println("*****************");


        //IQ: How to get the value from a specific key?
        System.out.println(st1.get("B")); //In PLS pass in OVR, use get() method and pass the key inside get()


        //IQ: How do you get the Hashcode from a HashTable object?
        System.out.println("The HashCode value of st1: " + st1.hashCode()); //Object reference variable then call hashCode() method


        //If you want define a Hashtable or HashMap to Generic:
        Hashtable<String, String> st3 = new Hashtable<String, String>();

        System.out.println(st3);  //Without assinging keys & values you just get the HashTable symbol

    }
}
