import java.io.ByteArrayOutputStream;

public class OutputStreamExample {
    public static void main(String[] args) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        output.write(65);  // A
        output.write(110); // n
        output.write(97); // a
        output.write(115); // s
        output.write(116); // t
        output.write(97);  // a
        output.write(115); // s
        output.write(105); // i
        output.write(97); // a

        System.out.println(output.toString()); // Anastasia
    }
}
