class OuterClass2 {
    private String privateField = "приватное поле внешнего";
    String packageField = "поле с доступом по умолчанию";
    protected String protectedField = "защищенное поле";
    public String publicField = "публичное поле";

    // Приватный метод внешнего класса
    private void privateOuterMethod() {
        System.out.println("Приватный метод внешнего класса");
    }

    // Публичный метод внешнего класса
    public void publicOuterMethod() {
        System.out.println("Публичный метод внешнего класса");
    }

    // Защищённый метод внешнего класса
    protected void protectedOuterMethod() {
        System.out.println("Защищённый метод внешнего класса");
    }

    // Метод (без модификатора) внешнего класса
    void packagePrivateOuterMethod() {
        System.out.println("Метод (без модификатора) внешнего класса");
    }

    // Внутренний класс
    public class InnerClass {
        private String innerField = "поле внутреннего класса";

        public void accessOuterMembers() {

            // Доступ ко всем полям внешнего класса
            System.out.println(privateField);
            System.out.println(packageField);
            System.out.println(protectedField);
            System.out.println(publicField);

            // Доступ ко всем методам внешнего класса
            privateOuterMethod();
            publicOuterMethod();
            protectedOuterMethod();
            packagePrivateOuterMethod();

            // Можно получить ссылку на внешний объект
            System.out.println("\nСсылка на внешний объект: " + OuterClass2.this);
        }
    }
}

public class OuterInner2{
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();

        inner.accessOuterMembers();

    }
}
