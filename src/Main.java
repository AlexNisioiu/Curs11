import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {

            method1();
        } catch (Exception ignored) {

        }
        System.out.println("I hope this is printed! ");
    }

    public static void method1() throws Exception {
        System.out.println("Method 1");
        method2();
        System.out.println("Important stuff");

    }

    public static void method2() throws Exception {
        System.out.println("Method 2");
        try {
            method3(10);
        } catch (Exception e){
           try {
               method3(-3);
           }catch (FileNotFoundException ignored) {

           }
        }
        System.out.println("Important stuff");
    }

    public static void method22() throws FileNotFoundException {
        System.out.println("Method 2.2");
        method3();
        System.out.println("Important stuff");
    }

    public static void method3(int i) throws FileNotFoundException {
        System.out.println("Method 3");
        if (i > 0) {
            throw new Exception("this is a chechek");
        } else {
            System.out.println("WIN LOTERRY");
        }
    }


}