import java.util.ArrayList;

public class Node {
    public int value;
    public ArrayList<Integer> pointers;

    public Node(int value) {
        this.value = value;
        pointers = new ArrayList<>();
    }

    public void addPointer(int add) {
        pointers.add(add);
    }
}
