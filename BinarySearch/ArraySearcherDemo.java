//driver class to demonstrate binary search
// [5,7,9,13,32,33,42,54,56,88] search for  33
public class ArraySearcherDemo
{
    public static void main(String[] args)
    {
        int [] a = new int[10];
        System.out.println("Enter 10 integers in increasing order.");
        System.out.println("One per line.");
        int i;
        for (i = 0; i < 10; i++)
            a[i] = SavitchIn.readLineInt( );

        System.out.println( );
        for (i = 0; i < 10; i++)
           System.out.print("a[" + i + "]=" + a[i] + " ");
        System.out.println( );
        System.out.println( );

        ArraySearcher finder = new ArraySearcher(a);

        char ans;
        do
        {
            System.out.println("Enter a value to search for:");
            int target = SavitchIn.readLineInt( );
            int result = finder.find(target);

            if (result < 0)
                System.out.println(
                            target + " is not in the array.");
            else
                System.out.println(
                           target + " is at index " + result);

            System.out.println("Again?(y/n)");
            ans = SavitchIn.readLineNonwhiteChar( );
        }while ((ans == 'y') || (ans == 'Y'));

        System.out.println(
                  "May you find what you're searching for.");
    }
}
