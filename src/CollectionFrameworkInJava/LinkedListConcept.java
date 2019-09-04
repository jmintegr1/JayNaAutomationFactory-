package CollectionFrameworkInJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

    public static void main(String[] args) {


        LinkedList<String> bb = new LinkedList<String>();  //LinkedList is data structure consisting of Nodes.
                                                          // Each node consist of data or value and references to the next node, only point forward

        //.add() method to add string
        bb.add("test");
        bb.add("qtp");
        bb.add("selenium");
        bb.add("RPA");
        bb.add("RFT");

        //print:
        System.out.println("content of linkedlist are: " + bb);

        bb.addFirst("Jewell");  //addFirst() method will put Jewell in the 1st index of the chain in an array.. so inside of Array 0

        bb.addLast("Automation"); //addLast() method

        System.out.println("updated content of Linkedlist are: " + bb);  //Now we'll get a print out of Jewell 1st and the Singly LinkedList of the above strings then Automation at the end


        //get() Method
        System.out.println(bb.get(0));   //Get 1st value of array = Jewell, AFTER addFirst() method
        System.out.println(bb.get(3));
        System.out.println(bb.get(5));


        System.out.println("***************");


        bb.set(0, "Shams");            //SET() Method is how we insert (Insertion), so before 0 was Jewell but now replaced w/ Shams
        System.out.println(bb.get(0));

        System.out.println("LinkedList is hugeeee as they are:" + bb); //Print all the values of bb

        bb.removeFirst();
        bb.removeLast();
        System.out.println("content of Linkedlist:" + bb);   //removeFirst() & lastElement(), now Shams and Automation is taken off


        bb.remove(2);   //Now removing on basis of INDEX
        System.out.println("content of Linkedlist after removing index 2 :" + bb);



        //***IQ: What are the different ways to print (ITERATE) the values of LinkedList?

        //Ans: 4 ways: 1) Using for loop 2) Advance for Loop 3) Iterator 4) While Loop


        //Using for loop
//        System.out.println("*********** Using for loop to print values of LinkedList");
//        for (int x = 0; x < bb.size(); x++) {
//            System.out.println(bb.get(x));
//        }
//
//
//        //Using advance for loop   // AKA = FOR EACH LOOP
//
//        System.out.println("*********** Using Advance for loop / Enhanced for loop / For Each Loop");
//         // (String str : bb) {           //STR stands for (it can be any String reference variable name) Strings of all the values
//         for(String str : bb){           //in the above LinkedList object, what are the strings available in this particular bb object
//            System.out.println(str);    //please iterate and print one by one.
//        }
//
//
//        //while loop
//        System.out.println("********** Using while loop");
//
        int num = 0;
        while (bb.size() > num) {
            System.out.println(bb.get(num));  //pick get(int index)
            num++;


        //Iterator    |   It's best to run Iterator by itself, so comment out the above then run or it messes up
//        System.out.println("********* Using Iterator to print LinkedList");
//        Iterator<String> it = bb. iterator();   //Start with putting Iterator in bb object by bb. and you'll get selection window for iterator() method, then this iterator() method will return
//        while (it.hasNext()) {                //iterator reference. So store in Iterator by <-reference-> and  putting = sign and placing Iterator on the other side of =  since <Reference>
//            System.out.println(it.next());   //is String so put String inside of Iterator <.....>, & import from Java.util
        }                                     //Finish it with While loop

    }

}
