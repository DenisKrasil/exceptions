import java.util.Arrays;

public class second {
    public static void main(String[] args) {
    int[] arr1  = {7, 4, 0, 8, 9, 10};
    int[] arr2 = {1, 2, 3, 0, 3,};
    System.out.println(Arrays.toString(subArr(arr1, arr2)));
}

    public static int[] subArr (int[] a, int[] b){
        int [] c = new int[a.length];
        if (a.length != b.length){
            int [] arr = {0};
            return arr;
        }
        for (int i = 0; i < c.length; i++) {
            
            c [i] = a[i]/b[i];
    }
    return c;
    }  
}

