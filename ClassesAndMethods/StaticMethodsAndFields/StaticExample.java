class A {
    public static int a = 1;
    public static int b;
    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void callFromStatic() {
        // Без указания (из static контекста того же класса)
        printVars();
    }
}

public class StaticExample {
    public static void main(String[] args) {
        // Через имя класса
        System.out.println("A.printVars():");
        A.printVars();

        // Через объект
        System.out.println("\nЧерез объект:");
        A obj = new A();
        obj.printVars();

        // Из другого static метода того же класса
        System.out.println("\nИз callFromStatic():");
        A.callFromStatic();

    }
}
