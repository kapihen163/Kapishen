package Lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        Rectangle ();
        System.out.println();
        Rectangle1();
        System.out.println();
        Rectangle2();
        System.out.println();
        Rectangle3();
    }
    static void Rectangle (){
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("* ");
                } else if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
     static void Rectangle1() {
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                if (i == 5 || j == 0 ) {
                    System.out.print("* ");
                } else if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void Rectangle2() {
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){

                if (i == 0 || i == 5 || j == 0 || j == 5 || i == 1 || i == 4 || j == 1 || j== 4){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void Rectangle3() {
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 6; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 6; j++){
                if (j < 2){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}

// Демонстрация двумерного массива,
//class TwoD {
//    public static void main(String[] args)  {
//        int t, i;
//        int table [][] = new int[6][6];
//        for(t=0; t < 6; t++) {
//            for(i=0; i < 6; i++) {
//                table[t][i] = (t*6)+i+1;
//                if (table[2][2] || table[2][3] || table[3][2] || table[3][3]){
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println() ;
//        }
//    }
//}
