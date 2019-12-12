
public class Magazine implements Comparable <Magazine>
{
    private String title;

    //-----------------------------------------------------------------
    //  Sets up the new magazine with its title.
    //-----------------------------------------------------------------
    public Magazine(String newTitle)
    {
        title = newTitle;
    }

    //-----------------------------------------------------------------
    //  Returns this magazine as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return title;
    }

    //-----------------------------------------------------------------
    //  Returns the magazine title as a string
    //-----------------------------------------------------------------

    public String getTitle()
    {
        return title;
    }
    //-----------------------------------------------------------------
    //  compares if two are equal (True or False Only)
    //-----------------------------------------------------------------
    public boolean equals(Object other)
    {
        return title.equals(((Magazine)other).getTitle());
    }
    //-----------------------------------------------------------------
    //  outputs a number based on the location of each magazine
    //-----------------------------------------------------------------
    public int compareTo(Magazine other)
    {
        int result;
        if (title.equals(other.getTitle()))
            result = title.compareTo(other.getTitle());
        else
            result = title.compareTo(other.getTitle());
        return result;
    }

}
