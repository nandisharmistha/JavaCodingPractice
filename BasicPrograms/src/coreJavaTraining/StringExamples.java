package coreJavaTraining;

public class StringExamples {

    public static void main(String[] args){

        String a = "Hello"; //String literal -- in the background this creates an object a
        String b = "Hello";
        /* this value is same as defined for a object created above.
        So the variable b will be another reference to the above object.
        (This calls the intern() method on String which will first check the internal pool
        of available String objects for a similar value*/

        String ab  = new String("Hi I am a string");
        //String object, this force java to create a new object everytime.



    }
}
