package OOPConceptPart1;

public class WrapperClassConcept {

    public static void main(String[] args) {

        String x = "100";
        System.out.println(x+20);   //Here it's executed as string concatenation, result = the two int stands side by side as an Unified number = 10020  (Not adding 2 int)


        //This is called "Data Conversion" : String convert to Int:

        int i = Integer.parseInt(x); //Parseint() method parses into integer, so this X will be converted into integer. Since x = string 100 it will be converted to int 100
        System.out.println(i+20); //Above code turn x = 100 into i then in the PLS the two can be added because now both are int so = 120

        //Wrapper Classes are: Integer, Double, Character, Boolean  (IDCB)

        //Now String conversion to Double :
        String y = "12.33";
        double d = Double.parseDouble(y);
        System.out.println(d+10);


        //String to Boolean:
        String k = "true";
        boolean b = Boolean.parseBoolean(k);
        System.out.println(b);


        //Int to String conversion we use ValueOf() method
        int j = 200;
        System.out.println(j+20);  // this will give you = 220

        //I want to convert this J value into String
        String s = String.valueOf(j); //S takes the "Value of J" which is "200"
        System.out.println(s+20);
        //Now it is = 20020


        String t = "100"; //This is pure int converted to string
        System.out.println(t);

         //Below code will throw an exception as it should
        String u = "100A";
        //Integer.parseInt(u); //Comment in this code and you'll see NumberFormatException
        //**IQ: If you want to convert string into inger and the String is NOT pure by itself or integer is not pure numerical value then what
        // will you get?
        // Ans: You will get NumberFormatException (when it's combination of and not either int or string)


    }
}
