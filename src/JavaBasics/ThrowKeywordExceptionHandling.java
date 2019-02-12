package JavaBasics;                  //Take screen shot Exception handling time 45:08

public class ThrowKeywordExceptionHandling {  //**IQ: What is the difference between throws & throw?

    public static void main(String[] args) {  //Throw keyword is used when you have to throw exception "deliberately" cuz exception is not in Java and I want to customize it
                                             //Throws exceptions are found in Java
        System.out.println("ABC");

        try {     //Throw key must be surrounded around by try & catch block
            throw new Exception("Jewell Exception");
        } catch (Exception e) {
            e.printStackTrace();
        }

       //Throw new Exception("Jewell Exception");  ||  //This exception will not be handled so use try & block like above

        System.out.println("PQR");

        String Exec_Flag = " ";
        if(Exec_Flag.equals(" ")){
            try {
                throw new Exception("Exec flag is Blank Exception");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("TEST"); //Will also handle abnormal termination of program if handled by try & catch block

    }
}
