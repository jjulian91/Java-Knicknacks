public class Sorting {
        // logic to sort the elements

    public static void main(String a[]){
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doInsertionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }

    public static int[] doInsertionSort(int[] input){

        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }

                printNumbers(input); }
        }
        return input;
    }

        private static void printNumbers(int[] input) {

            for (int i = 0; i < input.length; i++) {
                System.out.print(input[i] + ", ");
            }
            System.out.println("\n");
        }


        }



