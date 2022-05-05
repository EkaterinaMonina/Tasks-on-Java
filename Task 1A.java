import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        long new_n = n / a;
        long new_m = m / a;
        if(n % a != 0)
        {
            new_n += 1;
        }
        if(m % a != 0)
        {
            new_m += 1;
        }
        System.out.println(new_n * new_m);
    }
}