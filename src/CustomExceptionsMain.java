public class CustomExceptionsMain {

    public static void main(String[] args) {
       int input = 2;
        try {
            method1();

        } catch (NumberTooLowException e) {


        }
    }

    public static void method1() throws NumberTooLowException {
        throw new NumberTooLowException();
    }
}


