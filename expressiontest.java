// Run to learn little java tricks

public class expressiontest {
    public static void main (String[] args) {
        System.out.println("\nMath on ints works similarly to in Python 2: ");
        System.out.println("( 0 + 15 ) / 2 = " + ( 0 + 15 ) / 2);
        System.out.println("( 0 + 15.0 ) / 2 = " + ( 0 + 15.0 ) / 2);
        System.out.println("2.0e-6 * 100000000.1 = " + 2.0e-6 * 100000000.1);
        
        System.out.println("");
        System.out.println("Booleans too:");
        System.out.println("(true && false || true && true) = " + (true && false || true && true));
        System.out.println("(4.1 >= 4) = " + (4.1 >= 4));
        System.out.println("");
        System.out.println("When numeric types are added to a string, the number is converted to a string:");
        System.out.println("1 + \"3\" = " + (1+"3"));
        System.out.println("1.0 + \"3\" = " + (1.0+"3"));
        
        System.out.println("");
        int a = 1;
        int b = 3;
        int c = -1;
        if (a > b) c = 0;
        else c = 1;
        System.out.println(c);
        
        System.out.println("");
        System.out.println((char) ('z' + 1));
        
    }
}