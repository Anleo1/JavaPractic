public class Transformations {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Исходная строка (String): \"" + str + "\"");
        System.out.println("Тип: " + str.getClass().getSimpleName());

        // String to StringBuffer
        StringBuffer buffer = new StringBuffer(str);
        System.out.println("\nString to StringBuffer:");
        System.out.println("Результат: \"" + buffer + "\"");
        System.out.println("Тип: " + buffer.getClass().getSimpleName());

        // String to StringBuilder
        StringBuilder builder = new StringBuilder(str);
        System.out.println("\nString to StringBuilder:");
        System.out.println("Результат: \"" + builder + "\"");
        System.out.println("Тип: " + builder.getClass().getSimpleName());


        // StringBuffer to String
        String fromBuffer = buffer.toString();
        System.out.println("\nStringBuffer to String:");
        System.out.println("Результат: \"" + fromBuffer + "\"");
        System.out.println("Тип: " + fromBuffer.getClass().getSimpleName());

        // StringBuilder to String
        String newStr = builder.toString();
        System.out.println("\nStringBuilder to String:");
        System.out.println("Результат: \"" + newStr + "\"");
        System.out.println("Тип: " + newStr.getClass().getSimpleName());


        // StringBuilder to StringBuffer
        StringBuffer buffer2 = new StringBuffer(builder.toString());
        System.out.println("\nStringBuilder to StringBuffer:");
        System.out.println("Результат: \"" + buffer2 + "\"");
        System.out.println("Тип: " + buffer2.getClass().getSimpleName());

        //StringBuffer to StringBuilder
        StringBuilder builder2 = new StringBuilder(buffer.toString());
        System.out.println("\nStringBuffer to StringBuilder:");
        System.out.println("Результат: \"" + builder2 + "\"");
        System.out.println("Тип: " + builder2.getClass().getSimpleName());
    }
}
