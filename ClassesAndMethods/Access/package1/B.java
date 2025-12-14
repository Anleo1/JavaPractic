package package1;

public class B extends A {
    public void testB() {
        System.out.println("B видит: " + publicVar + " " + protectedVar + " " + defaultVar);
        // privateVar - не видно (ошибка компиляции)
    }
}
