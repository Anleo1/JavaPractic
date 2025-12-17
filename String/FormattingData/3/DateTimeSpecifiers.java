public class DateTimeSpecifiers {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        java.util.Date now = new java.util.Date(currentTime);

        // %tH - час (00-23)
        System.out.printf("Час: %tH%n", now);

        // %tM - минуты (00-59)
        System.out.printf("Минуты: %tM%n", now);

        // %tS - секунды (00-59)
        System.out.printf("Секунды: %tS%n", now);

        // %td - день месяца
        System.out.printf("День месяца: %td%n", now);

        // %tA - день недели
        System.out.printf("День недели: %tA%n", now);

        // %tB - полное название месяца
        System.out.printf("Месяц: %tB%n", now);
        
        System.out.printf("%nТекущее время: %tH:%tM:%tS%n", now, now, now);
        System.out.printf("Текущая дата: %td %tB%n", now, now);
    }
}
