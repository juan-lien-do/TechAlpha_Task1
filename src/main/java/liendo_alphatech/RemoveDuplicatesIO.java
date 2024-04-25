package liendo_alphatech;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesIO implements RemoveDuplicatesIOInterface {
    private Scanner sc;
    private RemoveDuplicatesController rdc;

    public RemoveDuplicatesIO(RemoveDuplicatesController rdc) {
        this.sc = new Scanner(System.in);
        this.rdc = rdc;
    }

    public void askForInitialArray() {
        System.out.println("Hello, welcome to the RemoveDuplicatesApp.\nHow many items are in your array?");
        int arrayLength = askArrayLength();
        Long[] array = new Long[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("What is the " + (i + 1) + "th number?");
            array[i] = askNumber();
        }
        rdc.setInitialNumberArray(array);
    }

    private int askArrayLength() {
        int len;
        while (true) {
            try {
                len = sc.nextInt();
                if (len < 1) throw new Exception();
                return len;
            } catch (Exception e) {
                System.out.println("Wrongly formatted number. Remember: This method won't accept values below 1.");
                sc.nextLine();
            }
        }
    }

    private Long askNumber() {
        Long num;
        while (true) {
            try {
                num = sc.nextLong();
                return num;
            } catch (Exception e) {
                System.out.println("Wrongly formatted number. Try again.");
                sc.nextLine();
            }
        }
    }

    public void showArray(Long[] finalNumberArray) {
        System.out.println(Arrays.toString(finalNumberArray));
    }
}
