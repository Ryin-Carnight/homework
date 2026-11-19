public class Animal
{
    private int position, currentVitality, maxVitality; //現在地, 現在の天気, 最大の天気

    Animal(int vitality)
    {
        this.currentVitality = vitality;
        this.maxVitality = vitality;
        this.position = 0;
    }

    void movePosition(int n)
    {
        this.position += n;
    }

    void useVitality(int n)
    {
        this.currentVitality -= n;
    }

    void walk()
    {
        this.position++;
        this.currentVitality--;
    }

    void eat()
    {
        this.currentVitality = this.maxVitality;
    }

    public String toString()
    {
        return "pos:" + this.position + " vit:" + this.currentVitality + "/" + this.maxVitality;
    }

    public int getPosition()
    {
        return this.position;
    }

    public int getCurrentVitality()
    {
        return this.currentVitality;
    }

    public int getMaxVitality()
    {
        return this.maxVitality;
    }
}
