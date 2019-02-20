package CollectionFrameworkInJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

    public static void main(String[] args) {


        LinkedList<String> ll = new LinkedList<String>();   // IQ: What are the different ways to print the values of LinkedList?

        //.add method to add string
        ll.add("test");
        ll.add("qtp");
        ll.add("selenium");
        ll.add("RPA");
        ll.add("RFT");

        //print:
        System.out.println("content of linkedlist are:" + ll);

        ll.addFirst("Jewell");  //addFirst method will put Jewell in the 1st of the chain in 0 array

        ll.addLast("Automation");

        System.out.println("content of Linkedlist are:" + ll);  //Now we'll get a print out of Jewell 1st and the Singly LinkedList of the above strings then Automation at the end


        //get Method
        System.out.println(ll.get(0));   //Get 1st value = Jewell, after addFirst method
        System.out.println(ll.get(3));
        System.out.println(ll.get(5));


        ll.set(0, "Shams");            //set Method is how we insert (Insertion), so before 0 was Jewell but now replaced w/ Shams
        System.out.println(ll.get(0));

        System.out.println("LinkedList is hugeeee as they are:" + ll); //Print all the values of ll

        ll.removeFirst();
        ll.removeLast();
        System.out.println("content of Linkedlist:" + ll);          //remove first & last element, now Jewell and Automation is taken off


        ll.remove(2);   //Now removing on basis of INDEX
        System.out.println("content of Linkedlist:" + ll);


        //***IQ: What are the different ways to print (ITERATE) the values of LinkedList?

        //Ans: 4 ways: 1) Using for loop 2) Advance for Loop 3) Iterator 4) While Loop


        System.out.println("*********** Using for loop to print values of LinkedList");
        for (int n = 0; n < ll.size(); n++) {
            System.out.println(ll.get(n));
        }


        //Using advance for loop   //This is also called for each loop

        System.out.println("****** Using Advance for loop");
        for (String str : ll) {    //STR stands for String of all the LinkedList object, what are the string available in this particular ll object..
            System.out.println(str);    //and please iterate and print one by one
        }


        //iterator
        System.out.println("********* Using Iterator");
        Iterator<String> it = ll.iterator();   //Start with putting Iterator in ll object by ll. (dot) and you'll get selection from window for iterator(), then this iterator() method will return
        while (it.hasNext()) {                  //iterator reference. So store in Iterator <-reference-> by putting = sign and placing Iterator on the other side of it, since Reference
            System.out.println(it.next());   //is String put String inside of Iterator, & import from Java.util
        }                                   //Finish it with While loop


        //while loop
        System.out.println("********* Using while loop");

        int num = 0;
        while (ll.size() > num) {
            System.out.println(ll.get(num));  //pick get(int index)
            num++;

        }

    }
}
