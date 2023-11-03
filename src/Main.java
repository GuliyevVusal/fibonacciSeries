import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fibonacci2();
//        Scanner sc = new Scanner(System.in);
//        int f = sc.nextInt();
//        int[] numbersF = new int[f];
//
//        numbersF[0] = 0;
//        numbersF[1] = 1;
//
//        for (int i = 2; i < numbersF.length; i++) {
//            numbersF[i] = numbersF[i - 1] + numbersF[i - 2];
//        }
//        for (int j = 0; j < numbersF.length; j++) {
//            System.out.print(numbersF[j] + " ");
            // ilk for-da 2 den basliyiriq cunki ilk hesablayacagimiz element 2-ci elementdir
            // [0] ve [1]- ci elementler hesablanib artiq elan etmisem
            // Sonra numbersF [i] elementi yeni 2 ci elementi =  numbersF [i-1] ozunden 1 onceki element
            // numbersF [i-2] yeni ozunden 1 oncekini ve 2 oncekinin cemi
            // 2-ci elementden basliyiriq hesablamaga  [i-1] yeni 2-1 = 1-ci element
            //ve [i-2] yeni 2-2 = 0-ci elementi topla
            // run etdikde 10 daxil etsek [0,1,0,0,0,0,0,0,0,0] bele hesablayacaq
        }
//    }

    public static void fibonacci2() {
        Scanner sc = new Scanner(System.in);

        int number;
        int firstElem = 0, secondElem = 1, thirdElem;
        System.out.print("Enter numbers: ");
        number = sc.nextInt();
        System.out.print(firstElem + " " + secondElem + " ");

        for (int i = 3; i <= number; i++) {
            thirdElem = firstElem + secondElem;
            System.out.print(thirdElem + " ");
            firstElem = secondElem;
            secondElem = thirdElem;
            //consoldan 10 daxil etdik firstElem = 1; secondElem = 1; number = 10; i =3; thirdElem=3; baslayanda
            // firtsElem 1 + secondElem 1 = thirdElem 2;
            // secondElem-1 dir = thirdElem-2 dir  deyisdi yerlerini qalxdi fora i-4 den basladi artiq
            // firstElem 1 + secondElem 2 = thirdElem cap etdi 3;
            //firstElem = 1; secondElem = 2;
            //secondElem = 2 thirdElem = 3; deyisdi yerlerini secondElem = 3;
            //qalxdi fora i =5; den firstElem = 2; secondElem =3; topladi atdi thirdElem =5;
            //firstElem = 2; secondElem = 3;
            //secondElem = 3; thirdElem = 5; deyisdi yerlerini secondElem = 5; qalxdi fora i = 6 dan;
            //firstElem = 3; + secondElem = 5;  thirdElem = 8;
            //secondElem = 5; thirdElem = 8; deyisdi secondElem = 8; qalxdi fora i = 7 den
            //firstElem = 5; + secondElem = 8;  thirdElem = 13;
            //secondElem = 8; thirdElem = 13 deyisdi secondElem = 13; qalxdi fora i = 8 den
            //firstElem = 8; + secondElem = 13; thirdElem = 21;
            //secondElem = 13; thirdElem = 21; deyisdi secondElem = 21; qalxdi fora i = 9 dan
            //firstElem = 13; + secondElem = 21; thirdElem = 34;
            //secondElem = 21; thirdElem = 34; deyisdi secondElem = 34; qalxdi fora 1 = 10 finish
        }
    }
}