public class Volunteer extends StaffMember implements Payable
{
    public Volunteer(String N, String A, String P)
    {
        super(N,A,P);
    }

    public double pay()
    {
        return 0.0;
    }

    @Override
    public int vacation() {

        return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
