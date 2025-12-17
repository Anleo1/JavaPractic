class Ex1 extends Exception {
    public Ex1 (String msg) { super(msg); }
}

class Ex2 extends Ex1 {
    public Ex2(String msg) { super(msg); }
}

class Ex3 extends Ex2 {
    public Ex3 (String msg) { super(msg); }
}

public class MultiCatch {
    public static void main(String[] args) {
        //Несколько исключений с одинаковой обработкой
        try {
            // Выбросит первое из написанных
            int[] numbers = {1, 2, 3};
            int temp = numbers[5]; // ArrayIndexOutOfBoundsException
            String input = "abc";
            int number = Integer.parseInt(input);//NumberFormatException

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            // Одинаковая обработка
            System.out.println("   Ошибка: " + e.getClass().getSimpleName());
            System.out.println("   Сообщение: " + e.getMessage());
        }

        // Исключения в иерархии
        try {
            double random = Math.random();
            System.out.println(random);
            if (random < 0.25) {
                throw new Ex3 ("Ex3");
            } else if (random < 0.56) {
                throw new Ex2 ("Ex2");
            } else {
                throw new Ex1("Ex1");
            }
        } catch (Ex3 e) {
            System.out.println("Поймано Ex3");

        } catch (Ex2 e) {
            System.out.println("Поймано Ex2");

        } catch (Ex1 e) {
            System.out.println("Поймано Ex1");
        }
    }
}
