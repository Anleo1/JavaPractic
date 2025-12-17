import java.io.File;
import java.util.Scanner;

public class ReadFileWithScanner {
    public static void main(String[] args) {
        try {
            // Создаем Scanner для чтения из файла
            Scanner scanner = new Scanner(new File("data.txt"));

            // Читаем данные из файла
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close(); // Закрываем Scanner
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
