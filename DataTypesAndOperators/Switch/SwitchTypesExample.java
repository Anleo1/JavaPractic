public class SwitchTypesExample {
    public static void main(String[] args) {

        // int
        System.out.println("int:");
        int intValue = 3;
        switch(intValue) {
            case 1: System.out.println("  int: 1"); break;
            case 2: System.out.println("  int: 2"); break;
            case 3: System.out.println("  int: 3"); break;
            default: System.out.println("  int: другое");
        }

        // byte
        System.out.println("\nbyte:");
        byte byteValue = 12;
        switch(byteValue) {
            case 45: System.out.println("  byte: 45"); break;
            case 12: System.out.println("  byte: 12"); break;
            default: System.out.println("  byte: другое");
        }

        // short
        System.out.println("\nshort:");
        short shortValue = 852;
        switch(shortValue) {
            case 456: System.out.println("  short: 456"); break;
            case 852: System.out.println("  short: 852"); break;
            default: System.out.println("  short: другое");
        }

        // char
        System.out.println("\nchar:");
        char charValue = 'A';
        switch(charValue) {
            case 'A': System.out.println("  char: A"); break;
            case 'B': System.out.println("  char: B"); break;
            case 'C': System.out.println("  char: C"); break;
            default: System.out.println("  char: другое");
        }

        // String
        System.out.println("\nString:");
        String stringValue = "green";
        switch(stringValue) {
            case "red": System.out.println("  String: red"); break;
            case "green": System.out.println("  String: green"); break;
            case "blue": System.out.println("  String: blue"); break;
            default: System.out.println("  String: другое");
        }

        // Enum
        enum Day { MONDAY, TUESDAY, WEDNESDAY }
        System.out.println("\nEnum:");
        Day enumValue = Day.WEDNESDAY;
        switch(enumValue) {
            case MONDAY: System.out.println("  Enum: понедельник"); break;
            case TUESDAY: System.out.println("  Enum: вторник"); break;
            case WEDNESDAY: System.out.println("  Enum: среда"); break;
            default: System.out.println("  Enum: другое");
        }

        //Классы-оболочки (автораспаковка)
        System.out.println("\nКлассы-оболочки:");
        Integer integerObj = 6;
        switch(integerObj) { // Автораспаковка Integer в int
            case 7: System.out.println("  Integer: 7"); break;
            case 10: System.out.println("  Integer: 10"); break;
            default: System.out.println("  Integer: другое");
        }
    }
}
