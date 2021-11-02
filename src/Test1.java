import java.util.*;

enum Operation
{
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}
public class Test1 {

        public static double basicCalculator(Operation operation, int num1, int num2){
        double result = 0;

        if (operation == ADD) {
                // if operation = ADD, return the sum
                result = num1 + num2;
        } else if (operation == SUBTRACT) {
                result = num1 - num2;
        } else if (operation == MULTIPLY) {
                result = num1 * num2;
        } else if (operation == DIVIDE) {
                if (num2 == 0) {
                    System.out.println("Can't divide by 0");
                } else {
                    result = num1 / num2;
                }
        }

        return result;
    }
    }

    public static void main(final String[] args) {
        System.out.println(basicCalculator(Operation.DIVIDE, 1, 2));
    }
}
