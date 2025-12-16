// Интерфейс с default и static методами
interface MyInterface {

    // Абстрактный метод
    void doWork();

    // Default метод (неабстрактный)
    default void showInfo() {
        System.out.println("Default method from MyInterface");
    }

    // Static метод
    static int getValue() {
        return 58;
    }
}

// Класс, реализующий интерфейс
class MyClass implements MyInterface {

    @Override
    public void doWork() {
        System.out.println("MyClass is working");
    }
}

public class Main {
    public static void main(String[] args) {

        // Способы вызова методов:
        // Static метод - только по имени интерфейса
        int value = MyInterface.getValue();
        System.out.println("Static method result: " + value);

        // Через объект
        MyClass obj = new MyClass();
        obj.doWork();     // Абстрактный метод (переопределен)
        obj.showInfo();   // Default метод 

        // Через ссылку на интерфейс
        MyInterface ref = new MyClass();
        ref.doWork();     // Вызовется реализация из MyClass
        ref.showInfo();   // Default метод

        // Через анонимный класс с другой реализацией абстрактного и default метода
        MyInterface anonymous = new MyInterface() {
            @Override
            public void doWork() {
                System.out.println("Anonymous class working");
            }
            @Override
            public void showInfo() {
                System.out.println("Overridden showInfo in anonymous");
            }
        };
        anonymous.doWork();
        anonymous.showInfo();
    }
}
