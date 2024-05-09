public class App {
    public static void main(String[] args) {
        int array [] = new int[50];
        int j = 1;
        for (int i=0; i<array.length; i++){
            array[i] = j;
            j+=2;
        }
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}