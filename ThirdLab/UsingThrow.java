package ThirdLab;

/**
 * UsingThrow
 */
public class UsingThrow {

    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("NO voting for you");
        }
        else{
            System.out.println("you may vote");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
}