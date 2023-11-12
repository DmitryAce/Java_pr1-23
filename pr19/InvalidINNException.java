package pr19;

public class InvalidINNException extends Exception {
    public InvalidINNException(String message) {
        super(message);
    }
}
/*Ключевое слово super в Java используется для обращения к членам суперкласса
(родительского класса) из подкласса (дочернего класса). */