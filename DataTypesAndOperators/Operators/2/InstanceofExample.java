public class InstanceofExample {
    public static void main(String[] args) {
        var obj1 = "Hello World";
        Object obj2 = "Hello World";
        Object obj3 = 54;
        Object obj4 = 7.97;

        System.out.println("obj1 instanceof String: " + (obj1 instanceof String));
        //System.out.println("obj1 instanceof Integer: " + (obj1 instanceof Integer)); // не используется(ошибка с var)

        System.out.println("obj2 instanceof Integer: " + (obj2 instanceof Integer));
        System.out.println("obj2 instanceof String: " + (obj2 instanceof String));

        System.out.println("obj3 instanceof String: " + (obj3 instanceof String));
        System.out.println("obj3 instanceof Integer: " + (obj3 instanceof Integer));

        System.out.println("obj4 instanceof Double: " + (obj4 instanceof Double));
        System.out.println("obj4 instanceof Integer: " + (obj4 instanceof Integer));

        String nullString = null;
        Integer nullInteger = null;
        Object nullObject = null;

        System.out.println("nullString instanceof String: " + (nullString instanceof String));
        System.out.println("nullInteger instanceof Integer: " + (nullInteger instanceof Integer));
        System.out.println("nullObject instanceof Object: " + (nullObject instanceof Object));
    }
}
