

// Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.


public class Main {
  
  public static boolean hasZeroNeighbors(int[] nums) {
    if (nums.length < 2) {
      return false;
    }

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 0 && nums[i + 1] == 0) {

        return true;
      }
    }

    return false;
  }
public static void main(String[] args) {
  int[] arr = {2, 4, 6, 8, 0, 0};
  System.out.println(hasZeroNeighbors(arr));
}
}