public class StringMethods {
    public static void main(String[] args) {
        String str1 = "  Hello, World!  ";
        String str2 = "HELLO, WORLD!";

        System.out.println("Исходная строка: \"" + str1 + "\"");
        System.out.println("Строка 2: \"" + str2 + "\"");

        // charAt() - возвращает символ по индексу
        System.out.println("charAt(3): '" + str1.charAt(3) + "'");

        //length() - возвращает длину строки
        System.out.println("Длина строки: " + str1.length());
        
        // isEmpty() - проверяет, пустая ли строка
        System.out.println("isEmpty(): " + str1.isEmpty());

        // toUpperCase() - преобразует строку в верхний регистр
        System.out.println("toUpperCase(): \"" + str1.toUpperCase() + "\"");

        // toLowerCase() - преобразует строку в нижний регистр
        System.out.println("toLowerCase(): \"" + str1.toLowerCase() + "\"");

        // trim() - удаляет пробелы в начале и конце строки
        System.out.println("trim(): \"" + str1.trim() + "\"");

        // equals() - сравнивает строки с учетом регистра
        System.out.println("equals(\"Hello, World!\"): " + str1.trim().equals("Hello, World!"));//сначала нужно удалить пробелы, иначе - false

        // equalsIgnoreCase() - сравнивает строки без учета регистра
        System.out.println("equalsIgnoreCase(str2): " + str1.trim().equalsIgnoreCase(str2));

        // contains() - проверяет, содержит ли строка подстроку
        System.out.println("contains(\"World\"): " + str1.contains("World"));

        // replace() - заменяет символы в строке
        System.out.println("replace('l', 'L'): \"" + str1.replace('l', 'L') + "\"");

        // split() - разбивает строку на массив по разделителю
        System.out.println("split(\",\"):");
        String[] str = str1.trim().split(",");
        for (String part : str) {
            System.out.println("   \"" + part.trim() + "\"");
        }

        // concat() - объединяет строки
        System.out.println("concat(\" I woke up\"): \"" + str1.trim().concat(" I woke up") + "\"");
    }
}
