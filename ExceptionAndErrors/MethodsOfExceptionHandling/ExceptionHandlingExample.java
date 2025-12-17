public class ExceptionHandlingExample {
    public static void main(String[] args) {

        // Исключение, которое будет перехвачено
        System.out.println("Перехваченное исключение:");
        try {
            String text = null;
            System.out.println(text.length()); // Вызов метода у null
        } catch (NullPointerException e) {
            System.out.println("Перехвачено: " + e.getClass().getSimpleName() + "\nСообщение: " + e.getMessage()); 
          //Перехвачено: NullPointerException
          //Сообщение: Cannot invoke "String.length()" because "text" is null
        }

        System.out.println("Продолжение работы после обработки исключения\n");

        // Исключение, которое не будет перехвачено (приведет к аварийной остановке)
        System.out.println("Не перехваченное исключение:");
        int[] numbers = {1, 2, 3};
        // Ошибка: выход за границы массива
        System.out.println("   Элемент [5] = " + numbers[5]); // ArrayIndexOutOfBoundsException
      //Аварийная остановка, дальнейший код не выполняется
    }
}
