import package1.A;
import package1.B;
import package2.C;
public class TestAccess {
    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println("main видит public: " + obj1.publicVar);
        obj1.showAll();
        B obj2 = new B();
        C obj3 = new C();
        obj2.testB();
        obj3.testC();


    }
}
