class InvalidInputException extends Exception {

    // Конструктор с сообщением
    public InvalidInputException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class UserRegistration {
    public static void registerUser(String username)
            throws InvalidInputException {

        if (username == null || username.trim().isEmpty()) {
            throw new InvalidInputException("Имя пользователя не может быть пустым");
        }

        if (username.length() < 3) {
            IllegalArgumentException cause = new IllegalArgumentException("Длина имени " + username.length() + " символов");
            throw new InvalidInputException("Имя пользователя должно быть не короче 3 символов", cause);
        }

        System.out.println("Пользователь " + username + " успешно зарегистрирован");
    }

    public static void main(String[] args) {
        try {
            registerUser("Anastasia");  

        } catch (InvalidInputException e) {
            System.out.println("Ошибка регистрации: " + e.getMessage());

            // Проверяем, есть ли причина
            if (e.getCause() != null) {
                System.out.println("Причина ошибки: " + e.getCause().getMessage());
            }
        }
        try {
            registerUser("");       // InvalidInputException

        } catch (InvalidInputException e) {
            System.out.println("Ошибка регистрации: " + e.getMessage());

            // Проверяем, есть ли причина
            if (e.getCause() != null) {
                System.out.println("Причина ошибки: " + e.getCause().getMessage());
            }
        }
        try {
            registerUser("An");       // InvalidInputException с причиной

        } catch (InvalidInputException e) {
            System.out.println("Ошибка регистрации: " + e.getMessage());

            // Проверяем, есть ли причина
            if (e.getCause() != null) {
                System.out.println("Причина ошибки: " + e.getCause().getMessage());
            }
        }
    }
}
