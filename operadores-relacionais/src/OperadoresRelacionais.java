public class OperadoresRelacionais {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        float c = 10.7f;
        float d = 20.3f;
        char e = 'A';
        char f = 'B';
        boolean g = true;
        boolean h = false;
        long i = 1597L;
        long j = 8598L;
        byte k = 127;
        short l = 32767;

        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // false
        System.out.println("a < b: " + (a < b));   // true
        System.out.println("a >= b: " + (a >= b)); // false
        System.out.println("a <= b: " + (a <= b)); // true

        System.out.println("c == d: " + (c == d)); // false
        System.out.println("c != d: " + (c != d)); // true
        System.out.println("c > d: " + (c > d));   // false
        System.out.println("c < d: " + (c < d));   // true
        System.out.println("c >= d: " + (c >= d)); // false
        System.out.println("c <= d: " + (c <= d)); // true

        System.out.println("e == f: " + (e == f)); // false
        System.out.println("e != f: " + (e != f)); // true
        System.out.println("e > f: " + (e > f));   // false
        System.out.println("e < f: " + (e < f));   // true
        System.out.println("e >= f: " + (e >= f)); // false
        System.out.println("e <= f: " + (e <= f)); // true

        System.out.println("g == h: " + (g == h)); // false
        System.out.println("g != h: " + (g != h)); // true

        System.out.println("i == j: " + (i == j)); // false
        System.out.println("i != j: " + (i != j)); // true
        System.out.println("i > j: " + (i > j));   // false
        System.out.println("i < j: " + (i < j));   // true
        System.out.println("i >= j: " + (i >= j)); // false
        System.out.println("i <= j: " + (i <= j)); // true

        System.out.println("k == l: " + (k == l)); // false
        System.out.println("k != l: " + (k != l)); // true
        System.out.println("k > l: " + (k > l));   // false
        System.out.println("k < l: " + (k < l));   // true
        System.out.println("k >= l: " + (k >= l)); // false
        System.out.println("k <= l: " + (k <= l)); // true
    }

}
