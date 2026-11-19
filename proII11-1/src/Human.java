public class Human extends Animal
{
    private boolean isRide;//自転車に乗っているか否か.

    Human(int vitality)
    {
        super(vitality);

        this.isRide = false;
    }

    void rideOn()
    {
        this.isRide = true;
        super.useVitality(1);
    }

    void getDown()
    {
        this.isRide = false;
        super.useVitality(1);
    }

    void drive()
    {
        if(this.isRide)
        {
            super.movePosition(5);
            super.useVitality(3);
        }
    }
}