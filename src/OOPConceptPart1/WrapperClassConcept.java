package OOPConceptPart1;

public class WrapperClassConcept {

    public static void main(String[] args) {

        String x = "100";
        System.out.println(x+20);   //Here it's executed as string concatenation, result = the two int stands side by side as an Unified number = 10020  (Not adding 2 int)


        //This is called "Data Conversion" : String convert to Int:

        int i = Integer.parseInt(x); //Parseint() method parses int into integer, so this X will be converted into integer. Since x = string 100 it will be converted to int 100
        System.out.println(i+20); //Above code turn x = 100 into i then in the print line statement the two can added because now it is int so = 123

        //Wrapper Classes are: Integer, Double, Character, Boolean  (IDCB)

        //Now String to Double conversion:
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


        String u = "100A"; //**IQ: If you want to convert string into inger and the String is NOT pure by itself or integer is not pure numerical value then what will you get?
        Integer.parseInt(u); //Ans: You will get NumberFormatException (when it's hybrid and not pure in either one)


    }
}
