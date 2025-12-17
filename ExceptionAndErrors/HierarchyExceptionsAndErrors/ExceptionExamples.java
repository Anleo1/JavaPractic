public class ExceptionExamples {
    // Метод, который бросает IllegalArgumentException
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным ");
        }
        System.out.println("Возраст установлен: " + age);
    }

    public static void main(String[] args) {

        // ArithmeticException - арифметическая ошибка
        try {
            int result = 148 / 0; // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException - выход за границы массива
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[6]); // Доступ к несуществующему индексу
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        //IllegalArgumentException - недопустимый аргумент
        try {
            setAge(-5); // Передача отрицательного возраста
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        // ClassCastException - ошибка приведения типа
        try {
            Object obj = "Hello";
            Integer number = (Integer) obj; // Попытка привести строку к Integer
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }

        // NullPointerException - обращение к null
        try {
            String text = null;
            System.out.println(text.length()); // Вызов метода у null
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        System.out.println("\nПродолжение работы после обработки исключений");
    }
}
