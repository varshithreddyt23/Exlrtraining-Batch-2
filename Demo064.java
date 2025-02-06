import java.util.ArrayList;
public class Demo064 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("Original ArrayList: " + arrayList);
        swapFirstAndLast(arrayList);
        System.out.println("Modified ArrayList: " + arrayList);
    }

    public static void swapFirstAndLast(ArrayList<Integer> list) {
        if (list.size() > 1) {
            int first = list.get(0);
            int last = list.get(list.size() - 1);
            list.set(0, last);
            list.set(list.size() - 1, first);
        }
    }
}
