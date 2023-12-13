import java.util.ArrayList;
import java.util.List;

/**
 * User: Sandeera Jayampathi (DS)
 * Date: 12/12/2023
 * Time: 5:20 AM
 */
public class Hashtable {
    private int size = 7;
    private Node[] dataMap;

    public Hashtable() {
        dataMap = new Node[size];
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + " : ");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("  {" + temp.key + "=" + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return 0;
    }

    public List<String> keys() {
        List<String> keyList = new ArrayList<>();
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                keyList.add(temp.key);
                temp = temp.next;
            }
        }
        return keyList;
    }
}
