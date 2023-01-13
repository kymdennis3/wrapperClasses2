public class Main {
    public static void main(String[] args) {

        /* wrapper class = provides a way to use primitive data types as reference data types
                           reference data types contain useful methods
                           can be used with collections (ex.ArrayList)
        */

        /* primitive    |      wrapper
        -------------------------------
        boolean              Boolean
        int                  Integer
        double               Double
        char                 Character

        Wrapper classes contain useful methods but also takes time to be accessed hence more time and processing power needed

        autoboxing = the automatic conversion that the Java Compiler makes between the primitive  data types and their corresponding object wrapper classes
        unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive.
         */

        Boolean a = true;
        Integer b = 123;
        Character c = '@';
        Double d = 3.14;
        String e = "Bro";

        if(a==true){
            System.out.println("This is true");
        }

    }
}