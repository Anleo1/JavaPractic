package package2;

import package1.A;
public class C {
    public void testC() {
        A obj = new A();
        System.out.println("OtherClass видит: " + obj.publicVar);
        // protectedVar, defaultVar, privateVar - не видно
    }
}
