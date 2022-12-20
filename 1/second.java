import java.util.Arrays;

public class second {
    public static void main(String[] args) {
        int[] arr1  = {7, 4, 0, 8, 9, 10};
    int[] arr2 = {1, 2, 3, 0, 3};
    System.out.println(Arrays.toString(subArr(arr1, arr2)));
}

    public static int[] subArr (int[] arr1, int[] arr2){
        int [] arr3 = new int[arr1.length];
        if (arr1.length != arr2.length){
            throw new RuntimeException("Длины массивов не равны");
        }
        for (int i = 0; i < arr3.length; i++) {
            if (arr2 [i]==0) {
                throw new RuntimeException("На ноль делить нельзя");
            }
            arr3 [i] = arr1[i]/arr2[i];
    }
    return arr3;
    }  
}

