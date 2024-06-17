public class mathematics {
        public static void main(String[] args) {
            int number = 4;
            System.out.println("My Number Is: "+number+"\n"+"Factorial Value Is: "+factorial(number));
        }
        public static Integer factorial(int a){
            if (a==0){
                return 1;
            } else {
                return a * factorial(a-1);
            }

        }

}
