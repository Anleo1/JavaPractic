public class StringBuilderBuffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // append() - добавляет в конец
        sb.append(" World");
        System.out.println("append(' World'): " + sb); // Hello World

        // length() - возвращает длину
        System.out.println("length(): " + sb.length()); // 11

        // capacity() - возвращает вместимость
        System.out.println("capacity(): " + sb.capacity()); // 21

        // insert() - вставляет по индексу
        sb.insert(5, ",");
        System.out.println("insert(5, ','): " + sb); // Hello, World

        // delete() - удаляет по индексам
        sb.delete(5, 6);
        System.out.println("delete(5, 6): " + sb); // Hello World

        // deleteCharAt() - удаляет один символ
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt(5): " + sb); // HelloWorld

        // replace() - заменяет часть строки
        sb.replace(5, 10, " Java");
        System.out.println("replace(5,10,' Java'): " + sb); // Hello Java

        // reverse() - переворачивает строку
        sb.reverse();
        System.out.println("reverse(): " + sb); // avaJ olleH

        // setCharAt() - меняет один символ
        sb.setCharAt(0, 'A');
        System.out.println("setCharAt(0,'A'): " + sb); // AvaJ olleH

        sb.setLength(4);
        System.out.println("setLength(4): " + sb); // AvaJ

        StringBuffer buffer = new StringBuffer("Start");

        // append() - добавляет в конец
        buffer.append(" End");
        System.out.println("append(' End'): " + buffer); // Start End

        // length() - возвращает длину
        System.out.println("length(): " + buffer.length()); // 9

        // capacity() - возвращает вместимость
        System.out.println("capacity(): " + buffer.capacity()); // 21

        // insert() - вставляет по индексу
        buffer.insert(5, "to");
        System.out.println("insert(5,'to'): " + buffer); // Startto End

        // delete() - удаляет по индексам
        buffer.delete(5, 7);
        System.out.println("delete(5,7): " + buffer); // Start End

        // deleteCharAt() - удаляет один символ
        buffer.deleteCharAt(5);
        System.out.println("deleteCharAt(5): " + buffer); // StartEnd

        // replace() - заменяет часть строки
        buffer.replace(0, 5, "Finish");
        System.out.println("replace(0,5,'Finish'): " + buffer); // FinishEnd

        // reverse() - переворачивает строку
        buffer.reverse();
        System.out.println("reverse(): " + buffer); // dnEhsiniF

        // setCharAt() - меняет один символ
        buffer.setCharAt(0, 'E');
        System.out.println("setCharAt(0,'E'): " + buffer); // EnEhsiniF

        // setLength() - устанавливает новую длину
        buffer.setLength(4);
        System.out.println("setLength(4): " + buffer); // EnEh
    }
}
