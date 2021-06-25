public class HomeWork2 {
    public static void main(String[] args){
      boolean b = bool(5,7);
      System.out.println(b);
      number(5);
      boolean c = aBoolean(4);
      System.out.println(c);
      stroka("Hello",5);
      boolean y = years(2021);
      System.out.println(y);
    }
    public static boolean bool(int a, int b){
        int sum = a+b;
        return (sum>=10 && sum<=20);
    }
    public static void number(int a){
        if (a>=0){ System.out.println("Положительное число");}
        else System.out.println("Отрицательное число");
    }
    public static boolean aBoolean(int a){
        return (a<0);
    }
    public static void stroka(String a, int b){
        for (int i=0; i<b; i++){
            System.out.println(a);

        }
    }
    public static boolean years(int y) {
        if (y % 4 == 0) {
            if (y % 100 != 0) {
            }return true;
        } else if (y% 4 !=0){
            if (y%400 == 0){}
        } return false;
    }
}
