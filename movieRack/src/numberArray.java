import java.util.ArrayList;
import java.util.Scanner;
public class numberArray {
static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();

    int value, count=0;
        do {
            System.out.println("Please enter a number, enter a number less than 0 to exit");
            value = input.nextInt();
            numberList.add(value);
        }while (value>=0);

        for(int i=0; i<numberList.size();i++ ) {
            if (numberList.get(i)%2==0)
                count++;
        }
        System.out.println("there are "+count+" even numbers.");
    }
}