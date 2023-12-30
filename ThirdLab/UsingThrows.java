package ThirdLab;

public class UsingThrows {
    static void checkDifference() throws UserDefinedException{
        int firstNumber =10, secondNumber = 20;
        if (firstNumber<secondNumber) {
            String msg="string is -ve";
            throw new UserDefinedException(msg);
        }
        else{
            int result=firstNumber-secondNumber;
            System.out.println("The difference is = "+result);
        }
    }
    public static void main(String[] args) {
        try {
            checkDifference();
        } catch (UserDefinedException error) {
            System.out.println("Exception Caught");
            System.out.println("The error message is " + error.getMessage());
        }
    }
}
