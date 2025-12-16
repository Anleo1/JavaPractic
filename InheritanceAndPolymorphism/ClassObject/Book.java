public class Book {
    private String key;
    private String title;
    private String author;
    private int year;

    public Book( String key, String title, String author, int year) {
        this.key = key;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Book)) {
            return false;
        }

        Book other = (Book) obj;

        if (!key.equals(other.key)) {
            return false;
        }

        if (title == null) {
            if (other.title != null) {
                return false;
            }
        } else if (!title.equals(other.title)) {
            return false;
        }

        if (author == null) {
            if (other.author != null) {
                return false;
            }
        } else if (!author.equals(other.author)) {
            return false;
        }

        return year == other.year;
    }

    @Override
    public String toString() {
        return "Book{key='" + key + "', title='" + title +
                "', author='" + author + "', year=" + year + "}";
    }
    
    public static void main(String[] args) {
        Book book1 = new Book("1455", "Война и мир", "Лев Толстой", 1869);
        Book book2 = new Book("1455", "Война и мир", "Лев Толстой", 1869);
        Book book3 = new Book("1487", "Анна Каренина", "Лев Толстой", 1877);
        Book book4 = new Book("1444", "Война и мир", null, 1869);

        System.out.println("Книги:");
        System.out.println("book1: " + book1);
        System.out.println("book2: " + book2);
        System.out.println("book3: " + book3);
        System.out.println("book4: " + book4);
        System.out.println();

        System.out.println("Результаты сравнения equals():");
        System.out.println("book1.equals(book2): " + book1.equals(book2));
        System.out.println("book1.equals(book3): " + book1.equals(book3));
        System.out.println("book1.equals(book4): " + book1.equals(book4));
        System.out.println();
    }
}
