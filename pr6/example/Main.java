package pr6.example;

// Использование интерфейса: третьим пользователем
class Main {
    public static void main (String args []) {
        Drawable d = new Circle ();
/* В реальном сценарии объект предоставляется методом,
например, getDrawable () */
        d.draw ();
    }}