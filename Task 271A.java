import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        for(int i = year + 1; i <= 9876; i++)
        {
            x4 = i;
            x1 = x4 % 10;
            x4 /= 10;
            x2 = x4 % 10;
            x4 /= 10;
            x3 = x4 % 10;
            x4 /= 10;
            if(x1 != x2 && x1 != x3 && x1 != x4 && x2 != x3 && x2 != x4 && x3 != x4)
            {
                System.out.println(i);
                break;
            }
        }
    }
}