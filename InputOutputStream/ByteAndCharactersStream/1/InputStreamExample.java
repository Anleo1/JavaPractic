import java.io.ByteArrayInputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        byte[] data = {65, 110, 97, 115, 116, 97, 115, 105, 97};//Anastasia в байтах
        ByteArrayInputStream input = new ByteArrayInputStream(data);

        int byteRead;
        while ((byteRead = input.read()) != -1) {
            System.out.print((char) byteRead + "(" + byteRead + ") ");
        }
        // Вывод: A(65) n(110) a(97) s(115) t(116) a(97) s(115) i(105) a(97) 
    }
}
