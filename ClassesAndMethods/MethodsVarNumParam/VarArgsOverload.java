public class VarArgsOverload {
    // без параметров
    public static void print() {
        System.out.println("Нет параметров");
    }

    //один параметр int
    public static void print(int message) {
        System.out.println(message);
    }

    // один параметр String
    public static void print(String message) {
        System.out.println(message);
    }

    // переменное число параметров int
    public static void print(int... message) {
        for (int num : message) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // переменное число параметров String
    public static void print(String... messages) {
        if (messages.length == 0) {
            System.out.println("Нет сообщений");
        } else {
            for (String msg : messages) {
                System.out.print(msg + " ");
            }
            System.out.println();
        }
    }

    // Смешанные параметры
    public static void print(String obj, int... messages) {
        System.out.print(obj + ": ");
        for (int num : messages) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print();
        print(5);
        print("Привет");
        print(1, 2, 3, 4);
        print("A", "B", "C");
        print("Результат", 5, 6, 7);
    }
}
