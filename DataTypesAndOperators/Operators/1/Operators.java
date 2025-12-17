public class Operators {
    public static void main(String[] args) {
        // 1. Арифметические операторы
        int a = 29, b = 7;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));      // 36
        System.out.println("a - b = " + (a - b));      // 22
        System.out.println("a * b = " + (a * b));      // 203
        System.out.println("a / b = " + (a / b));      // 4 (целочисленное деление)
        System.out.println("a % b = " + (a % b));      // 1 (остаток)

        double z = 45.98, t = 3.7;
        System.out.println("z / t = " + (z / t));      // 12.427027027027025

        // 2. Операторы присваивания
        int c = 6;
        System.out.println("Сначала c = " + c);
        c += 6;
        System.out.println("c += 6 = " + c);
        c -= 2;
        System.out.println("c -= 2 = " + c);
        c *= 5;
        System.out.println("c *= 5 = " + c);
        c /= 2;
        System.out.println("c /= 2 = " + c);
        c %= 3;  
        System.out.println("c %= 3 = " + c);

        // 3. Операторы ++ и -- (префиксная и постфиксная)
        int i = 5;
        System.out.println("Исходное i = " + i);

        // Постфиксный инкремент
        int j = i++;  // сначала j = i, потом i = i + 1
        System.out.println("j = i++ : j = " + j + ", i = " + i);

        // Префиксный инкремент
        int k = ++i;  // сначала i = i + 1, потом k = i
        System.out.println("k = ++i : k = " + k + ", i = " + i);

        // Постфиксный декремент
        int n = i--;  // сначала n = i, потом i = i - 1
        System.out.println("n = i-- : n = " + n + ", i = " + i);

        // Префиксный декремент
        int m = --i;  // сначала i = i - 1, потом m = i
        System.out.println("m = --i : m = " + m + ", i = " + i);

        // 4. Операторы сравнения
        int p = 10, q = 20;
        System.out.println(p + " == " + q + " ? " + (p == q));  // false
        System.out.println(p + " != " + q + " ? " + (p != q));  // true
        System.out.println(p + " > " + q + " ? " + (p > q));    // false
        System.out.println(p + " < " + q + " ? " + (p < q));    // true
        System.out.println(p + " >= " + q + " ? " + (p >= q));  // false
        System.out.println(p + " <= " + q + " ? " + (p <= q));  // true

        // 5. Логические операторы
        boolean bool1 = true, bool2 = false;
        System.out.println("bool1 = " + bool1 + ", bool2 = " + bool2);
        System.out.println("bool1 && bool2 = " + (bool1 && bool2));  // false
        System.out.println("bool1 || bool2 = " + (bool1 || bool2));  // true
        System.out.println("!bool1 = " + (!bool1));  // false

        // 6. Побитовые операторы
        int num1 = 5;    // 0101
        int num2 = 3;    // 0011
        System.out.println(num1 + " & " + num2 + " = " + (num1 & num2));  // 0001 = 1
        System.out.println(num1 + " | " + num2 + " = " + (num1 | num2));  // 0111 = 7
        System.out.println(num1 + " ^ " + num2 + " = " + (num1 ^ num2));  // 0110 = 6
        System.out.println("~" + num1 + " = " + (~num1));  // 11111010 = -6

        // 7. Операторы сдвига
        int num = 8;  // 00001000
        System.out.println(num + " << 1 = " + (num << 1));   // 00010000 = 16
        System.out.println(num + " >> 1 = " + (num >> 1));   // 00000100 = 4
        System.out.println(num + " >>> 1 = " + (num >>> 1)); // 00000100 = 4

        int negative = -8;
        System.out.println(negative + " >> 1 = " + (negative >> 1));   // знаковый сдвиг
        System.out.println(negative + " >>> 1 = " + (negative >>> 1)); // беззнаковый сдвиг

        // 8. Тернарный оператор
        int number = 56;
        String status = (number > 0) ? "натуральное" : "целое";
        System.out.println("Число " + number + " : " + status);

        // 9. Операторы со String
        System.out.println("\nСтроки\n");

        String s1 = "Hello";
        String s2 = "World";

        // Конкатенация
        System.out.println("s1 +  + s2 = " + (s1 + " " + s2));  // Hello World

        String s3 = "java";
        s3 += " practice";  // s3 = s3 + " practice"
        System.out.println("s3 += \" practice\" : " + s3); // java practice

        // Сравнение строк
        String str1 = "text";
        String str2 = "text";
        String str3 = new String("text");

        System.out.println("str1 == str2 ? " + (str1 == str2));  // true (пул строк)
        System.out.println("str1 == str3 ? " + (str1 == str3));  // false (разные объекты)
        System.out.println("str1.equals(str3) ? " + str1.equals(str3));  // true (содержимое)
    }
}
