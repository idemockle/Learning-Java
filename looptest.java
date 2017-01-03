public class looptest {
    public static void main (String[] args) {
        for (Integer x = 0, y = 0; x < 10; x++, y+=2) {
            System.out.print (x + " " + y + " ");
        }
        System.out.print ('\n');
    }
}