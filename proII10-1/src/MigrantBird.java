public class MigrantBird extends Bird
{
    MigrantBird(int vitality)
    {
        super(vitality);
    }

    void sleep()
    {
        super.movePosition(3);
    }
}