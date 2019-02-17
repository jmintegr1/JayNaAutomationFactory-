package CollectionFrameworkInJava;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

    public static void main(String[] args) {

        //It is similar to HashMap but HashTable is synchronized
        //It stores the value on the basis of key &  value, NOT index, that is in ArrayList
        //*******Key--> Object -- HashCode --> Value******

        Hashtable h1 = new Hashtable();
        h1.put("A", "Tom");      //put is a method to access through object reference
        h1.put("B", "Nathan");  //Key 1st, Value 2nd
        h1.put("C", "Java");

        System.out.println(h1.size());

        h1.put(1, 100);
        h1.put(2, 200);

        System.out.println(h1.size());  //Here getting the size of

        System.out.println(h1.get(2));  //Now want to "get" the "value" of specific key

        System.out.println(h1.get("C"));

        System.out.println(h1.get("A"));

        h1.put(3, "Jewell"); //Here we have did opposite combo, instead of letter as key we put number 3 as key & value as Jewell


     /*   //But if you want to restrict to Key & Value, it should be only integer for both then do:
        Hashtable<Integer, Integer> h2 = new Hashtable<Integer, Integer>();
        h2.put(1, 100);
        //h1.put("A", 200); //This will not work because we restricted it with 2 integer

        Hashtable<Integer, String> h3 = new Hashtable<Integer, String>();

        h3.put(1, "Nathan");

        Hashtable<Integer, String> h4 = new Hashtable<Integer, String>();

        h4.put(1, "Nathan");

        Hashtable<String, String> h5 = new Hashtable<String, String>();

        h5.put("Tom", "Natahn");


        //Create a clone copy/shallow copy:


        Hashtable h2 = new Hashtable();

        h2 = (Hashtable) h1.clone();

        System.out.println("The values from h1: " + h1);
        System.out.println("The values from h2: " + h2);

        h1.clear();
        System.out.println("The values from h1: " + h1);
        System.out.println("The values from h2: " + h2);



        //Contains values:


        Hashtable st = new Hashtable();
        st.put("A", "Naveen");
        st.put("B", "Jewell");
        st.put("C", "Selenium");

        if (st.containsValue("Naveen"))
            System.out.println("value is found");

        //How to print all the values from HashTable using -- using Enumeration -- elements()?

        Enumeration e = st.elements();
        System.out.println("Print values from st using enumeration");

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }


        //Get all the values from HasTable using --entrySet() -- set of HashTable values:

        System.out.println("Print values from st using entry set");

        Set s = st.entrySet();
        System.out.println(s);


        Hashtable st1 = new Hashtable();
        st1.put("A", "Naveen");
        st1.put("B", "Jewell");
        st1.put("C", "Selenium");
        st1.put("C", "Selenium");//It contains only unique values
        //It does not contain null key and null values

        //st1.put("c", null); //IQ, important
        // With null key or values it will give you: null pointer exception
        //But in HashMap it is allowed, multiple null values and 1 null key is allowed in HashMap


        System.out.println("values from st1:");
        System.out.println(st1);


        System.out.println(st1);

        //How to check both HashTables are equal or not?
        if (st.equals(st1))
            System.out.println("both are equal");
        else
            System.out.println("fuck no, both are not equal!!");


        //How to get the value from a key?
        System.out.println(st1.get("B"));


        //How do you get the Hascode from a HashTable object?
        System.out.println("The HashCode value of st1: " + st1.hashCode());


        //If you want define specific to Generics:
        Hashtable<String, String> st3 = new Hashtable<String, String>();
        */
    }
}
