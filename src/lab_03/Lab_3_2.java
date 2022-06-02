package lab_03;

public class Lab_3_2 {

    public static void main(String[] args) {
        int[] intArr = {4, 2, 5, 1, 3};
        int min = intArr[0];
        int max = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (min < intArr[i]) {
                min = min;
            } else {
                min = intArr[i];
            }
        }
        for (int i = 1; i < intArr.length; i++) {
            if (max > intArr[i]) {
                max = max;
            } else {
                max = intArr[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}

