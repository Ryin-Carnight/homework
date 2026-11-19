public class Account
{
    private String name, no;//氏名、口座番号
    private int balance;//残高

    Account(String name, String no)
    {
        this.name = name;
        this.no = no;
        this.balance = 0;
    }

    private boolean isSufficientAmount(int amount)
    {
        if(this.balance >= amount)
        {
            return true;
        }else return false;
    }

    void deposit(int amount)
    {
        this.balance += amount;
    }
    boolean withdraw(int amount) {
        if (isSufficientAmount(amount)) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public String getName()
    {
        return this.name;
    }

    public String getNo()
    {
        return this.no;
    }

    public int getBalance()
    {
        return this.balance;
    }

}
