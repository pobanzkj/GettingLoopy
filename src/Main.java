import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        for(int num = 0; num <= 30; num ++)
        {
            System.out.println(num);
        }

        for(int cnt = 30; cnt >= 0; cnt --)
        {
            System.out.println(cnt);
        }

        for(int num = 0; num <= 18; num = num + 3)
        {
            System.out.println(num);
        }

        for(int num = 10; num >= 0; num = num - 2)
        {
            System.out.println(num);
        }

        for(int r = 1; r <= 5; r++)
        {
            for(int c = 1; c <= 5; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int r = 1; r <= 5; r++)
        {
            for(int c = 1; c <= r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int r = 5; r >= 1; r--)
        {
            for(int c = 1; c <= r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

