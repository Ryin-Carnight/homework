import java.sql.Array;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        ArrayList<Integer> number_list = new ArrayList<>();

        try
        {
            for(;;)
            {
                int number = sc.nextInt();
                number_list.add(number);
            }
        }catch (InputMismatchException e)
        {
            System.out.println("Invalid Input!");
            System.out.print("input: ");

            int add_result = 0;
            int multi_result = 1;

            for(int i = 0;i < number_list.size();i++)
            {
                System.out.print(number_list.get(i) + " ");
                add_result += number_list.get(i);
                multi_result *= number_list.get(i);
            }
            System.out.println();
            if(number_list.size()%2 == 0)
                System.out.println("result:" + add_result);
            else if(number_list.size()%2 == 1)
            {
                System.out.println("result:" + multi_result);
            }
        }
    }
}
