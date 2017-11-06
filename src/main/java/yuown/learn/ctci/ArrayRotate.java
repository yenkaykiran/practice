package yuown.learn.ctci;

import java.util.Arrays;

public class ArrayRotate {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5 };
        int size = a.length;
        int b[] = new int[size];

        System.out.println("Original Array: " + Arrays.toString(a));
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            int rotate = i;
            if (rotate > size) {
                rotate = rotate % size;
            }
            System.arraycopy(a, 0     , b, size - rotate, rotate);
            System.arraycopy(a, rotate, b, 0            , size - rotate);
            
            System.out.println("Rotation " + i + ": " + Arrays.toString(b));
        }
    }
}
