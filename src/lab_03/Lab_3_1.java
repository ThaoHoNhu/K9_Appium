package lab_03;

public class Lab_3_1 {

    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5};
        int result;
        int count_odd = 0;
        int count_even = 0;
        for (int i = 0; i < intArr.length; i++) {
            result = intArr[i] % 2;
            if (result == 0) {
                count_even = count_even + 1;
            } else {
                count_odd = count_odd + 1;
            }
        }
        System.out.println("Even numbers: " + count_even);
        System.out.println("Odd numers: " + count_odd);

    }
}
