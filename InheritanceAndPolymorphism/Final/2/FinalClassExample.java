final class FinalClass {
    public void display() {
        System.out.println("метод final класса");
    }
}

// ошибка - нельзя наследовать от final класса
/*class NewClass extends FinalClass {
    @Override
    public void display() {
        System.out.println("переопределён в подклассе наследуемом от final класса");
    }
}*/

// обычный класс
class NormalClass {
    public void test() {
        System.out.println("метод обычного класса");
    }
}

// можно наследовать от обычного класса
class SubClass extends NormalClass {
    @Override
    public void test() {
        System.out.println("переопределён в подклассе наследуемом от обычного класса");
    }
}

public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass obj1 = new FinalClass();
        obj1.display(); // метод final класса

        /*NewClass obj2 = new NewClass();
        obj2.test();*/

        NormalClass obj3 = new NormalClass();
        obj3.test();    // метод обычного класса

        SubClass obj4 = new SubClass();
        obj4.test();    // переопределён в подклассе наследуемом от обычного класса
    }
}
