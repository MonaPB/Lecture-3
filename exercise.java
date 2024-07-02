public class exercise {
    public static void main(String[] args) {
        System.out.println(isPrime(6));
    }

    public static boolean isPrime(int value) {
        if (value<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
        }
}
