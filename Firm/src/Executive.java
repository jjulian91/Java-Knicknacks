public class Executive extends Employee implements Payable
{
    private double bonus;
    private int extraVacation;

    public Executive(String N, String A, String P, String SS, double rate)
    {
       super (N, A, P, SS, rate);

       bonus = 0;

       extraVacation = 12;
    }
    public void awardBonus(double xbonus)
    {
        bonus = xbonus;
    }

    public double pay()
    {
        double payment = super.pay() + bonus;

        bonus = 0;

        return payment;
    }
    public int vacation()
    {
        int vacDays = super.vacation() + extraVacation;

        return vacDays;
    }
}
