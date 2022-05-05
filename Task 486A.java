import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long count = 0;
        if(n % 2 == 0)
        {
            count = n / 2;
        }
        else
        {
            count = (n + 1) / (-2);
        }
        System.out.println(count);
    }
}