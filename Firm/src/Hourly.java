public class Hourly extends Employee implements Payable
{
    private int workedHours;

    public Hourly(String N, String A, String P, String SS, double rate)
    {
       super(N, A, P, SS, rate);

       workedHours = 0;
    }
    public void addHours(int moreHours)
    {
        workedHours += moreHours;
    }

    public double pay()
    {
        double payment = payRate * workedHours;

        workedHours = 0;

        return payment;
    }

    public String toString()
    {
        String result = super.toString();

        result += "\nCurrent hours: " + workedHours;

        return result;
    }
    public int vacation()
    {
        int vacDay = super.vacation() - 7;

        return vacDay;
    }
}
