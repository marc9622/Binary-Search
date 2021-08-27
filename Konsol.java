import java.util.Arrays;

public class Konsol {

  public static void main(String[] args) {
    if(args == null)
      return;
    int number = Integer.parseInt(args[0]);

    Konsol k = new Konsol();
    k.sort(number);
  }

  void sort(int number) {
    int[] array = createArray();
    System.out.println(Arrays.toString(array));
    System.out.println(binarySearch(array, number) + " was the index my algorithm found.");
    System.out.println(Arrays.binarySearch(array, number) + " was the index Java's built-in algorithm found.");
  }

  int[] createArray() {
    int[] array = new int[200];

    for(int i = 1; i < array.length; i++) {
      array[i] = array[i-1] + (int)(Math.random() * 3) + 1;
    }
    return Arrays.copyOfRange(array, 1, array.length);
  }

  int binarySearch(int[] array, int number) {
    //System.out.println(Arrays.toString(array));

    int middle = array.length / 2;

    if(array.length == 1 && array[0] != number)
      return 0;

    if(array[middle] == number)
      return middle;
    if(array[middle] < number)
      return middle + binarySearch(Arrays.copyOfRange(array, middle, array.length), number);
    if(array[middle] > number)
      return binarySearch(Arrays.copyOfRange(array, 0, middle), number);

    return 0;
  }
}
