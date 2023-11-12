package pr22;

import java.util.Stack;

public class RPNCalculator {
    // ����� ��� ���������� RPN-���������

    public static double evaluateRPN(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isNumber(token)) {
                // ���� ����� �������� ������, �������� ��� � ����
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                // ���� ����� �������� ����������, ��������� �������� ��� ����� �������� ���������� �����
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("�������� ���������");
                }
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(operand1, operand2, token);
                stack.push(result);
            } else {
                // ���� ����� �� �������� �� ������, �� ����������, ����������� ����������
                throw new IllegalArgumentException("����������� ������: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("�������� ���������");
        }

        return stack.pop();
    }

    // ����� ��� ��������, �������� �� ������ ������
    private static boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // ����� ��� ��������, �������� �� ������ ���������� (+, -, *, /)
    private static boolean isOperator(String token) {
        return token.matches("[+\\-*/]");
    }

    // ����� ��� ���������� �������� ����� ����� ���������� � ����������� �� ���������
    private static double performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("������� �� ����!");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("�������� ��������!: " + operator);
        }
    }

    public static void main(String[] args) {
        String rpnExpression = "2 3 4 5 6 * + - /";
        double result = evaluateRPN(rpnExpression);
        System.out.println("Result: " + result);
    }
}

/*
"2 3 4 5 6 * + - /"
��������� ������������ �� �������� -0,064516129032258(064516129032258)
*/