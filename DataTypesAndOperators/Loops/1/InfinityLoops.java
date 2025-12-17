public class InfinityLoops {
    public static void main(String[] args) {
        //1. while

        //всегда true
        while (true) {
            System.out.println("Бесконечный while");
            // нужен break для выхода
        }

        // условие всегда истинно
        int i = 0;
        while (i >= 0) {  // i всегда >= 0
            System.out.println(i);
            i++;  // i растет, условие всегда true
            // нужен break для выхода
        }

        // условия не меняются
        int count1 = 1;
        while (count1 < 10) {
            System.out.println(count1);
            // забыли count1++ - бесконечный цикл!
        }

        //2. do-while
        // всегда true
        do {
            System.out.println("Бесконечный do-while");
            // нужен break для выхода
        } while (true);

        //условие всегда истинно
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j > 0);  // j всегда > 0 после первой итерации

        // условия не меняются
        int count2 = 0;
        do {
            System.out.println(count2);
            // забыли count2++ - бесконечный цикл!
        } while (count2 < 10);
    }
}
