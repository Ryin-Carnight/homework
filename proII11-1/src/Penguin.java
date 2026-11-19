public class Penguin extends Bird
{
    Penguin(int vitality)
    {
        super(vitality);
    }

    @Override void fly()
    {
        super.useVitality(1);
    }
}
