package package1;

public class A {
    public int publicVar = 1;        // доступно везде
    protected int protectedVar = 2;  // доступно в пакете + наследникам
    private int privateVar = 3;      // доступно только в этом классе
    int defaultVar = 4;              // доступно только в пакете (без спецификатора)

    public void showAll() {
        System.out.println("Внутри A: " + publicVar + " " + protectedVar + " " + privateVar + " " + defaultVar );
    }
}
