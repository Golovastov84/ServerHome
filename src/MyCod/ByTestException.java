package MyCod;

public class ByTestException {
    public static void main(String[] args) throws Exception {
        TestException testException = new TestException();
        System.out.println(testException.concat("Tanya", "Street33"));
        int theSum = add (1, 3);
        System.out.println(theSum);
    }
    public static int add (int value1, int value2) {
        return value1 + value2;
    }
}

