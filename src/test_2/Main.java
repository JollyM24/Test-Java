package test_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> mas = new ArrayList<>();

    public static void func(int c) {
        int a = 2;
        while (a <= c){
            if ((c % a) == 0) {
                if (a != c) {
                    mas.add(a);
                    func(c / a);
                } else {
                    mas.add(a);
                }
                return;
            }
            a++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int b = scanner.nextInt();

            func(b);

            for (int m: mas){
                System.out.print(m + " ");
            }
        } else {
            System.out.println("Invalid value");
        }
    }
}