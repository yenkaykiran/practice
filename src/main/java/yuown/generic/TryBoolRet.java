package yuown.generic;

public class TryBoolRet {

    public static void main(String[] args) {
        System.out.println("Result: " + testMethod());
    }

    @SuppressWarnings("finally")
    private static boolean testMethod() {
        try {
            return true;
        } finally {
            return false; // This is actual return
        }
    }
}