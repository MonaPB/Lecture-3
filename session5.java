public class session5 {
    public static void main(String[] args) {
        //Syntax <data-type>[] var_name={}
        String[] name= {"Mona","Hoda","Hamed"};
        System.out.println(name[0]); //first
        System.out.println(name[name.length-1]); //last
        name[name.length-1]="Poone";
        System.out.println(name[name.length-1]);

        Integer[] number={12,3,74};
        System.out.println(number[number.length-1]);
        number[number.length-1]=29;
        System.out.println(number[number.length-1]);
    }
}
