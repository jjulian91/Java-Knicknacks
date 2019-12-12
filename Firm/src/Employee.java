public class Employee extends StaffMember implements Payable
{
    protected String socialSecurity;
    protected double payRate;
    protected final int STANDARD_VACATION = 14;

    public Employee(String N, String A, String P, String SS, double rate)
    {
        super (N, A, P);

        socialSecurity = SS;
        payRate = rate;
    }
    public String toString()
    {
        String result = super.toString();

        result += "\nSocial Security Number: " + socialSecurity;

        return result;
    }
    public double pay()
    {
        return payRate;
    }

    @Override
    public int vacation() {

        return STANDARD_VACATION;
    }

}
