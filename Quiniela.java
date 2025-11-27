import java.lang.Math;

class Quiniela {
    public static void main(String args []) {
       String res;
       int a1 = (int) (Math.random() * 3);

       //partido 1

       if (a1 == 0) {
           res = "1";
        } else if (a1 == 1) {
           res = "x";
        } else {
           res = "2";
        }
        System.out.println("Atlético - Betis:\t" + res);

        //partido 2
        int a2 = (int) (Math.random() * 3);

        if (a2 == 0) {
            res = "1";
        } else if (a2 == 1) {
            res = "x";
        } else {
            res = "2";
        }
        System.out.println("Getafe - Valencia:\t" + res);

        //partido 3
        int a3 = (int) (Math.random() * 3);

        if (a3 == 0) {
            res = "1";
        } else if (a3 == 1) {
            res = "x";
        } else {
            res = "2";
        }
        System.out.println("Real Madrid - Barça:\t" + res);

       
    }
}