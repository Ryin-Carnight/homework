public class Sorcerer extends Character implements Wizard
{
    private int concentration;//集中力
    Sorcerer(String name, int hp, int strength, int intelligence)
    {
        super(name, hp, strength, intelligence);
        this.concentration = 1;
    }

    int magic()
    {
        return super.magic()*this.concentration;
    }

    public void concentrate()
    {
        this.concentration *= 2;
    }

    int specialCalc()
    {
        int magic = magic()*2;
        this.concentration--;
        return magic;
    }

    boolean act(int type, Character c)
    {
        switch(type)
        {
            case 1:
                System.out.println("attack");
                c.addDamage(attack());
                return true;
            case 2:
                System.out.println("magic");
                c.addDamage(magic());
                return true;
            case 4:
                System.out.println("concentrate");
                concentrate();
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
        System.out.println("1:attack, 2:magic, 4:concentrate, 5:special");
    }
}
