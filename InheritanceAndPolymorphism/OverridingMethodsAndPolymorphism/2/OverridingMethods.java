class FirstClass {
    private int key = 0;
    private String obj = "hi";

    void print() {
        System.out.println("key=" + key + ", obj=" + obj);
    }
    
    Number getValue(){
        return key;
    }
}

class ExtendedClass extends FirstClass {
    private double data = 1.7;

    // Переопределение метода обычное
    @Override
    void print() {
        super.print(); // Вызов метода родителя
        System.out.println("Дополнительно: " + data + "\n");
    }
    //Можно с возвращением наследуемого типа
    @Override
    Integer getValue(){
        return 100;
    }

    //ошибка - getValue() in ExtendedClass cannot override getValue() in FirstClass:
    // @Override
    //String getValue() { // Ошибка компиляции: type java.lang.String is not compatible with java.lang.Number
    //  return "строка";
    //}
}

public class OverridingMethods {
    public static void main(String[] args) {
        FirstClass obj = new ExtendedClass();
        // Вызовется переопределённый метод из ExtendedClass
        obj.print();
        System.out.println(obj.getValue());
        // Полиморфизм
        FirstClass[] objects = {
                new FirstClass(),
                new ExtendedClass()
        };

        for (FirstClass o : objects) {
            // Для каждого объекта вызовется своя версия метода
            o.print();
            System.out.println(o.getValue());
        }
    }
}
