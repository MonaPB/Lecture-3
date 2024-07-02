public class symmetric {
    public static void main(String[] args) {
        System.out.println(isSymmetrical(213));
    }
    public static boolean isSymmetrical(int number){
        String str=Integer.toString(number);
        int len=str.length();
        for (int i=0;i<len/2;i++){
            if (str.charAt(i) != str.charAt(len - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
