package pr19;

public class OnlinePurchase {
    public void processOrder(String name, String inn) throws InvalidINNException {
        // Проверяем введенный ИНН на действительность
        if (!isValidINN(inn)) {
            throw new InvalidINNException("Недействительный ИНН: " + inn);
        }
        // Другая логика для обработки заказа
        System.out.println("Заказ успешно обработан.");
    }

    private boolean isValidINN(String inn) {
        // Вернуть true, если ИНН действителен, иначе false
        return inn.matches("\\d{10}");
        /*Это регулярное выражение используется для проверки строки на наличие ровно 10 цифр подряд. */
    }

    public static void main(String[] args) {
        OnlinePurchase purchase = new OnlinePurchase();

        try {
            purchase.processOrder("Иван Иванов", "123456890"); // Попробуйте ввести недействительный ИНН
        } catch (InvalidINNException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}