
public class stringsArray {
    public static void main (String []args){
        String[] names={"Einstein","Newton","Copernicus","Kepler"};
        int total=0;
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
            total += names[i].length();
        }
        System.out.print("The total Characters in the array is: ");
        System.out.println(total);}

}
