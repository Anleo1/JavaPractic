class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        z = 1;
    }

    public A(int a) {
        this();
        this.a = a;
    }

    public A(int a, int b) {
        this(a);
        this.b = b;
    }

    public A(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }
}

public class ThisExample {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(1);
        A obj3 = new A(1, 2);
        A obj4 = new A(1, 2, 3);
    }
}
