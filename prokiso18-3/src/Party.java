import java.util.ArrayList;

public class Party
{
    private int money;
    private ArrayList<Character> names = new ArrayList<>();

    public Party(int money)
    {
        this.money = money;
    }

    public void add(Character c, int n)
    {
        if(names.size() < 8 && n <= 7 && 0 <= n)
        {
            names.add(n, c);
        }
    }

    public void remove(int n)
    {
        if(names.size() != 0 && 0 <= n && n <= 7)
        {
            names.remove(n);
        }
    }

    public void change(int first, int second)
    {
        if(names.get(first) != null && names.get(second) != null && 0 <= first && first <= 7 && 0 <= second && second <= 7)
        {
            Character a = names.get(first);
            Character b = names.get(second);
            names.set(first, b);
            names.set(second, a);
        }
    }

    void show()
    {
        for(int i = 0;i < names.size();i++)
        {
            System.out.println(names.get(i).getName()
                    + "[LV:" + names.get(i).getLevel()
                    + "] " + names.get(i).getHp()
                    + "/" + names.get(i).getMaxHp());
        }
        System.out.println("Money:" + this.money);
    }
}
