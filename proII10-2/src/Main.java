import java.sql.Time;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String name = "山田 太郎";
        String no = "11202";
        int balance = 100000;

        Account a = new Account(name, no);
        CalDate c = new CalDate(2026, 7, 6);
        CalDate kigen = new CalDate(2025, 3, 7);
        TimeAccount t = new TimeAccount(name, no, kigen);

        System.out.println(c.isSameWith(kigen));
        System.out.println(c.isAfterOf(kigen));

        c = new CalDate(2022, 4, 5);

        System.out.println(c.isSameWith(kigen));
        System.out.println(c.isAfterOf(kigen));
        System.out.println(t.toString());

    }
}
