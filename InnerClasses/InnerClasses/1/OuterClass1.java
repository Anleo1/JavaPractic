class OuterClass1 {

    // Публичный внутренний класс - доступен везде
    public class PublicInner {
        public void display() {
            System.out.println("PublicInner class");
        }
    }

    // Приватный внутренний класс - доступен только внутри OuterClass1
    private class PrivateInner {
        public void display() {
            System.out.println("PrivateInner class - доступен только внутри OuterClass1");
        }
    }

    // Внутренний класс с доступом по умолчанию
    class PackagePrivateInner {
        public void display() {
            System.out.println("PackagePrivateInner class");
        }
    }

    // Защищенный внутренний класс
    protected class ProtectedInner {
        public void display() {
            System.out.println("ProtectedInner class");
        }
    }

    // Метод для доступа к приватному внутреннему классу
    public PrivateInner createPrivateInner() {
        return new PrivateInner();
    }

}
public class OuterInner1{
    public static void main(String[] args) {
        OuterClass1 outer = new OuterClass1();

        // Публичный внутренний класс - доступен
        OuterClass1.PublicInner publicInner = outer.new PublicInner();
        publicInner.display();

        // Приватный внутренний класс - НЕ доступен напрямую
        //OuterClass1.PrivateInner privateInner = outer.new PrivateInner(); // Ошибка!
        //privateInner.display();

        // Внутренний класс с доступом по умолчанию - доступен в том же файле
        OuterClass1.PackagePrivateInner packageInner = outer.new PackagePrivateInner();
        packageInner.display();

        // Защищенный внутренний класс - доступен в том же файле
        OuterClass1.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.display();
    }
}
