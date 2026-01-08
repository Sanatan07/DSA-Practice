public class Patterns {

    //Approach to solve the pattern problems

    /* 1. Number of lines = number of rows = number of times the outer for loop will run
       2. Identify for every row number - a. how many columns are there
                                          b.  Types of element in column
       3. What do you want to print
       
       Note: Try to build a formula to relate rows and columns
       */
    public static void main(String[] args) {
            // System.out.println("Pattern 1 is :");
            // pattern1(4);
            // System.out.println();
            // System.out.println("Pattern 2 is :");
            // pattern2(4);
            // System.out.println();
            // System.out.println("Pattern 3 is: ");
            // pattern3(4);
            // System.out.println();
            // System.out.println("Pattern 4 is: ");
            // pattern4(4);
            // System.out.println();
            // System.out.println("Pattern 5 is: ");
            // pattern5(4);
            // System.out.println();
            // System.out.println("Pattern 6 is: ");
            // pattern6(4);
            // System.out.println();
            // System.out.println("Pattern 7 is :");
            // pattern7(5);
            // System.out.println();
            // System.out.println("Pattern 8 is :");
            // pattern8(5);
            // System.out.println();
            // System.out.println("Pattern 9 is :");
            // pattern9(5);
            // System.out.println();
            // System.out.println("Pattern 10 is :");
            // pattern10(4);
            // System.out.println();
            System.out.println("Pattern 11 is :");
            pattern11(4);
            System.out.println();
    }

    static void pattern1 (int n){
        // * * * *
        // * * * *
        // * * * *
        // * * * *

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 


    static void pattern2(int n){
        // *
        // * *
        // * * *
        // * * * *

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    static void pattern3(int n){
        //        *
        //      * *
        //    * * *
        //  * * * *

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        // * * * *
        // * * * 
        // * * 
        // * 

        for(int i = 0; i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4

        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        //* 
        //* *   
        //* * *  
        //* * * * 
        //* * *  
        //* * 
        //*

        for(int i=0; i<2*n;i++){
            int totalcolsinrows = i>n ? 2*n-i:i;
            for(int j=0;j<totalcolsinrows;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        //   *
        //  ***
        // *****
        //*******

        for(int i=0;i<n;i++){
            for(int j=1;j<n-i ;j++)
            System.out.print(" ");
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        //*******
        // *****
        //  ***
        //   *

        for (int i = 0; i < n; i++) {
        // spaces
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        // stars
        for (int j = 0; j < 2 * (n - i) - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
    
    static void pattern9(int n){
        //    *
        //   * *
        //  * * *
        // * * * *

        for (int i = 0; i < n; i++) {
        // spaces
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        // stars
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    }

    static void pattern10(int n){
        // * * * *
        //  * * *
        //   * *
        //    *

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    static void pattern11(int n){
        // * * * *
        //  * * *
        //   * *
        //    *
        //    *
        //   * *
        //  * * *
        // * * * *
        //upper inverted
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower inverted
        for (int i = 0; i < n; i++) {
        // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
        // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
        System.out.println();
    }
        
    }

    static void pattern12(int n){
        // *********
        //  *     *
        //   *   *
        //    * *
        //     *  
        
    }

    static void pattern13(int n){
        //     *  
        //    * *
        //   *   *
        //  *     *
        // *********
        
    }

    static void pattern14(int n){
        //     *  
        //    * *
        //   *   *
        //  *     *
        //  *     *
        //   *   *
        //    * *
        //     *
        
    }


    //  *****
    //   ****
    //    ***
    //     **
    //      *



    //           1
    //         1   1
    //       1   2   1
    //     1   3   3   1
    //   1   4   6   4   1



//          1
//         212
//        32123
//       4321234
//        32123
//         212
//          1


// 18.   **********
//       ****  ****
//       ***    ***
//       **      **
//       *        *
//       *        *
//       **      **
//       ***    ***
//       ****  ****
//       **********


// 19.    *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *


// 20.    ****
//        *  *
//        *  *
//        *  *
//        ****

// 21.    1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15

// 22.    1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

// 23.        *      *
//          *   *  *   *
//        *      *      *

// 24.    *        *
//        **      **
//        * *    * *
//        *  *  *  *
//        *   **   *
//        *   **   *
//        *  *  *  *
//        * *    * *
//        **      **
//        *        *

// 25.       *****
//          *   *
//         *   *
//        *   *
//       *****

// 26.   1 1 1 1 1 1
//       2 2 2 2 2
//       3 3 3 3
//       4 4 4
//       5 5
//       6

// 27.   1 2 3 4  17 18 19 20
//         5 6 7  14 15 16
//           8 9  12 13
//             10 11



static void pattern28(int n) {
            // 28.      *
            //         * *
            //        * * *
            //       * * * *
            //      * * * * *
            //       * * * *
            //        * * *
            //         * *
            //          *

            for(int i=0; i<2*n;i++){
            int totalcolsinrows = i>n ? 2*n-i:i;

            int noOfSpaces = n - totalcolsinrows; 
            for(int j=0;j<noOfSpaces;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }


// 29.      
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *


// static void pattern30(int n) {
// // 30.         1
// //           2 1 2
// //         3 2 1 2 3
// //       4 3 2 1 2 3 4
// //     5 4 3 2 1 2 3 4 5

//         for (int i = 1; i <= n; i++) {
//             for (int j = 0; j<n-i;j++){
//                 System.out.print(" ");
//             }
//             for (int cols = i; cols>=1; cols--){
//                 System.out.print(cols + " ");
//             }
//             for()
            
//         }

// }


// 31.      4 4 4 4 4 4 4  
//          4 3 3 3 3 3 4   
//          4 3 2 2 2 3 4   
//          4 3 2 1 2 3 4   
//          4 3 2 2 2 3 4   
//          4 3 3 3 3 3 4   
//          4 4 4 4 4 4 4   

// 32.    E
//        D E
//        C D E
//        B C D E
//        A B C D E

// 33.    a
//        B c
//        D e F
//        g H i J
//        k L m N o
     
// 34.    E D C B A
//        D C B A
//        C B A
//        B A
//        A
       
// 35.    1      1
//        12    21
//        123  321
//        12344321

    

}



