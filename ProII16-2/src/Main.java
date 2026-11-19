import java.util.InputMismatchException;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        try
        {
            n = sc.nextInt();
            n += sc.nextInt();
            sc.close();
            System.out.println("result:" + n);
        }catch (InputMismatchException e)
        {
            System.out.println("Invalid Input!");
        }
    }
}
