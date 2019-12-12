public class Staff implements Comparable<Staff>
{
    private StaffMember[] staffList;

    public Staff()
    {
        staffList = new StaffMember[6];

        staffList[0] = new Executive ("Sam" , "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee ("Carla" , "456 Off Line", "555-0101", "987-65-4321", 1246.16);
        staffList[2] = new Employee ("Woody" , "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new Hourly ("Jennifer" , "123 Main Line", "555-0469", "123-45-6789", 10.55);
        staffList[4] = new Volunteer ("Norm" , "987 Suds Blvd", "555-0469");
        staffList[5] = new Volunteer ("Cliff" , "321 Duds Lane", "555-0469");

        ((Executive)staffList[0]).awardBonus (500.00);

        ((Hourly)staffList[3]).addHours (40);

    }
    public int compareTo(Staff member){
        if(staffList[0
    }


    public void runSort(){
        Sort(staffList);
    }
    public void Sort(Comparable<StaffMember>[] list){
            int max;
            Comparable<StaffMember> temp;

            for (int index = 0; index < list.length-1; index++)
            {
                max = index;
                for (int scan = index+1; scan < list.length; scan++)
                    if (list[scan].compareTo((StaffMember) list[max]) > 0)
                        max = scan;

                // Swap the values
                temp = list[max];
                list[max] = list[index];
                list[index] = temp;
            }

    }

    }

