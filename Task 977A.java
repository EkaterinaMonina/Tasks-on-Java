import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for(int i = 0; i < k; i++){
            if(n % 10 != 0)
            {
                n -= 1;
            }
            else
            {
                n /= 10;
            }
        }
        System.out.println(n);
    }
}