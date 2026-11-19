public class MinMax
{
    public static final int INTMAX = 2147483647;
    public static final int INTMIN = -2147483648;

    static int max(int a, int b)
    {
        if(a >= b) return a;
        else return b;
    }

    static int min(int a, int b)
    {
        if(a <= b) return a;
        else return b;
    }

    static int max(int[] list)
    {
        if(list == null || list.length == 0)
        {
            return INTMIN;
        }
        int max = list[0];
        for(int i = 1;i < list.length;i++)
        {
            if(max <= list[i])max = list[i];
        }

        return max;
    }

    static int min(int[] list)
    {
        if(list == null || list.length == 0)
        {
            return INTMAX;
        }
        int min = list[0];
        for(int i = 1;i < list.length;i++)
        {
            if(min >= list[i])min = list[i];
        }

        return min;
    }
}
