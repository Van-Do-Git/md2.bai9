package SimpleCalculator;

public class SimpleCalculator {
    public static int add(int fist, int second) {
        if (fist / 2 + second / 2 >= Integer.MAX_VALUE / 2) {
            throw new RuntimeException("Limited of date type Integer");
        }
        if (fist / 2 + second / 2 <= Integer.MIN_VALUE / 2) {
            throw new RuntimeException("Limited of date type Integer");
        }
        return fist + second;
    }

    public static int sub(int fist, int second) {
        if (fist / 2 - second / 2 <= Integer.MIN_VALUE / 2) {
            throw new RuntimeException("Limited of date type Integer");
        }
        if (fist / 2 - second / 2 >= Integer.MAX_VALUE / 2){
            throw new RuntimeException("Limited of date type Integer");
        }
            return fist - second;
    }
}
