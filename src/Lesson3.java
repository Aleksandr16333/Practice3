public class Lesson3 {
    public static void main(String[] args) {

        int[] mas = new int[12];
        int j = 0;
        for(int i = 0; i < mas.length; i++) {
            mas[i] = (int)
                    (Math.random() * 8);
        }
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] % 2 == 0) {
                j++;
            }
            System.out.print(mas[i] + " ");
        }
        System.out.println("\n Кол-во четных чисел: " + j);
    }
}
