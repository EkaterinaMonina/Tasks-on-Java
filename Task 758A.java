import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;
        int FirstArray[] = new int[n];
        for(int i = 0; i < n; i++){
            FirstArray[i] = scanner.nextInt();
            if(FirstArray[i] > max)
            {
                max = FirstArray[i];
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            count += max - FirstArray[i];
        }
        System.out.println(count);
        System.exit(0);
    }
}