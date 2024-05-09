
public class five {
    public static void main(String[] args) {
        int counter = 0;
        int array [] = new int [15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0)
                counter++;
        }
        System.out.println();
        System.out.println( "Кількість парних елементів у масиві - " + counter);
    }
}