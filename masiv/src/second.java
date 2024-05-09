
public class second {
    public static void main(String[] args) {
        int array [] = new int [20];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 10);
        }
        System.out.println("Початковий масив : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < array.length; i+=2){
            array[i] = 0;
        }
        System.out.println("Оновлений масив : ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}