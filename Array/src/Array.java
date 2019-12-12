import java.util.stream.IntStream;

public class Array {
    public static void main (String []args){
        int [][] array = {{29,80},{45,70}};
        for (int i = 0; i<1; i++){ ;
            for(int j = 1; j<2; j++) {
                System.out.print("Col 0 Total: ");
                System.out.println(+array[j][i] + array[i][i]);
                System.out.print("Col 1 Total: ");
                System.out.println(array[i][j] + array[j][j]);
            }
                    System.out.print("Row 0 Total: ");
                    System.out.println(IntStream.of(array[0]).sum());
                    System.out.print("Row 1 Total: ");
                    System.out.println(IntStream.of(array[1]).sum());
                }
            System.out.print("Array Total: ");
            System.out.println(IntStream.of(array[1]).sum()+IntStream.of(array[0]).sum());
        }
    }

