public class Formatting {
    public static void main(String[] args) {
        String name = "Anastasia";
        int course = 3;
        boolean isStudent = true;
        double num = 5.3723498;
        char symbol = 'R';


        // %s — строка
        System.out.printf("Name: %s%n", name);

        // %d — десятичное целое число
        System.out.printf("Курс: %d%n", course);

        // %b — логическое значение
        System.out.printf("Student: %b%n", isStudent);

        // %c — символ
        System.out.printf("Символ: %c%n", symbol);

        // %f — число с плавающей точкой
        System.out.printf("Число с плавающей точкой: %.4f%n", num);
    }
}
