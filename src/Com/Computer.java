package Com;

import java.io.Serializable;

/**
 * 实体模型，用于存储用户输入的数字和运算符
 */
public class Computer implements Serializable {
    private static final long serialVersionUID = 1L;

    private double operand1; // 第一个数字
    private double operand2; // 第二个数字
    private String operator; // 运算符
    double result;
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }



}
