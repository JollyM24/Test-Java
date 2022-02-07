package test_4;

import java.util.Scanner;

public class Main {
    public static void numbers(char a, int j){
        switch(a){
            case '0':
                switch(j){
                    case 0, 4: {
                        System.out.print(" *** ");
                    }
                    break;
                    case 1, 2, 3: {
                        System.out.print("*   *");
                    }
                    break;
                };
                break;
            case '1':
                switch(j){
                    case 0: {
                        System.out.print("***  ");
                    };
                    break;
                    case 1, 2, 3: {
                        System.out.print("  *  ");
                    };
                    break;
                    case 4: {
                        System.out.print("*****");
                    };
                    break;
                };
                break;
            case '2':
                switch(j){
                    case 0: {
                        System.out.print(" *** ");
                    }
                    break;
                    case 1: {
                        System.out.print("*   *");
                    }
                    break;
                    case 2: { System.out.print("   * ");} break;
                    case 3: {System.out.print("  *  ");} break;
                    case 4: { System.out.print("*****");} break;
                };
                break;
            case '3':
                switch(j){
                    case 0, 4: { System.out.print("*****");} break;
                    case 1, 3: {System.out.print("    *");} break;
                    case 2: {System.out.print("  ***");} break;
                };
                break;
            case '4':
                switch(j){
                    case 0, 4: { System.out.print("   * ");} break;
                    case 1: {System.out.print("  ** ");} break;
                    case 2: {System.out.print(" * * ");} break;
                    case 3: {System.out.print(" ****");} break;
                };
                break;
            case '5':
                switch(j){
                    case 0, 2, 4: { System.out.print("*****");} break;
                    case 1: {System.out.print("*    ");} break;
                    case 3: {System.out.print("    *");} break;
                };
                break;
            case '6':
                switch(j){
                    case 0, 2, 4: { System.out.print("*****");} break;
                    case 1: {System.out.print("*    ");} break;
                    case 3: {System.out.print("*   *");} break;
                };
                break;
            case '7':
                switch(j){
                    case 0: { System.out.print("*****");} break;
                    case 1, 2: {System.out.print("    *");} break;
                    case 3, 4: {System.out.print("  *  ");} break;
                };
                break;
            case '8':
                switch(j){
                    case 0, 2, 4: { System.out.print(" *** ");} break;
                    case 1, 3: {System.out.print("*   *");} break;};
                break;
            case '9':
                switch(j){
                    case 0, 2: { System.out.print("*****");} break;
                    case 1: {System.out.print("*   *");} break;
                    case 3: {System.out.print("   * ");} break;
                    case 4: {System.out.print("  *  ");} break;
                };
                break;
        };
        return;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer c = scanner.nextInt();

        char[] chars = ("" + c).toCharArray();

        for (int j=0; j < 5;j++){
            for (int i = 0; i < chars.length; i++){
                numbers(chars[i], j);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
