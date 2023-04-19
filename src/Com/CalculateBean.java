package Com;

public class CalculateBean {
    public int calculate(int operand1, int operand2, String operator) {
        int result = 0;
        if (operator.equals("+")) {
            result = operand1 + operand2;
        } else if (operator.equals("-")) {
            result = operand1 - operand2;
        } else if (operator.equals("*")) {
            result = operand1 * operand2;
        } else if (operator.equals("/")) {
            if (operand2 != 0) {
                result = operand1 / operand2;
            }
        }
        return result;
    }
}

