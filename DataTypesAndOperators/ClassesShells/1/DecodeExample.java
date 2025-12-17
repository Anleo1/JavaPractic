public class DecodeExample {
    public static void main(String[] args) {
        // decode() понимает разные системы счисления
        //десятичные
        System.out.println("Integer.decode(\"100\") = " + Integer.decode("100")); //100

        //шестнадцатиричные
        System.out.println("Integer.decode(\"0xff\") = " + Integer.decode("0xff")); // 255

        //восьмиричные(0 вначале)
        System.out.println("Integer.decode(\"0101\") = " + Integer.decode("0101"));  // 65
       }
}
