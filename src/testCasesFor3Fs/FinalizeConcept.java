package testCasesFor3Fs;

public class FinalizeConcept {
                              //**IQ: What is finalize?
    public void finalize(){  //finalize is a method, we don't have to call this finalize method, it will be automatically called to CLEAN UP PROCESS
        System.out.println("finalize method");  //just before the object is garbage collected
    }



    public static void main(String[] args) {


        FinalizeConcept f1 = new FinalizeConcept();

        FinalizeConcept f2 = new FinalizeConcept(); //we created two objects

        f1 = null;
        f2 = null; //Now if we write this code with NULL now we have blank objects without any reference, basically null severed the tie with objects
                     //Then garbage collector will automatically be called to destroy all objects without reference
        System.gc(); //If we want to Manually calling the garbage collector


        //IQ: What is the purpose of finalize? Ans: Just before the garbage collector, automatically the finalized method will be called for clean up process of unreferenced object.

        //The garbage collector method will come in and clean up by destroying the objects that does not have any references (no one is is using
        // it) to make space in Java memory


    }
}
