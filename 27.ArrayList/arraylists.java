import java.util.ArrayList;

public class arraylists {
  public static void main(String[] args) {
    ArrayList<Integer> arr= new ArrayList<>();

    arr.add(1);
    arr.add(2);
    arr.add(3);
    // arr.set(0,23);
    arr.remove(0);
    System.out.println(arr);
    System.out.println(arr.size());
    System.out.println(arr.contains("Apple"));

  }
}
