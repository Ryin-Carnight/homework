public class CarDriver extends Human
{
    CarDriver(int vitality)
    {
        super(vitality);
    }

    @Override void drive()
    {
        super.movePosition(8);
        super.useVitality(1);
    }

    @Override void walk()
    {

    }
}
