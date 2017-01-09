public class EqualInts {
    public static void main (String[] args) {
        int isEqual;
        int[] argsInt = new int[3];
        int idx;
        
        for (idx = 0; idx < args.length; idx++) {
            argsInt[idx] = Integer.parseInt(args[idx]);
        }
        
        if (argsInt[0] == argsInt[1] & argsInt[0] == argsInt[2]) {
            isEqual = 1;
        } else {
            isEqual = 0;
        }
        
        
        switch (isEqual) {
            case 0:
                System.out.println("not equal");
                break;
            case 1:
                System.out.println("equal");
                break;
        }
        
        System.out.print("[");
        for (idx = 0; idx < argsInt.length-1; idx++) {
            System.out.print(argsInt[idx]+", ");
        }
        System.out.println(argsInt[argsInt.length-1]+"]");
    }
}