public class MyMath {
    public static void main(String[] args) {
        System.out.println(power(3, 10));
        System.out.println(powerRec(3, 10));
    }

    public static int power(int base, int exp) {
        int x = base;
        int xexp = 1;
        int value = 1;
        while (xexp <= exp) {
            value *= (exp & xexp) != 0 ? x : 1;
            xexp *= 2;
            x *= x;
        }
        return value;
    }

    public static int powerRec(int base, int exp) {
        if (exp <= 0) {
            return 1;
        }
        if (exp == 1) {
            return base;
        }
        if (exp % 2 == 1) {
            return base * powerRec(base * base, exp / 2);
        } else {
            return powerRec(base * base, exp / 2);
        }
    }
}
