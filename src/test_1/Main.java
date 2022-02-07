package test_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        str = str.replaceAll("\\D+","");
        int sum = 0;
        for (char c : str.toCharArray()){
            sum += Character.getNumericValue(c);
        }
        System.out.println(sum);
    }
}
