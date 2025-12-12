class TypeOperations {
    public static void main(String[] args) {
        System.out.println("5) Автоматическое преобразование(расширение) типов");

        int i = 7;
        double d = 5.9545;
        double result = i + d;
        System.out.println("int + double → double: " + i + " + " + d + " = " + result);

        byte b = 15;
        short s = 84;
        int sum = b + s;
        System.out.println("byte + short → int: " + b + " + " + s + " = " + sum);

        long l = 3454567467L;
        float f = 0.4f;
        float res = l * f;
        System.out.println("long * float → float: " + l + " * " + f + " = " + res);

        char c = 'R';
        int i1 = 10;
        int newR = c + i1;
        System.out.println("char + int → int: " + (int)c +  "('" + c + "') + " + i1 + " = " + newR);

        System.out.println("\n6) Сужающее преобразование типов");

        //отбрасываем вещественную часть
        double d1 = 45.567;
        int i2 = (int) d1;
        System.out.println("(double -> int) " + d1 + " = " + i2 );

        int i3 = 4;
        byte b1 = (byte) i3;
        System.out.println("(int -> byte) " + i3 + " = " + b1);

        //потеря данных
        long l1 = 9345678976543L;
        int i4 = (int) l1;
        System.out.println("(long -> int) " + l1 + " = " + i4);

    }
}
