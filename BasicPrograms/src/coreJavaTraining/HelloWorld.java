package coreJavaTraining;

public class HelloWorld {

    static final int x = 4;
    int a=90;

    public void printName(){
        System.out.println("Hello");
    }

    public static void main(String[] args)
    { //the main block is the main execution entry point of a
        // Java Program
        System.out.println("Hello World!");
        System.out.println("My name is Sharmistha!"); //prints the next statement on the next line
        System.out.print("How are you?");
        System.out.print(" Glad to meet you!\n"); //does not print on the next line
        System.out.println(x);

        HelloWorld hellow = new HelloWorld();
        hellow.printName();
        System.out.println(hellow.a);
        hellow.a = 7890;
        System.out.println(hellow.a);
//        x = 789;
//        System.out.println(x);

    }
}
