package pr4.pr4_3;

// Класс пользователя (покупателя)
class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Геттеры для получения информации о пользователе
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
