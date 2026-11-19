public class Report extends Homework
{
    private int experiment;//実験を終えるのに必要な残りの作業量、マイナスにはならない
    Report(String name, int experiment)
    {
        super(name);

        this.experiment = experiment;
    }

    void proceed(int n)
    {
        if(this.experiment == 0)
        {
            super.proceed(n);
        }
    }

    void proceedExperiment(int n)
    {
        if(this.experiment <= n)
        {
            this.experiment = 0;
        }else this.experiment -= n;
    }

    @Override
    public String toString()
    {
        return super.toString() +" experiment(" + this.experiment + ")";
    }
}
