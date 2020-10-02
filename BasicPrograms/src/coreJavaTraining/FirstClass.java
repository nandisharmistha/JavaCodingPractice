package coreJavaTraining;

public class FirstClass {

    public void firstClassMethod(){
        System.out.println("In first class method");
    }

    public static void main(String[] args){
        System.out.println("In first class main");
        FirstClass first = new FirstClass();
        first.firstClassMethod();

        SecondClass second = new SecondClass();
        second.secondClassMethod();

    }
}
