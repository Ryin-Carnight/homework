public class Samurai extends Character implements Fighter
{
    Samurai(String name, int hp, int strength, int intelligence)
    {
        super(name, hp, strength, intelligence);
    }

    int magic()
    {
        return 0;
    }

    public void ready()
    {
        addSP(3);
    }

    int specialCalc()
    {
        return attack()*5;
    }

    boolean act(int type, Character c)
    {
        switch(type)
        {
            case 1:
                System.out.println("attack");
                c.addDamage(attack());
                return true;
            case 3:
                System.out.println("ready");
                ready();
                return true;
            case 5:
                int special = special();
                if(special != -1)
                {
                    System.out.println("special");
                    c.addDamage(special);
                    return true;
                }else
                {
                    System.out.println("lack of SP");
                    return false;
                }
            default:
                System.out.println("Invalid input!");
                return false;
        }
    }

    void listAction()
    {
        System.out.println("1:attack, 3:ready, 5:special");
    }
}
