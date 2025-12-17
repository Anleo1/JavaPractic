public class BreakContinueExample {
    public static void main(String[] args) {
        //Вывод нечётных с 1 до 7
        int number = 0;
        while (true) {
            number++;
            if (number % 2 == 0) {
                continue;//без continue чётные не получится пропустить в такой реализации
            }
            System.out.println(number);
            if (number >=7) {
                System.out.println("Достигли 7 выходим");
                break; // Выходим из цикла, без break зациклится (всегда true)
            }
        }
    }
}
