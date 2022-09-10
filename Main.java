import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz:");
        int c = input.nextInt();
        int b=-9999999;
        int d=9999999;
        for(int i=1; i<=c; i++)
        {
            System.out.println(i+". sayı:");
            int a = input.nextInt();
            if(a > b)
            {
                b=a;
            }
            if(a<d)
            {
                d=a;
            }
        }
        System.out.println("En buyuk:"+b);
        System.out.println("En kucuk:"+d);
    }
}