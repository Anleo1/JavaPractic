import package1.A;
import package1.B;
import package2.C;
public class TestAccess {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        System.out.println("main видит public: " + obj1.publicVar); //остальное - ошибка
        obj1.showAll();
        obj2.testB();
        obj3.testC();
    }
}
