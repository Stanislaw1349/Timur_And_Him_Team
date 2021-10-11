import java.util.Arrays;

public class First {
    public static void main(String[] args) {
       int i;
        int j = 0;
        for (i = 3; i <= 181; i++  ){
            if (i % 4 == 0){
                j++;
            }
        }
        int z =0;
        int[] arr = new int[j];
        for (i= 3; i <= 181; i++  ){
            if (i % 4 == 0){
                arr[z] = i;
                z++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

}
