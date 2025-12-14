public class NullPointerExceptionExample {
    public static void main(String[] args) {
        System.out.println("NullPointerException возникает при распаковке null\n");

        // Автораспаковка null
        Integer nullInteger = null;

        try {
            int primitive = nullInteger; // NullPointerException!
        } catch (NullPointerException e) {
            System.out.println("NPE при автоупаковке null Integer: " + e.getMessage());
        }

        // Арифметические операции
        Integer null_int = null;

        try {
            int result = null_int + 10; // Сначала распаковка a, потом сложение
        } catch (NullPointerException e) {
            System.out.println("NPE при сложении null + 10: " + e.getMessage());
        }

        // Сравнение
        Integer b = null;

        try {
            boolean comparison = (b == 5); // Распаковка b для сравнения
        } catch (NullPointerException e) {
            System.out.println("NPE при сравнении null с примитивом: " + e.getMessage());
        }
    }
}
