import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your range till you want prime: ");
        int range = sc.nextInt();


        for(int i =0;i<range;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }


    }
}