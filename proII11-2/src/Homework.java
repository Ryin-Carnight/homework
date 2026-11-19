public class Homework
{
    private String name;//科目名
    private  int text;//文章を書き終えるのに必要な残りの作業量、マイナスにはならない

    Homework(String name)
    {
        this.name = name;
        text = 50;
    }

    void proceed(int n)
    {
        if(this.text <= n)
        {
            this.text = 0;
        }else this.text -= n;
    }

    boolean isFinish()
    {
        return text == 0;
    }

    @Override
    public String toString() {
        return this.name + " text(" + this.text + ")";
    }

    public String getName()
    {
        return this.name;
    }


    public int getText()
    {
        return text;
    }
}
