class SimpleClass{
    private int key;
    private String obj;

    // Перегрузка конструкторов
    SimpleClass() {
        this.key = 0;
        this.obj = "default";
    }

    SimpleClass(int key) {
        this.key = key;
        this.obj = "default";
    }

    SimpleClass(int key, String obj) {
        this.key = key;
        this.obj = obj;
    }

    void print() {
        System.out.println("key=" + key + ", obj=" + obj);
    }
}

public class OverloadingMethods {
    public static void main(String[] args) {
        SimpleClass obj1 = new SimpleClass();
        SimpleClass obj2 = new SimpleClass(1);
        SimpleClass obj3 = new SimpleClass(2, "test");

        obj1.print();
        obj2.print();
        obj3.print();
    }
}
