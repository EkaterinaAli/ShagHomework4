package homework4;
//Алисионок Екатерина

import java.util.Scanner;

public class Start4 {
    public static void main(String[] args) {

       /* //If8◦Даны два числа. Вывести вначале большее, а затем меньшее из них.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            System.out.println(a);
            System.out.println(b);
        }   else { System.out.println(b);
                   System.out.println(a); }
                           */
        /*// If10. Даны две переменные целого типа: A и B. Если их значения не равны,
        //то присвоить каждой переменной сумму этих значений, а если равны,
        //то присвоить переменным нулевые значения. Вывести новые значения переменных A и B.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a != b) { a = a+b;
                      b = a;
                      }
        else { a = 0;
               b = 0;
               }
        System.out.println(a);
        System.out.println(b);
                 */

        /*// If13. Даны три числа. Найти среднее из них (то есть число, расположенное между наименьшим и наибольшим).
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res = 0;
        if ( a < b && b < c || a > b && b >c) res = b;
        else
            if (b < a && a < c || b > a && a > c) res = a;
            else
                if (b < c && c < a || b > c && c > a ) res = c;
        System.out.println(res);
                 */

        //If20. На числовой оси расположены три точки: A, B, C. Определить, какая из
        //двух последних точек (B или C) расположена ближе к A, и вывести эту точку и ее расстояние от точки A

        /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (Math.abs(a - b) < Math.abs(a - c)) {
            System.out.println( "Ближняя точка B: " + b);
            int res = Math.abs (a - b);
            System.out.println("Расстояние до точки А:  " + res );
        }
        else {System.out.println( "Ближняя точка C: " + c);
            int res = Math.abs (a - c);
            System.out.println("Расстояние до точки А:  " + res );
        }
                 */
        /*//If21. Даны целочисленные координаты точки на плоскости. Если точка совпадает с началом координат,
        // то вывести 0. Если точка не совпадает с началом координат, но лежит на оси OX или OY,
        // то вывести соответственно 1 или 2. Если точка не лежит на координатных осях, то вывести 3.

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();


        if (x == 0 && y == 0 )
            System.out.println( "Точка находится : " + 0);
            else  if (x == 0) System.out.println("Точка находится на 0X : " + 1);
            else  if (y == 0) System.out.println("Точка находится на 0Y : " + 2);
            else System.out.println("Точка не лежит на кардинатных осях: " + 3);
                     */

        /*//If24. Для данного вещественного x найти значение следующей функции f, принимающей вещественные значения:
        //f (x) = 2·sin(x), если x > 0, 6 − x, если x ≤ 0.

        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double f;

        if ( x > 0) {
            f = 2 * Math.sin(x);
        }
        else {
            f = 6 - x;
        }
        System.out.println("Значение функции: " + f);
         */
       /*
        //If26. Для данного вещественного x найти значение следующей функции f, принимающей вещественные значения:
        //f (x) = −x, если x ≤ 0,
        //f (x) = x2, если 0 < x < 2,
        //f (x) = 4, если x ≥ 2.

        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double f ;
        if ( x <= 0)  f = -1*(x);
        else if ( 0 < x && x < 2) f = x*x;
        else  f = (int) 4;
        System.out.println("Значение функции: " + f);
    }
}