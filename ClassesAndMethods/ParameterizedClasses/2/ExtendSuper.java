class MyClass<T> {
    private T item;
    public MyClass(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }
}

public class ExtendSuper {
    // extends - чтение
    static void printValue(MyClass<? extends Number> my) {
        Number n = my.getItem(); // можно читать как Number
        // my.setItem(5); // нельзя писать - ошибка компиляции
        System.out.println("значение: " + n);
    }

    // super - добавление/запись
    static void setValue(MyClass<? super Integer> my, Integer value) {
        my.setItem(value); // можно писать Integer
        // Integer i = my.getItem(); // нельзя читать как Integer
        System.out.println("записали: " + value);
    }

    public static void main(String[] args) {
        MyClass<Integer> myInt = new MyClass<>(477);
        MyClass<Double> myDouble = new MyClass<>(7.4677);
        MyClass<Number> myNum = new MyClass<>(0);
        MyClass<Object> myObj = new MyClass<>(new Object());

        // <? extends Number> - только чтение
        System.out.println("extends: ");
        printValue(myInt); // Integer extends Number

        // пример с Double
        printValue(myDouble); // Double extends Number

        // <? super Integer> - только запись
        System.out.println("\nsuper: ");
        setValue(myNum, 344); // Number super Integer

        // пример с Object
        setValue(myObj, 455); // Object super Integer
    }
}
