public class Circle
{
    private int r;//半径

    Circle(int r)
    {
        this.r = r;
    }

    int calcArea()
    {
        double area = r*r*Math.PI;
        long answer = Math.round(area);

        return Math.toIntExact(answer);
    }

    public int getR()
    {
        return this.r;
    }

    public String toString()
    {
        return "r:" + this.r + " area:" + calcArea();
    }
}
