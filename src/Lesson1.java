public class Lesson1 {
    public static void main(String[] args) {

        int[] mas = new int[10];
        for(int i = 0, n = 6; i < mas.length; n = n + 2, i++) {
            mas[i] = n;
            System.out.println(mas[i]);
        }
        for(int i = 0; i < mas.length; i++)
        {
            System.out.print(mas[i] + " ");
        }
    }

}
