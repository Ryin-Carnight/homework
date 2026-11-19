public class TimeAccount extends Account
{
    private CalDate kigen;//定期預金の期限
    private int timeBalance;//定期預金の残高

    TimeAccount(String name, String no, CalDate kigen)
    {
        super(name, no);

        this.kigen = kigen;
    }

    public boolean moveToTime(int amount)
    {
        if(super.getBalance() >= amount)
        {
            withdraw(amount);
            this.timeBalance += amount;
            return true;
        }return false;
    }

    public boolean moveToNormal(CalDate d)
    {

        if(d.isSameWith(kigen) || d.isAfterOf(kigen))
        {
            deposit(timeBalance);
            timeBalance = 0;
            return true;
        }else return false;
    }

    public String toString()
    {
        return getName() + "(" + getNo() + ") :Normal(" + getBalance() + ") Time(" + timeBalance + ")";
    }
}
