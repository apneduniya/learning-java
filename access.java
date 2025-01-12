

class externalClass {
    private static int a = 5;

    // get the value
    public static int getter() {
        return a;
    }

    // set the value
    public static void setter(int num) {
        a = num;
    }
}

public class access extends externalClass {
    public static void main(String[] args) {
        setter(10);
        System.out.println(getter());
    }
}
