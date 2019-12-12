abstract public class StaffMember
{
    protected String name;
    protected String address;
    protected String phone;

    public StaffMember(String N, String A, String P)
    {
        name = N;
        address = A;
        phone = P;
    }

    public String toString()
    {
        String result = ("Name: "+ name + "\n");

        result += ("Address: " + address + "\n");
        result += ("Phone: " + phone);

        return result;
    }

    public abstract double pay();

    public abstract int vacation();


    public int compareTo(Object o) {
        return name.compareTo(o.toString());
    }
}
