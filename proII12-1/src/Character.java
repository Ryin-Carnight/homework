abstract class Character
{
    private String name;//キャラクターの名前
    private int hp, sp, strength, intelligence;//体力、特殊攻撃、武器能力値、魔法能力値

    Character(String name, int hp, int strength, int intelligence)
    {
        this.name = name;
        this.hp = hp;
        this.sp = 0;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    int attack()
    {
        this.sp++;
        return this.strength*2;
    }

    int magic()
    {
        this.sp++;
        return this.intelligence*2;
    }

    int special()
    {
        if(this.sp >= 5)
        {
            int special = specialCalc();
            this.sp = 0;
            return special;
        }else return -1;
    }

    boolean isDown()
    {
        return hp <=0;
    }

    public String getName()
    {
        return this.name;
    }

    void addSP(int point)
    {
        this.sp += point;
    }

    void addDamage(int damage)
    {
        this.hp -= damage;
    }

    public String toString()
    {
        return this.name + " HP:" + this.hp + " SP:" + this.sp;
    }

    abstract int specialCalc();
    abstract void listAction();
    abstract boolean act(int type, Character c);

}
