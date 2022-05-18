//  All patterns 
package patterns;

import java.util.Scanner;

public class Patterns {
    static int row = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:  ");
        int n = sc.nextInt();
        sc.close();
        reset(1);
        // Pattern 1
        // ****
        // ****
        // ****
        // ****
        for (row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        reset(2);
        // Pattern 2
        // 1111
        // 2222
        // 3333
        // 4444
        for (row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
        // Pattern 3
        // 1234
        // 1234
        // 1234
        // 1234
        reset(3);
        for (row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        // Pattern 4
        // 4321
        // 4321
        // 4321
        // 4321
        reset(4);
        for (row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(n - col + 1);
            }
            System.out.println();
        }
        // Pattern 5
        // 1
        // 12
        // 123
        // 1234
        reset(5);
        for (row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        // Pattern 6
        // 1
        // 23
        // 345
        // 4567
        reset(6);
        for (row = 1; row <= n; row++) {
            int startNum = row;
            for (int col = 1; col <= row; col++) {
                System.out.print(startNum);
                startNum++;
            }
            System.out.println();
        }
        // Pattern 7
        // 1
        // 23
        // 456
        // 78910
        reset(7);
        // because we don't want to reset the startNum, so declared outside
        int startNum = 1;
        for (row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(startNum);
                startNum++;
            }
            System.out.println();
        }
        reset(8);
        // Pattern 8
        // A
        // AB
        // ABC
        // ABCD
        for (row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                char a = 'A';
                System.out.print((char) (a + col - 1));
            }
            System.out.println();
        }
        reset(9);
        // A
        // BC
        // DEF
        // GHIJ
        int start = 1;
        for (row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                char a = 'A';
                System.out.print((char) (a + start - 1));
                start++;
            }
            System.out.println();
        }
        reset(10);
        // A
        // BC
        // DEF
        // GHIJ
        int start1 = 1;
        for (row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                char a = 'A';
                System.out.print((char) (a + start1 - 1));
                start1++;
            }
            System.out.println();
        }
        // Pattern 11
        reset(11);
        //      *
        //     **
        //    ***
        //   ****
        // reverse
        for (row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Pattern 12
        reset(12);
        // ****
        // ***H
        // **HH
        // *HHH
        // opposite
        
        for (row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("S");
            }
            System.out.println();
        }
        // Pattern 13
        reset(13);
    //      1
    //     121
    //    12321
    //   1234321
        
        for (row = 1; row <= n; row++) {
            int s = 1;
            // first spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            // then numbers
            for (int col = 1; col <= row; col++) {
                System.out.print(s);
                s++;
            }
            // then decreasing numbers
            s = row - 1; // start with row - 1
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(s); 
                s--;
            }
            System.out.println();
        }

        
    }

    static void reset(Integer patternNumber) {
        row = 1;
        System.out.println("\nPattern " + patternNumber.toString());
    }
}
