package pr22;

import java.util.Stack;

public class RPNCalculator {
    // Метод для вычисления RPN-выражения

    public static double evaluateRPN(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isNumber(token)) {
                // Если токен является числом, помещаем его в стек
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                // Если токен является оператором, выполняем операцию над двумя верхними элементами стека
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Неверное выражение");
                }
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(operand1, operand2, token);
                stack.push(result);
            } else {
                // Если токен не является ни числом, ни оператором, выбрасываем исключение
                throw new IllegalArgumentException("Невозможный символ: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Неверное выражение");
        }

        return stack.pop();
    }

    // Метод для проверки, является ли строка числом
    private static boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Метод для проверки, является ли строка оператором (+, -, *, /)
    private static boolean isOperator(String token) {
        return token.matches("[+\\-*/]");
    }

    // Метод для выполнения операции между двумя операндами в зависимости от оператора
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
                    throw new ArithmeticException("Деление на ноль!");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Неверный оператор!: " + operator);
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
результат калькулятора на телефоне -0,064516129032258(064516129032258)
*/