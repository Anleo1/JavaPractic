class ClassA {
    private static String staticField = "Статическое поле внешнего класса";
    private String instanceField = "Нестатическое поле внешнего класса";

    // Вложенный статический класс
    public static class NestedClass {
        public void show() {
            // Доступ только к статическим членам внешнего класса
            System.out.println("Доступ к статическому полю: " + staticField);
            //System.out.println(instanceField); // ошибка - нельзя обратиться к нестатическому полю
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Способ вызова метода вложенного класса:
        ClassA.NestedClass nested = new ClassA.NestedClass();
        nested.show();
    }
}
