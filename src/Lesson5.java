import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {

        System.out.print("Введите длину первого массива: ");
        Scanner sc = new
                Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Введите длину второго массива: ");
        int m = sc.nextInt();

        int[] mas1 = new int[n], mas2 = new int[m];
        int s1 = 0, s2 = 0;
        double a1, a2;

        for (int i = 0;i < mas1.length; i ++) {
            mas1[i] = (int)
                    (Math.random() * 9);
            s1 = s1 + mas1[i];
            System.out.print(mas1[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < mas2.length; i++) {
            mas2[i] = (int)
                    (Math.random() * 9);
            s2 = s2 + mas2[i];
            System.out.print(mas2[i] + " ");
        }
        System.out.println();
        a1 = (double) s1 / n;
        a2 = (double) s2 / m;
        System.out.println("Среднее арифметическое первого массива = " + a1);
        System.out.println("Среднее арифметическое второго массива = " + a2);

        if(a1 < a2) {
            System.out.println("Среднее арифметическое первого массива меньше среднего арифметического второго массива");
        } else if(a2 < a1) {
            System.out.println("Среднее арифметическое второго массива меньше среднего арифметического первого массива");
        } else {
            System.out.println("Средние арифметические равны друг другу");
        }
    }
}
