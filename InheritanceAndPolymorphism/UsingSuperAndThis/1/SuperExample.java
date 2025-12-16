class Parent {
    String name = "родитель";

    Parent() {
        System.out.println("конструктор родителя");
    }

    void show() {
        System.out.println("метод родителя: " + name);
    }
}

class Child extends Parent {
    String name = "ребёнок";

    Child() {
        super(); // вызов конструктора суперкласса
        System.out.println("конструктор ребёнка");
    }

    void display() {
        System.out.println("поле родителя: " + super.name); //доступ к полю суперкласса
        System.out.println("поле ребёнка: " + this.name);
    }

    @Override
    void show() {
        super.show(); // доступ к методу суперкласса
        System.out.println("метод ребёнка: " + name);
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        child.show();
    }
}
