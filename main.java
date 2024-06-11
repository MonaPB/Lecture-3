public class main {
    public static void main(String[] args) {
        String S = "XIML";
        int sum=0;
        for (int i =0; i<S.length(); i++)
        {
            char c= S.charAt(i);
            if (c=='I')
                sum +=1;
            if (c=='V')
                sum +=5;
            if (c=='X')
                sum +=10;
            if (c=='L')
                sum +=50;
            if (c=='C')
                sum +=100;
            if (c=='D')
                sum +=500;
            if (c=='M')
                sum +=1000;
        }
        System.out.println("The String is: "+S+"\n"+"The Integer Value is: "+sum);
    }
}
