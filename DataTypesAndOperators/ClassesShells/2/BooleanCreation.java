public class BooleanCreation {
    public static void main(String[] args) {
        System.out.println("Способы создания Boolean:\n");

        // Конструкторы (не рекомендуется, deprecated)
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("essfh");
        Boolean b4 = new Boolean("FALSE");

        System.out.println("Через конструкторы:");
        System.out.println("new Boolean(true) = " + b1);
        System.out.println("new Boolean(\"true\") = " + b2);
        System.out.println("new Boolean(\"essfh\") = " + b3);
        System.out.println("new Boolean(\"FALSE\") = " + b4);

        // valueOf()
        Boolean b5 = Boolean.valueOf(true);
        Boolean b6 = Boolean.valueOf("true");
        Boolean b7 = Boolean.valueOf("essfh");
        Boolean b8 = Boolean.valueOf("FALSE");

        System.out.println("\nЧерез valueOf():");
        System.out.println("Boolean.valueOf(true) = " + b5);
        System.out.println("Boolean.valueOf(\"true\") = " + b6);
        System.out.println("Boolean.valueOf(\"essfh\") = " + b7);
        System.out.println("Boolean.valueOf(\"FALSE\") = " + b8);

        // parseBoolean() - возвращает примитив
        Boolean b9 = Boolean.parseBoolean("true");
        Boolean b10 = Boolean.parseBoolean("essfh");
        Boolean b11 = Boolean.parseBoolean("FALSE");

        System.out.println("\nЧерез parseBoolean():");
        System.out.println("Boolean.parseBoolean(\"true\") = " + b9);
        System.out.println("Boolean.parseBoolean(\"essfh\") = " + b10);
        System.out.println("Boolean.parseBoolean(\"FALSE\") = " + b11);

        // Автоупаковка
        Boolean b12 = true;
        Boolean b13 = false;

        System.out.println("\nАвтоупаковка:");
        System.out.println("Boolean b12 = true: " + b12);
        System.out.println("Boolean b13 = false: " + b13);

        // Константы
        System.out.println("\nКонстанты:");
        System.out.println("Boolean.TRUE = " + Boolean.TRUE);
        System.out.println("Boolean.FALSE = " + Boolean.FALSE);
    }
}
