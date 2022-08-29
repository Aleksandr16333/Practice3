public class Lesson2 {
    public static void main(String[] args) {

        int[] mas = new int [55];
        for(int i = 0, n = 1; i < mas.length; n = n + 2, i++) {
            mas[i] = n;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for(int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
    }
}
