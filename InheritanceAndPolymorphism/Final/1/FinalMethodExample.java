class Parent {
    public final void show() {
        System.out.println("метод родителя c final");
    }

    public void regular() {
        System.out.println("обычный метод родителя");
    }
}

class Child extends Parent {
    // можно переопределить обычный метод
    @Override
    public void regular() {
        System.out.println("переопределённый метод");
    }

    // нельзя переопределить final метод - ошибка
    // @Override
    // public void show() { }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.show();    // метод родителя c final
        parent.regular(); // обычный метод родителя

        Child child = new Child();
        child.show();    // метод родителя c final (не переопределён)
        child.regular(); // переопределённый метод
    }
}
