import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,5,2,4,7,4,2,5};
        int max1=arr[0];
        int max2=arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i]>max1){
                max2=max1;
                max1=arr[i];
            } else if (arr[i] < max1 && arr[i] > max2) {
                max2 = arr[i];
            }
        }
        if (max2 != max1) {
            System.out.println("Số lớn thứ hai trong mảng là: " + max2);
        } else {
            System.out.println("Không có số lớn thứ hai trong mảng.");
        }
    }
}