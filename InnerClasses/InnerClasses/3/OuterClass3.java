class OuterClass3 {

    class InnerClass {
        private String privateInnerField = "приватное поле внутреннего";
        String packageInnerField = "поле с доступом по умолчанию внутреннего";
        protected String protectedInnerField = "защищенное поле внутреннего";
        public String publicInnerField = "публичное поле внутреннего";

        //Приватный метод внутреннего класса
        private void privateInnerMethod() {
            System.out.println("Приватный метод внутреннего класса");
        }
        //Публичный метод внутреннего класса
        public void publicInnerMethod() {
            System.out.println("Публичный метод внутреннего класса");
        }
        // Защищённый метод внутреннего класса
        protected void protectedInnerMethod() {
            System.out.println("Защищённый метод внутреннего класса");
        }

        // Метод (без модификатора) внутреннего класса
        void packagePrivateInnerMethod() {
            System.out.println("Метод (без модификатора) внутреннего класса");
        }
    }

    // Метод внешнего класса для доступа к внутреннему
    public void accessInnerClass() {

        InnerClass inner = new InnerClass();

        System.out.println(inner.publicInnerField);
        System.out.println(inner.protectedInnerField);
        System.out.println(inner.packageInnerField);
        System.out.println(inner.privateInnerField); 

        // Доступ к методам внутреннего класса:
        inner.publicInnerMethod();
        inner.packagePrivateInnerMethod();
        inner.protectedInnerMethod();
        inner.privateInnerMethod(); 
    }
}

public class OuterInner3 {
    public static void main(String[] args) {
        OuterClass3 outer = new OuterClass3();
        outer.accessInnerClass();
    }
}
