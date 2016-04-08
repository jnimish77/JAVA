import java.util.*;

class SortedRabbit implements Comparator<CompType2> {
  public int compare(CompType2 o1, CompType2 o2) {
    return (o1.height < o2.height ? -1 : (o1.height == o2.height ? 0 : 1));
  }
}

class CompType2 {
  int weight; int height;
  public CompType2(int n1, int n2) { weight = n1; height = n2; }
  public String toString() {
    String result = "[weight = " + weight + ", height = " + height + "]";
    return result;
  }
  public static void main(String[] args) {
    CompType2[] a = {new CompType2(3, 4), new CompType2(1, 10), new CompType2(7, 2)};
    System.out.println("$ Java SortedRabbits:");
    System.out.println();
    System.out.println("$ before sorting:");
    System.out.println(Arrays.toString(a));
    Arrays.sort(a, new SortedRabbit());
    System.out.println("$ after sorting:");
    System.out.println(Arrays.toString(a));
  }
}
