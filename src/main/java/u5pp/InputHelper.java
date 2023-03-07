package u5pp;

import java.util.Scanner;

public class InputHelper {
    Scanner myScanner;
    //a constructor which takes in a scanner that is used to read the input
    InputHelper(Scanner scanner){
        myScanner = scanner;
    }

    //returns the coordinates of the given number letter pair and makes sure the right format is given
    public int[] getChessLocation(String prompt){
        System.out.println(prompt);
        String input = myScanner.nextLine();
        input.toLowerCase();
        int c = input.charAt(0) - 97;
        int r = input.charAt(1) - 49;
        while (input.length() != 2 || (c < 0 || c > 7) || (r < 0 || r > 7)){
            System.out.println("not valid, go again");
            System.out.println(prompt);
            input = myScanner.nextLine();
            input.toLowerCase();
            c = input.charAt(0) - 97;
            r = input.charAt(1) - 49;
        }
        int[] coordinates = new int[2];
        coordinates [1] = c;
        coordinates [0] = r;
        System.out.println(c + " " + r);
        return coordinates;
    }
}

