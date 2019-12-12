

public class MagazineList
{
    private MagazineNode list;

    //----------------------------------------------------------------
    //  Sets up an initially empty list of magazines.
    //----------------------------------------------------------------
    public MagazineList()
    {
        list = null;
    }

    //----------------------------------------------------------------
    //  Creates a new MagazineNode object and adds it to the end of
    //  the linked list.
    //----------------------------------------------------------------
    public void add(Magazine mag)
    {
        MagazineNode node = new MagazineNode(mag);
        MagazineNode current;

        if (list == null)
            list = node;
        else
        {
            current = list;
            while (current.next != null)
                current = current.next;
            current.next = node;
        }
    }

    //----------------------------------------------------------------
    //  Returns this list of magazines as a string.
    //----------------------------------------------------------------
    public String toString()
    {
        String result = "";

        MagazineNode current = list;

        while (current != null)
        {
            result += current.magazine + "\n";
            current = current.next;
        }

        return result;
    }
    //----------------------------------------------------------------
    //  Removes all magazine references
    //----------------------------------------------------------------
    public void deleteAll()
    {
        list = null;
    }
    //----------------------------------------------------------------
    //  Removes user defined magazine
    //----------------------------------------------------------------

    public void delete (Magazine delete) {

        MagazineNode current = list;

        if (list == null) return;

        if (current.next == null && current.magazine.compareTo(delete) == 0) {
            list = null;
            return;
        }
        if (current.magazine.compareTo(delete) == 0)
            list = current.next;

        while (current.next!=null)
        {
            if (current.next.magazine.compareTo(delete) == 0)
                current.next = current.next.next;
            if(current.next==null)
                return;
            else{
                current = current.next;
            }
        }
    }
    //----------------------------------------------------------------
    //  Inserts magazine based on name (alphabetizes list)
    //----------------------------------------------------------------
    public void insert (Magazine mag) {
        MagazineNode freshNode = new MagazineNode(mag);
        MagazineNode current = list;
        MagazineNode previous = null;

        while (current != null && current.magazine.compareTo(mag) <= 0) {
            if(current.magazine.compareTo(mag)==0){
                System.out.println("Magazine already exists!");
                return;
            }
            else {
                previous = current;
                current = current.next;
            }
        }

        if (previous == null)
            list = freshNode;
        else {
            previous.next = freshNode;
        }
        freshNode.next = current;
    }

    //----------------------------------------------------------------
    //  An inner class that represents a node in the magazine list.
    //  The public variables are accessed by the MagazineList class.
    //----------------------------------------------------------------
    private class MagazineNode
    {
        public Magazine magazine;
        public MagazineNode next;

        //--------------------------------------------------------------
        //  Sets up the node
        //--------------------------------------------------------------
        public MagazineNode(Magazine mag)
        {
            magazine = mag;
            next = null;
        }
    }

}
