package testCasesFor3Fs;

public class FinalizeConcept {
                              //**IQ: What is finalize?
    public void finalize(){  //finalize is a METHOD, we don't have to call this finalize method. It will be automatically called as a CLEAN UP PROCESS
        System.out.println("finalize method");  //just before the object is garbage collected
    }


    public static void main(String[] args) {


        FinalizeConcept f1 = new FinalizeConcept();

        FinalizeConcept f2 = new FinalizeConcept(); //we created two objects

        f1 = null;
        f2 = null;     //Now if we write this code with NULL, we have blank objects without any reference, basically null severed (cut) the tie with above objects references
                      //Then garbage collector will automatically be called to destroy all objects without references
        System.gc(); //If we want to Manually call the garbage collector
            //.gc() is a METHOD

        //IQ: What is the purpose of finalize? Ans: Just before the garbage collector, it automatically calls the finalized METHOD for clean up process of Unreferenced Object.
        //The garbage collector method will come in and clean up by destroying the objects that does not have any references (no one is is using
        // it) to make SPACE in Java MEMORY.
    }
}
