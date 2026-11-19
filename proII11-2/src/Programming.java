public class Programming extends Homework
{
    private int coding;//コードを書き終えるのに必要な作業量、マイナスにはならない.
    Programming(String name, int coding)
    {
        super(name);

        this.coding = coding;
    }

    void proceed(int n)
    {
        if(this.coding <= n)
        {
            this.coding = 0;
        }else this.coding -= n;
    }

    boolean isFinish()
    {
        return coding == 0;
    }

    @Override
    public String toString() {
        return super.getName() + " coding(" + this.coding + ")";
    }
}
