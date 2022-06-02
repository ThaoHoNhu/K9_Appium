package lab_04;

public class Lab_4_1 {

    public static void main(String[] args) {
        List<Integer> myIntList = new ArrayList<>();
        boolean isContinuing = true;
        int i = 0;
        while (isContinuing) {
            System.out.println("=====MENU======");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Find index of number");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your option");
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    // add to list
                    Scanner scannerNumber = new Scanner(System.in);
                    System.out.println("Input number to add");
                    int userNumber = scannerNumber.nextInt();
                    myIntList.add(userNumber);
                    break;
                case 2:
                    //print list
                    if (myIntList.size() == 0) {
                        System.out.println("Your list don't have any element");
                    } else {
                        System.out.println(myIntList);
                    }
                    break;
                case 3:
                    //get maximum number
                    if (myIntList.size() == 0) {
                        System.out.println("Your list don't have any element");
                    } else {
                        Integer max = Collections.max(myIntList);
                        System.out.println("Maximum element is: " + max);
                    }
                    break;
                case 4:
                    //get minimun number
                    if (myIntList.size() == 0) {
                        System.out.println("Your list don't have any element");
                    } else {
                        Integer min = Collections.min(myIntList);
                        System.out.println("Minimum element is: " + min);
                    }
                    break;
                case 5:
                    //find element in
                    if (myIntList.size() == 0) {
                        System.out.println("Your list don't have any element");
                    } else {
                        Scanner findNumber = new Scanner(System.in);
                        System.out.println("Input number to find");
                        int inputFindNumber = findNumber.nextInt();
                        for (i = 0; i < myIntList.size(); i++) {
                            if (inputFindNumber == myIntList.get(i)) {
                                System.out.println("The index of number in list is: " + i);
                                break;
                            }
                        }
                        if (i == myIntList.size()) {
                            System.out.println("Not found element in list");
                        }
                    }
                    break;
                default:
                    System.out.println("Pleas read menu again");
                    isContinuing = false;
            }
        }
    }
}
