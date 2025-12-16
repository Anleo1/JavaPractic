import java.util.StringJoiner;

public class StringJoinerClass {
    public static void main(String[] args) {
        // Пустое значение
        StringJoiner testSJ = new StringJoiner("-");
        testSJ.setEmptyValue("Empty");
        System.out.println(testSJ); // Empty
        // добавление
        testSJ.add("Один");
        System.out.println(testSJ); // Один
        testSJ.add("Два");
        System.out.println(testSJ);//Один-Два

        StringJoiner contSJ = new StringJoiner(", ", "[", "]");
        contSJ.add("Считалочка");
        contSJ.add("Значение");
        contSJ.add("Числа");
        System.out.println(contSJ);//[Считалочка, Значение, Числа]

        // объединение двух StringJoiner
        testSJ.merge(contSJ);
        System.out.println(testSJ);//Один-Два-Считалочка, Значение, Числа
    }
}
