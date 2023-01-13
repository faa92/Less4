import java.util.Arrays;
import java.util.Scanner;

public class Lesson4 {
    public static void main (String[] args){
// Таблица умножения
//        for (int i = 1;i <= 9 ; i++){
//            for (int j = 1; j < 9; j++ ){
//                System.out.println(i + "*" + j + "=" + i * j + "\t");
//            }
//        }
//        System.out.println("\n");

        //    задача банк
        Scanner scaner = new Scanner (System.in);
        System.out.println("Enter amount: ");
        double amount = scaner.nextDouble();
        System.out.println("Enter month: ");
        int months = scaner.nextInt();

        double payment = amount/months;

        for (int i= 0; i < months; i++); {
            double percent = amount/100*7;
            System.out.println("Payment = " + payment  + "percent = " + percent);

        }

        // сортировка масива
//        int[] ints = {9,2,15,7,9} ;
//        Arrays.sort(ints);
//        System.out.println(Arrays.toString((ints)));
//        System.out.println(result);




    }
}