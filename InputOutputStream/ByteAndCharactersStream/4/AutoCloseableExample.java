class MyResource implements AutoCloseable {
    public MyResource(){
        System.out.println("Открыт");
    }
    public void use() {
        System.out.println("Используем");
    }

    @Override
    public void close() {
        System.out.println("Закрыт");
    }
}

public class AutoCloseableExample {
    public static void main(String[] args) {
        // Ресурс закроется автоматически
        try (MyResource resource = new MyResource()) {
            resource.use();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
