package lab_03;

public class Lab_3_3 {

    public static void main(String[] args) {
        int[] sortArray = {12, 38, 34, 16, 1};
        for (int j = 0; j < sortArray.length; j++) {
            for (int i = 0; i < sortArray.length - 1; i++) {
                if (sortArray[i] > sortArray[i + 1]) {
                    int temp = sortArray[i];
                    sortArray[i] = sortArray[i + 1];
                    sortArray[i + 1] = temp;
                }
            }
        }
        for (int b = 0; b < sortArray.length; b++) {
            System.out.print(sortArray[b] + "\t");
        }
    }
}
